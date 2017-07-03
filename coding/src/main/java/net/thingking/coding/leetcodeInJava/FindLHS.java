package net.thingking.coding.leetcodeInJava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by darlynn on 5/22/17.
 *
 * No.594. Longest Harmonious Subsequence from www.leetcode.com
 *
 * Description:
 * We define a harmonious array is an array where the difference between its maximum value and its minimum value is exactly 1.
 * Now, given an integer array, you need to find the length of its longest harmonious subsequence among all its possible subsequences.
 *
 * Note: The length of the input array will not exceed 20,000.
 */

//Example 1:
//        Input: [1,3,2,2,5,2,3,7]
//        Output: 5
//        Explanation: The longest harmonious subsequence is [3,2,2,2,3].

public class FindLHS {
    public static int solution(int[] nums) {
        Map<Long, Integer> map = new HashMap<>();
        for (long num: nums ) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        int result =0;
        for (long key: map.keySet()) {
            if (map.containsKey(key+1)) {
                result = Math.max(result, map.get(key+1)+map.get(key));
            }
        }
        return result;
    }


    public static int solution1(int[] nums) {
        int result=0,  start=0, min=nums[0], nextstart=1;
        Arrays.sort(nums);

        for (int i=1; i<nums.length; i++) {
            if (nums[i]-min>1) {
                start = nextstart++;
                min = nums[start];
                i--;   //unsafe , because i++ and i-- may occur deadlock
            }else if (nums[i]-min ==1) {
                result = Math.max(result, i-start+1);
                if (nums[i] != nums[i-1]) {
                    nextstart =i;
                }
            }
        }
        return result;
    }
}
