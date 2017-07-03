package net.thingking.coding.leetcodeInJava;

import java.math.BigDecimal;

/**
 * Created by darlynn on 4/23/17.
 *
 * No.564 from www.leetcode.com
 *
 * Description:
 * Given an integer n, find the closest integer (not including itself), which is a palindrome.
 * The 'closest' is defined as absolute difference minimized between two integers.
 *
 * Notes:
 * The input n is a positive integer represented by string, whose length will not exceed 18.
 * If there is a tie, return the smaller one as answer.
 */
//        Input: "123"
//        Output: "121"

public class NearestPalindromic {
    public static String nearestPalindromic(String n) {
        char[] chs = n.toCharArray();
        int len = chs.length;
        int i=0, j=len-1;
        if(len<=2){
            if(Integer.valueOf(n)<=10){
                return Integer.valueOf(n)-1+"";
            }
        }
        while(i<=j) {
            if(chs[i]!=chs[j]) {
                chs[j] = chs[i];
            }
            i++;
            j--;
        }
        return new String(chs);
    }
}
