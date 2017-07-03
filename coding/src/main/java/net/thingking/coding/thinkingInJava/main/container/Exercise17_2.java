package net.thingking.coding.thinkingInJava.main.container;

import net.thingking.coding.thinkingInJava.main.container.Countries;

import java.util.*;

public class Exercise17_2 {
// placeholder class
}
/**
 * Created by darlynn on 4/30/17.
 *
 * Description:
 * 创建一个List， 然后用Countries来填充，对该列表排序并打印，然后将Collection.shuffle()方法重复地应用于该列表，并每次都打印他，
 * 这样你就可以看到shuffle方法是如何每次将列表随机打乱的了
 */
class Exercise1 {
    public static void main(String[] args) {

        List<String> list = new LinkedList<>(Countries.names());
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
    }
}

/**
 * 生成一个Map和Set， 使其包含所有以字母A开头的国家
 * */
class Exercise2 {
    public static void main(String[] args) {

    }
}

/**
 * 使用Countries， 用同样的数据多次填充Set， 然后验证此Set中没有重复的元素。
 * 使用HashSet\ LinkedHashSet\ TreeSet来做此测试
 * */
class Exercise3 {

}

/**
 * 创建一个Collection初始化器， 它将打开一个文件，并用TextFile将其断开为单词，然后将这些单词作为所产生的Collection的数据源使用。
 * */
class Exercise4 {

}

/**
 * 修改CountingMapData.java 通过添加像Countries.java 中那样的定制EntrySet类，来完全实现享元。
 * */
class Exercise5 {

}