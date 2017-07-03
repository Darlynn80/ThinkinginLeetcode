package net.thingking.coding.leetcodeInJava;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by darlynn on 5/8/17.
 *
 * 字符串的全排列算法
 *
 * 题目描述
 * 输入一个字符串，打印出该字符串中字符的所有排列。
 * 例如输入字符串abc，则输出由字符a、b、c 所能排列出来的所有字符串
 * abc、acb、bac、bca、cab 和 cba。
 */
public class FullPermutation {
    private static Set<String> allPermutation = new HashSet<>();

    /**
     * @solution1: 递归实现
     * @principle： 从集合中依次选出每一个元素，作为排列的第一个元素，然后对剩余的元素进行全排列，如此递归处理，从而得到所有元素的全排列。
     * 以对字符串abc进行全排列为例，我们可以这么做：以abc为例
     * 固定a，求后面bc的排列：abc，acb，求好后，a和b交换，得到bac
     * 固定b，求后面ac的排列：bac，bca，求好后，c放到第一位置，得到cba
     * 固定c，求后面ba的排列：cba，cab。
     * */
    public static Set<String> permutationByRecursion(String perm, int from, int to) {
        Set<String> results = new HashSet<>();
        char[] chs = perm.toCharArray();
        calAllPermutation(chs, 0, chs.length-1);
        return allPermutation;
    }
    public static void calAllPermutation(char[] chs, int from, int to) {
         if (to<=1) {
             allPermutation.add(new String(chs));
         }
         if (from==to) {
             allPermutation.add(new String(chs));
         }else {
             for (int i=from; i<=to; i++) {
                 char tmp = chs[i];
                 chs[i] = chs[from];
                 chs[from] = tmp;
                 calAllPermutation(chs, from + 1, to);
                 tmp = chs[i];
                 chs[i] = chs[from];
                 chs[from] = tmp;
             }
         }
    }

    public Set<String> getAllPermutation() {
        return allPermutation;
    }

    public void setAllPermutation(Set<String> allPermutation) {
        this.allPermutation = allPermutation;
    }

    /**
     * @solution2: 字典序排列
     * @principle：
     *
     * */



    public static void main(String[] args) {
        System.out.println(permutationByRecursion("abc",0,2));
    }
}
