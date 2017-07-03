package net.thingking.coding.leetcodeInJava;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by darlynn on 4/27/17.
 */
public class StudentAttendanceRecord1Test {
    @Test
    public void test(){
        String s = "PPALLP";
        boolean result = StudentAttendanceRecord1.checkRecord(s);
        Assert.assertEquals(true, result);
    }

    @Test
    public void test1() {
        String s = "PPALLLP";
        boolean result = StudentAttendanceRecord1.checkRecord(s);
        Assert.assertEquals(false, result);
    }
}
