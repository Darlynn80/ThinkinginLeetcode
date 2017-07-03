package net.thingking.coding.leetcodeInJava;

/**
 * Created by darlynn on 4/16/17.
 *
 * No.557 problem from www.leetcode.com
 *
 * Description:
 * Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
 *
 * Example 1:
 * Input: "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoc"
 */

public class ReverseWords {
    public static String reverseWords(String s) {
        String[] fragments = s.split(" ");
        s = "";
        for (int i=0; i<fragments.length; i++) {
            String replacement = reverseString(fragments[i]);
            if(i == fragments.length-1) {
                s += replacement;
            }else{
                s += replacement +" ";
            }
        }
        return s;
    }
    public static String reverseString(String s) {
        char[] chs = s.toCharArray();
        int len = chs.length;
        for(int i=0; i<len/2; i++) {
            char tmp = chs[i];
            chs[i] = chs[len-1-i];
            chs[len-1-i] = tmp;
        }
        return new String(chs);
    }
}
