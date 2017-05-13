package net.thingking.coding.codingInterview;

/**
 * Created by darlynn on 3/23/17.
 *
 * Singleton Pattern with the most common way.
 */
public class Singleton {
    // private and static field
    private static Singleton instance = null;

    // private construction so that can't new an object
    private Singleton() {

    }

    // static Inner class
    private static class LazyHolder{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return LazyHolder.INSTANCE;
        new LazyHolder();
    }
}
