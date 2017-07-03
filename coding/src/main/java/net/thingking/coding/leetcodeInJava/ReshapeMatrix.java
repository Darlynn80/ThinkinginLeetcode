package net.thingking.coding.leetcodeInJava;

/**
 * Created by darlynn on 5/6/17.
 *
 * No.566 from www.leetcode.com
 *
 * Description:
 * In MATLAB, there is a very useful function called 'reshape', which can reshape a matrix into a new one with different size but keep its original data.
 * You're given a matrix represented by a two-dimensional array, and two positive integers r and c representing the row number and column number of the wanted reshaped matrix, respectively.
 * The reshaped matrix need to be filled with all the elements of the original matrix in the same row-traversing order as they were.
 * If the 'reshape' operation with given parameters is possible and legal, output the new reshaped matrix;Otherwise, output the original matrix.
 *
 * Note:
 * The height and width of the given matrix is in range [1, 100].
 * The given r and c are all positive.
 */

//Example 1:
//        Input:
//        nums =
//        [[1,2],
//        [3,4]]
//        r = 1, c = 4
//        Output:
//        [[1,2,3,4]]
//        Explanation:
//        The row-traversing of nums is [1,2,3,4]. The new reshaped matrix is a 1 * 4 matrix, fill it row by row by using the previous list.
//Example 2:
//        Input:
//        nums =
//        [[1,2],
//        [3,4]]
//        r = 2, c = 4
//        Output:
//        [[1,2],
//        [3,4]]
//        Explanation:
//        There is no way to reshape a 2 * 2 matrix to a 2 * 4 matrix. So output the original matrix.

public class ReshapeMatrix {
    public static int[][] solution(int[][] nums, int r, int c) {
        int row_len=nums.length, col_len=nums[0].length;
        if (r*c != row_len*col_len) {
            return nums;
        }
        int[][] new_matrix = new int[r][c];
        int x=0, y=0;
        for (int i=0; i<row_len; i++) {
            for (int j=0; j<col_len; j++) {
                if (y>=c  && y%c==0) {
                    x++;
                }
                new_matrix[x][(y++)%c] = nums[i][j];

            }
        }
        return new_matrix;
    }

    // one loop
    public static int[][] solution2(int[][] nums, int r,int c) {
        int m=nums.length, n=nums[0].length;
        if (r*c != m*n) {
            return nums;
        }
        int[][] reshaped = new int[r][c];
        for (int i=0; i<r*c; i++) {
            reshaped[i/c][i%c] = nums[i/n][i%n];
        }
        return reshaped;
    }
}
