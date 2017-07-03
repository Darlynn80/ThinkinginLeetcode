package net.thingking.coding.leetcodeInJava;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by darlynn on 5/20/17.
 */
public class UnsortedSubarrayTest {
    @Test
    public void test(){
        int[]  A = {2, 6, 4, 8, 10, 9, 15};
        int result = UnsortedSubarray.solution(A);
        Assert.assertEquals(result,5);
    }
}
