package net.thingking.coding.leetcodeInJava;

import java.util.Arrays;

/**
 * Created by darlynn on 4/23/17.
 *
 * No.561 from www.leetcode.com
 *
 * Description:
 * Given an array of 2n integers,
 * your task is to group these integers into n pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn)
 * which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
 *
 * Notes:
 * 1. n is a positive integer, which is in the range of [1, 10000].
 * 2. All the integers in the array will be in the range of [-10000, 10000].
 */

//Input: [1,4,3,2]
//
//        Output: 4
//        Explanation: n is 2, and the maximum sum of pairs is 4.
public class ArrayPartition {

    public static int arrayPairSum(int[] nums) {
        /**
         * 1. sort the array
         * 2. the max is the number which the index is 2i-th for all i from 0 to n-1.
         * */
        Arrays.sort(nums);
        int maxisum = 0;
        for(int i=0; i<nums.length; i=i+2) {
            maxisum += nums[i];
        }
        return maxisum;
    }
}
