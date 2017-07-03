package net.thingking.coding.leetcodeInJava;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by darlynn on 5/1/17.
 */
public class StudentAttendenceRecord2Test {
    @Test
    public void test() {
        int n = 2;
        int result = StudentAttendanceRecord2.checkRecord(n);
        Assert.assertEquals(result, 8);
    }
}
