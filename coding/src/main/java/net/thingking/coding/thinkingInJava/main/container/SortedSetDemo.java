package net.thingking.coding.thinkingInJava.main.container;

import net.thingking.coding.thinkingInJava.main.template.RandomGenerator;

import java.util.Collections;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by darlynn on 5/3/17.
 */
public class SortedSetDemo {
    public static void  main(String[] args) {
//        SortedSet<String> sortedSet = new TreeSet<>();
//        Collections.addAll(sortedSet, "one two three four five six seven eight nine ten".split(" "));
//        System.out.println(sortedSet);
//
//        String low = sortedSet.first();
//        String high = sortedSet.last();
//        System.out.println(low);
//        System.out.println(high);
//
//        Iterator<String> it = sortedSet.iterator();
//        for (int i=0; i<=6; i++) {
//            if (i==3)
//                low = it.next();
//            if (i==6)
//                high = it.next();
//            else
//                it.next();
//        }
//        System.out.println(low);
//        System.out.println(high);
//        System.out.println(sortedSet.headSet(high));
//        System.out.println(sortedSet.subSet(low, high));
//        System.out.println(sortedSet.tailSet(low));

        test();
    }

    public static void test() {
        SortedSet<RandomGenerator.String> sortedSet = new TreeSet<RandomGenerator.String>();
        RandomGenerator.String strs = new RandomGenerator.String(8);
        Collections.addAll(sortedSet, strs);
        System.out.println(sortedSet);
    }
}
