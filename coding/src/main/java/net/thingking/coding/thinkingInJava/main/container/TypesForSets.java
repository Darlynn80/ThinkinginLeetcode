package net.thingking.coding.thinkingInJava.main.container;

/**
 * Created by darlynn on 5/3/17.
 */
class SetType {
    int i;
    public SetType(int n) {
        i = n;
    }

    public boolean equals(Object o) {
        return  o instanceof SetType && (i == ((SetType) o).i);
    }

    public String toString() {
        return Integer.toString(i);
    }
}

class HashType extends SetType {
    public HashType(int n) {
        super(n);
    }

    public int hashCode() {
        return i;
    }
}

class TreeType extends SetType implements Comparable<TreeType> {
    public TreeType(int n) {
        super(n);
    }

    @Override
    public int compareTo(TreeType o) {
        return o.i<i? -1: (o.i==i? 0:1);
    }
}

public class TypesForSets {

}
