package net.thingking.coding.leetcodeInJava;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by darlynn on 4/17/17.
 *
 * No.554 from www.leetcode.com
 *
 * Description:
 * There is a brick wall in front of you. The wall is rectangular and has several rows of bricks.
 * The bricks have the same height but different width.
 * You want to draw a vertical line from the top to the bottom and cross the least bricks.
 *
 * The brick wall is represented by a list of rows.
 * Each row is a list of integers representing the width of each brick in this row from left to right.
 *
 * If your line go through the edge of a brick, then the brick is not considered as crossed.
 * You need to find out how to draw the line to cross the least bricks and return the number of crossed bricks.
 *
 * You cannot draw a line just along one of the two vertical edges of the wall, in which case the line will obviously cross no bricks.
 *
 * Notes:
 * 1. The width sum of bricks in different rows are the same and won't exceed INT_MAX.
 * 2. The number of bricks in each row is in range [1,10,000].The height of wall is in range [1,10,000].Total number of bricks of the wall won't exceed 20,000.
 */
// Input:
// [[1,2,2,1],
// [3,1,2],
// [1,3,2],
// [2,4],
// [3,1,2],
// [1,3,1,1]]
// Output: 2
public class BrickWall {

    public static int leastBricks(List<List<Integer>> wall) {
        if(wall.size()==0)
            return 0;
        int count=0;
        //We want to cut from the edge of the most common location among all the levels,
        // hence using a map to record the locations and their corresponding occurrence.
        Map map = new HashMap<Integer, Integer>();
        for(List<Integer> list: wall) {
            int length = 0;
            for (int i=0; i<list.size()-1; i++) {
                length += list.get(i);
                map.put(length,(int)map.getOrDefault(length, 0)+1);
                count = Math.max(count, (Integer) map.get(length));
            }
        }
        return wall.size()-count;
    }
}
