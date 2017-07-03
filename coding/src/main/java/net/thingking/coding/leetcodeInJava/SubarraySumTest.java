package net.thingking.coding.leetcodeInJava;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by darlynn on 5/5/17.
 */
public class SubarraySumTest {
    @Test
    public void test1() {
        int[] nums = {-1, -1, 1};
        int k = 1;
        int result = SubarraySum.solution(nums, k);
        Assert.assertEquals(1, result);
    }

    @Test
    public void test2() {
        int[] nums = {1, 1, 1};
        int k = 2;
        int result = SubarraySum.solution(nums, k);
        Assert.assertEquals(2, result);
    }

    @Test
    public void test3() {
        int[] nums = {1, 2, 3};
        int k = 3;
        int result = SubarraySum.solution(nums, k);
        Assert.assertEquals(2, result);
    }

    @Test
    public void test4() {
        int[] nums = {1};
        int k = 1;
        int result = SubarraySum.solution(nums, k);
        Assert.assertEquals(1, result);
    }

    @Test
    public void test5() {
        int[] nums = {1, -1, 1, 20000};
        int k = 1;
        int result = SubarraySum.solution(nums, k);
        Assert.assertEquals(1, result);
    }
}
