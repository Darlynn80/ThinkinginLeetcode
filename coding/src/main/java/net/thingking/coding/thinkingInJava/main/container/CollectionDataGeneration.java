package net.thingking.coding.thinkingInJava.main.container;

import net.thingking.coding.thinkingInJava.main.template.RandomGenerator;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by darlynn on 4/30/17.
 */
public class CollectionDataGeneration {

    public static void main(String[] args) {
        System.out.println(
                new ArrayList<String>(
                        CollectionData.list(new RandomGenerator.String(10), 5)
                )
        );

        System.out.println(
                new HashSet<Integer>(
                        CollectionData.list(new RandomGenerator.Integer(),5)
                )
        );
    }
}
