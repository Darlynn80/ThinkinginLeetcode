package net.thingking.coding.leetcodeInJava;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by darlynn on 4/23/17.
 */
public class NearestPalindromicTest {
    @Test
    public void test() {
        String origin = "1223";
        String result = NearestPalindromic.nearestPalindromic(origin);
        Assert.assertEquals("1221", result);
    }

    @Test
    public void test1(){
        String origin = "10";
        String result = NearestPalindromic.nearestPalindromic(origin);
        Assert.assertEquals("9",result);
    }

    @Test
    public void test2(){
        String origin  ="807045053224792883";
        String result = NearestPalindromic.nearestPalindromic(origin);
        Assert.assertEquals("80700450505400708",result);
    }
}
