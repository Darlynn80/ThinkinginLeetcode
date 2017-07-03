package net.thingking.coding.leetcodeInJava;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by darlynn on 4/16/17.
 *
 * Test for NextGreaterElement No.556
 */
public class NextGreaterElementTest {

    @Test
    public void test(){
        int num = 112;
        int result = NextGreaterElement.nextGreaterElement(num);
        Assert.assertEquals(211, result);
    }

    @Test
    public void test1(){
        int num = 101;
        int result = NextGreaterElement.nextGreaterElement(num);
        Assert.assertEquals(110, result);
    }

    @Test
    public void boundaryTest(){
        int num = 9;
        int result = NextGreaterElement.nextGreaterElement(num);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void solutionTest() {
        int num = 12222333;
        int result = NextGreaterElement.solution2(num);
        Assert.assertEquals(12223233,result);
    }

    @Test
    public void solutionTest1() {
        int num = 10000;
        int result = NextGreaterElement.solution2(num);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void solutionTest2() {
        int num = 12443322;
        int result = NextGreaterElement.solution2(num);
        Assert.assertEquals(13222344, result);
    }
}
