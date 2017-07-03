package net.thingking.coding.leetcodeInJava;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by darlynn on 4/23/17.
 */
public class ArrayPartitionTest {
    @Test
    public void test() {
        int[] nums = {1,2,3,4};
        int result = ArrayPartition.arrayPairSum(nums);
        Assert.assertEquals(4, result);
    }
}
