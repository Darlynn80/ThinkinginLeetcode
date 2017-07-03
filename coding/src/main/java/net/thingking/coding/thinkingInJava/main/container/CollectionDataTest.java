package net.thingking.coding.thinkingInJava.main.container;

import net.thingking.coding.thinkingInJava.main.template.Generator;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by darlynn on 4/29/17.
 */

class Government implements Generator<String> {

    String[] foundation = ("Strange women lying in ponds distributing swords is no basis for a system of government").split(" ");
    private int index;
    @Override
    public String next() {
        return foundation[index++];
    }
}
public class CollectionDataTest {
    public static void main(String[] args) {

        //LinkedHashSet维护的是保持了插入顺序的链接列表
        Set<String> set = new LinkedHashSet<>(
                new CollectionData<String>(new Government(), 15)
        );
        set.addAll(CollectionData.list(new Government(), 15));
        System.out.println(set);

    }
}
