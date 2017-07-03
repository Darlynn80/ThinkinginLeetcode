package net.thingking.coding.leetcodeInJava;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by darlynn on 5/6/17.
 */
public class ReshapeMatrixTest {
    @Test
    public void test1() {
        int[][] nums = {{1,2},{3,4}};
        int r=1, c=4;
        int[][] result = ReshapeMatrix.solution(nums, r, c);
        Assert.assertEquals(result, new int[][]{{1, 2, 3, 4}});
    }

    @Test
    public void test2() {
        int[][] nums = {{1,2},{3,4}};
        int r=2, c=4;
        int[][] result = ReshapeMatrix.solution(nums, r, c);
        Assert.assertEquals(result, new int[][]{{1,2},{3,4}});
    }

    @Test
    public void test3() {
        int[][] nums = {{1,2,3,4}};
        int r=2, c=2;
        int[][] result = ReshapeMatrix.solution(nums, r, c);
        Assert.assertEquals(result, new int[][]{{1,2},{3,4}});
    }

    @Test
    public void test4() {
        int[][] nums = {{1,2},{3,4}};
        int r=1, c=4;
        int[][] result = ReshapeMatrix.solution2(nums, r, c);
        Assert.assertEquals(result, new int[][]{{1, 2, 3, 4}});
    }

    @Test
    public void test5() {
        int[][] nums = {{1,2},{3,4}};
        int r=2, c=4;
        int[][] result = ReshapeMatrix.solution2(nums, r, c);
        Assert.assertEquals(result, new int[][]{{1,2},{3,4}});
    }

    @Test
    public void test6() {
        int[][] nums = {{1, 2, 3, 4}};
        int r = 2, c = 2;
        int[][] result = ReshapeMatrix.solution2(nums, r, c);
        Assert.assertEquals(result, new int[][]{{1, 2}, {3, 4}});
    }
}
