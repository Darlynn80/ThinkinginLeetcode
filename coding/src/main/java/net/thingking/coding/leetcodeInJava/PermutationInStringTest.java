package net.thingking.coding.leetcodeInJava;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by darlynn on 5/6/17.
 */
public class PermutationInStringTest {
    @Test
    public void test1() {
        String s1="ba", s2="eoabooob";
        boolean result = PermutationInString.checkInclusion(s1,s2);
        Assert.assertEquals(true, result);
    }

    @Test
    public void test2() {
        String s1="a", s2="ab";
        boolean result = PermutationInString.checkInclusion(s1,s2);
        Assert.assertEquals(true, result);
    }

    @Test
    public void test3() {
        String s1="ab", s2="eidbaooo";
        boolean result = PermutationInString.checkInclusion(s1,s2);
        Assert.assertEquals(true, result);
    }

    @Test
    public void test4() {
        String s1="abc", s2="bbbca";
        boolean result = PermutationInString.checkInclusion(s1,s2);
        Assert.assertEquals(true, result);
    }
}
