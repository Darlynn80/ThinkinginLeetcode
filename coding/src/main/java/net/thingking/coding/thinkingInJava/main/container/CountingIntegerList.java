package net.thingking.coding.thinkingInJava.main.container;

import java.util.AbstractList;

/**
 * Created by darlynn on 4/30/17.
 *
 * 使用享元的解决方案， 当你寻找值的时候，通过get 来产生，因此这个List实际上并不必组装
 */
public class CountingIntegerList extends AbstractList<Integer> {
    private  int size;

    public CountingIntegerList(int size) {
        this.size = size<0 ? 0:size;
    }
    @Override
    public Integer get(int index) {
        return Integer.valueOf(index);
    }

    @Override
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        System.out.println(new CountingIntegerList(30));
    }
}
