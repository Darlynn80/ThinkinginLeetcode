package net.thingking.coding.thinkingInJava.main.container;

import net.thingking.coding.thinkingInJava.main.template.Generator;

import java.util.ArrayList;

/**
 * Created by darlynn on 4/29/17.
 * 适配器模式实现CollectionData ， 将Generator适配到Collection的构造器上。
 */
public class CollectionData<T> extends ArrayList<T> {
    public CollectionData(Generator<T> gen, int quantity) {
        for (int i=0; i<quantity; i++) {
            add(gen.next());
        }
    }

    public static <T> CollectionData<T> list(Generator<T> gen, int quantity) {
        return new CollectionData<T>(gen, quantity);
    }
}

