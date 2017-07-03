package net.thingking.coding.thinkingInJava.main.container;

/**
 * Created by darlynn on 4/30/17.
 *
 * when everytime using the Generator , it needs a pair object , so we can generate a map
 */
public class Pair<K,V> {

    /**
     * @apiNote public and final makes k,v only read and using for transferring the data
     * */
    public final K key;
    public final V value;

    public Pair(K k, V v) {
        this.key = k;
        this.value = v;
    }
}
