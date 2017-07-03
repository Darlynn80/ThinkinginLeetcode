package net.thingking.coding.thinkingInJava.main.container;


import java.util.LinkedHashMap;

/**
 * Created by darlynn on 5/4/17.
 */
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<>(new CountingMapData(9));
        System.out.println(linkedHashMap);
        // LRU order
        linkedHashMap = new LinkedHashMap<Integer,String>(16, 0.75f, true);
        linkedHashMap.putAll(new CountingMapData(9));
        System.out.println(linkedHashMap);
        for (int i=0; i<6; i++) {
            linkedHashMap.get(i);
        }
        System.out.println(linkedHashMap);
        linkedHashMap.get(0);
        System.out.println(linkedHashMap);
    }
}
