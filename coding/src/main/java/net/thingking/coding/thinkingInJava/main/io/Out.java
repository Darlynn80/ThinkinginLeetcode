package net.thingking.coding.thinkingInJava.main.io;

import java.util.Collection;

/**
 * Created by darlynn on 5/9/17.
 */
public class Out {
    public static <AnyType> void print(Collection<AnyType> coll) {
        for (AnyType item: coll) {
            System.out.println( item );
        }
    }
}
