package net.thingking.coding.leetcodeInJava;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by darlynn on 4/16/17.
 *
 * Test for ReverseWords
 */
public class ReverseWordsTest {
    @Test
    public void test(){
        String s = "Let's take LeetCode contest";
        String result = ReverseWords.reverseWords(s);
        System.out.println(result);
        Assert.assertEquals(result, "s'teL ekat edoCteeL tsetnoc");
    }
}
