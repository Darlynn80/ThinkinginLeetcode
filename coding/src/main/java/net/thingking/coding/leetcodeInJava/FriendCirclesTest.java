package net.thingking.coding.leetcodeInJava;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by darlynn on 5/4/17.
 */
public class FriendCirclesTest {

    @Test
    public void test1() {
        int[][] M = {{1,1,0},{1,1,0},{0,0,1}};
        int result = FriendCircles.friendCircleNum(M);
        Assert.assertEquals(result,2);
    }

    @Test
    public void test2() {
        int[][] M = {{1,1,0},{1,1,1},{0,1,1}};
        int result = FriendCircles.friendCircleNum(M);
        Assert.assertEquals(result,1);
    }
}
