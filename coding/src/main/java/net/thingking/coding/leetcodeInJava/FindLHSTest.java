package net.thingking.coding.leetcodeInJava;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by darlynn on 5/22/17.
 */
public class FindLHSTest {
    @Test
    public void test() {
        int[] nums = {1, 5,3,2,2,4,2,3};
        int result = FindLHS.solution(nums);
        Assert.assertEquals(result, 5);
    }
}
