package net.thingking.coding.leetcodeInJava;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by darlynn on 4/23/17.
 */
public class BrickWallTest {

    @Test
    public void test(){
        int[][] arrs= {{1,2,2,1},{3,1,2},{1,3,2},{2,4},{3,1,2},{1,3,1,1}};
        List<List<Integer>> wall = new ArrayList<>();
        for(int i=0; i<arrs.length; i++) {
            List elem = Arrays.asList(arrs[i]);
            wall.add(elem);
        }
        int result = BrickWall.leastBricks(wall);
        Assert.assertEquals(2, result);
    }
}
