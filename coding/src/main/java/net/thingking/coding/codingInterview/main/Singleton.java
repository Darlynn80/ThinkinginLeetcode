package net.thingking.coding.codingInterview.main;


import java.io.Serializable;
import java.lang.management.OperatingSystemMXBean;

/**
 * Created by darlynn on 3/23/17.
 *
 * Singleton Pattern with the most common way.
 */

// Perfect
public class Singleton {
    // private and static field
    private static Singleton instance = null;

    // private construction so that can't new an object
    private Singleton() { }

    // static Inner class
    private static class LazyHolder{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return LazyHolder.INSTANCE;
    }
}

// EnumSingleton
enum EnumSingleton {
    INSTANCE;

    public void whateverMethod() { }
}

// Unsafe : Multi-Thread Unsupported
class Singleton1 {
    private static Singleton1 instance = null;

    private Singleton1() { }

    public static Singleton1 getInstance() {
        if(instance == null){
            instance = new Singleton1();
        }
        return instance;
    }
}

// Optimized : Multi-Thread Supported, but less effectiveness
class SingletonOpt1 {
    private static SingletonOpt1 instance = null;

    private SingletonOpt1() { }

    public static synchronized SingletonOpt1 getInstance() {
        if (instance == null) {
            instance = new SingletonOpt1();
        }
        return instance;
    }
}

// Optimized : Multi-Thread Supported
class SingletonOpt2 {
    private static SingletonOpt2 instance = null;

    private SingletonOpt2() { }

    public static SingletonOpt2 getInstance() {
        if (instance == null) {
            synchronized (SingletonOpt2.class) {
                if (instance == null){
                    instance = new SingletonOpt2();
                }
            }
        }
        return instance;
    }
}

// Optimized : avoid reflection
class  Singleton2 {
    private static Singleton2 instance = new Singleton2();

    private Singleton2() { }

    public static Singleton2 getInstance() { return instance; }
}

class  Singleton2Opt {
    private final static Singleton2Opt instance = new Singleton2Opt();

    private Singleton2Opt() { }

    public static Singleton2Opt getInstance() { return instance; }
}





/*
/<Summary>
/ Optimized :
/ 1.如果单例由不同的类装载器装入，那便有可能存在多个单例类的实例。
/   假定不是远端存取，例如一些servlet容器对每个servlet使用完全不同的类装载器，这样的话如果有两个servlet访问一个单例类，它们就都会有各自的实例。
/ 2.如果Singleton实现了java.io.Serializable接口，那么这个类的实例就可能被序列化和复原。
/   不管怎样，如果你序列化一个单例类的对象，接下来复原多个那个对象，那你就会有多个单例类的实例。
/</Summary>
*/

class OptimizedSingleton{
    private static OptimizedSingleton instance = null;

    private  OptimizedSingleton() { }

    public static class InstanceHolder {
        public static final OptimizedSingleton INSTANCE = new OptimizedSingleton();
    }

    public static OptimizedSingleton getInstance() { return InstanceHolder.INSTANCE; }

    // Optimized : when Singleton loaded by different ClassLoader, override the method getClass() and make it private
    private static Class getClass(String classname) throws ClassNotFoundException {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();

        if (loader == null) {
            loader = OptimizedSingleton.class.getClassLoader();
        }

        return loader.loadClass(classname);
    }

}

// Optimized : when Singleton implements Serializable
class SerializedSingleton implements Serializable{
    public static SerializedSingleton INSTANCE = new SerializedSingleton();

    protected SerializedSingleton() { }

    private Object readResolve() {
        return INSTANCE;
    }
}



