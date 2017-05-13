package net.thingking.coding.leetcodeInJava;

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
public class Permutation {

    /**
     * @solution1: 递归实现
     * @principle： 从集合中依次选出每一个元素，作为排列的第一个元素，然后对剩余的元素进行全排列，如此递归处理，从而得到所有元素的全排列。
     * 以对字符串abc进行全排列为例，我们可以这么做：以abc为例
     * 固定a，求后面bc的排列：abc，acb，求好后，a和b交换，得到bac
     * 固定b，求后面ac的排列：bac，bca，求好后，c放到第一位置，得到cba
     * 固定c，求后面ba的排列：cba，cab。
     * */
    public static void 

}