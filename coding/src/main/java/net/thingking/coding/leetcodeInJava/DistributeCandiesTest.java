package net.thingking.coding.leetcodeInJava;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by darlynn on 5/20/17.
 */
public class DistributeCandiesTest {
    @Test
    public void test() {
        int[] candies = {1,1,2,2,3,3};
        int result = DistributeCandies.solution(candies);
        Assert.assertEquals(3, result);
    }

    @Test
    public void test1() {
        int[] candies = {1,1,1,2};
        int result = DistributeCandies.solution(candies);
        Assert.assertEquals(2, result);
    }
}
