package net.thingking.coding.leetcodeInJava;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by darlynn on 5/6/17.
 *
 * No.567 from www.leetcode.com
 *
 * Description:
 * Given two strings s1 and s2, write a function to return true if s2 contains the permutation of s1.
 * In other words, one of the first string's permutations is the substring of the second string.
 *
 * Note:
 * The input strings only contain lower case letters.
 * The length of both given strings is in range [1, 10,000].
 */

//Example 1:
//        Input:s1 = "ab" s2 = "eidbaooo"
//        Output:True
//        Explanation: s2 contains one permutation of s1 ("ba").
//Example 2:
//        Input:s1= "ab" s2 = "eidboaoo"
//        Output: False
public class PermutationInString {

    public static boolean checkInclusion(String s1, String s2) {
        Set<String> permu = FullPermutation.permutationByRecursion(s1,0,s1.length()-1);
        for (String s: permu) {
            if (s2.contains(s))
                return true;
        }
        return false;
    }

    public static boolean checkInclusion2(String s1, String s2) {
        return false;
    }

}
