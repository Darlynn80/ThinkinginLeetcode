package net.thingking.coding.leetcodeInJava;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by darlynn on 5/5/17.
 *
 * No.560 from www.leetcode.com
 *
 * Description:
 * Given an array of integers and an integer k, you need to find the total number of continuous subarrays whose sum equals to k.
 * Note:
 * The length of the array is in range [1, 20,000].
 * The range of numbers in the array is [-1000, 1000] and the range of the integer k is [-1e7, 1e7].
 */

//Input:nums = [1,1,1], k = 2
//        Output: 2

public class SubarraySum {
    public static int solution(int[] nums, int k) {
        int count=0;
        for (int i=0; i<nums.length; i++) {
            int sum = nums[i];
            if (sum==k) {
                count++;
            }
            for (int j=i+1; j<nums.length; j++) {
                sum += nums[j];
                if (sum == k)
                    count++;
            }
        }
        return count;
    }

    //use map
    public static int solution2(int[] nums, int k) {
        int count=0, sum=0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for (int i=0; i<nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum-k)) {
                count += map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
