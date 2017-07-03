package net.thingking.coding.leetcodeInJava;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by darlynn on 4/24/17.
 */
public class OptimalDivisionTest {
    @Test
    public void test() {
        int[] nums = {1000,100,10,2};
        String result = OptimalDivision.optimalDivision(nums);
        Assert.assertEquals("1000/(100/10/2)", result);
    }
}
