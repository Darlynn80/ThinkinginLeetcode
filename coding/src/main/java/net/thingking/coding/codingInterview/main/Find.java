package net.thingking.coding.codingInterview.main;

/**
 * Created by darlynn on 9/15/17.
 */
public class Find {
    //force solution
    public static boolean find(int[][] array, int target) {
        if (array == null) {
            return false;
        }
        int row = array.length, col = array[0].length;
        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                if (array[i][j]==target)
                    return true;
            }
        }
        return false;
    }

    //optimized
    public static boolean find1(int[][] array, int target) {
        if (array==null) {
            return false;
        }
        int row = array.length, col = array[0].length;
        int cur_row =0 , cur_col=col;
        while(cur_row<row && cur_col>=0) {
            if (array[cur_row][cur_col]==target) {
                return true;
            }
            if (array[cur_row][cur_col]<target) {
                cur_row++;
            }
            if (array[cur_row][cur_col]>target) {
                cur_col--;
            }
        }
        return false;
    }
}
