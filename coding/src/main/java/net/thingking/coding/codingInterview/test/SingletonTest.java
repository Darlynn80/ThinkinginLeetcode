package net.thingking.coding.codingInterview.test;

import net.thingking.coding.codingInterview.main.Singleton;
import org.junit.Test;

/**
 * Created by darlynn on 3/23/17.
 */

public class SingletonTest {
    private class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("test singleton...");
            Singleton.getInstance();
        }
    }
    @Test
    public void testGetInstance() {

        Thread t = new MyThread();
        Thread t1 = new MyThread();
        t.start();
        t1.start();
    }
}
