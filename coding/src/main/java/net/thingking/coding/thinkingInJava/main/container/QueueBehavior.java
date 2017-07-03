package net.thingking.coding.thinkingInJava.main.container;

import net.thingking.coding.thinkingInJava.main.template.CountingGenerator;
import net.thingking.coding.thinkingInJava.main.template.Generator;
import net.thingking.coding.thinkingInJava.main.template.RandomGenerator;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.*;

/**
 * Created by darlynn on 5/3/17.
 */
public class QueueBehavior {
    private static int count =10;
    static <T> void test(Queue<T> queue, Generator<T> gen) {
        for (int i=0; i<count; i++) {
            queue.offer(gen.next());
        }
        while (queue.peek() != null) {
            System.out.print(queue.remove()+ " ");
        }
        System.out.println();
    }
    static class Gen implements Generator<String> {

        String[] s = "one two three four five six seven eight nine ten".split(" ");
        int i;

        @Override
        public String next() {
            return s[i++];
        }
    }
    public static void main(String[] args) {
        test(new LinkedList<String>(), new Gen());
        test(new PriorityQueue<String>(), new Gen());
        test(new ArrayBlockingQueue<String>(count), new Gen());
        test(new ConcurrentLinkedQueue<String>(), new Gen());
        test(new LinkedBlockingQueue<String>(), new Gen());
        test(new PriorityBlockingQueue<String>(), new Gen());
    }
}

class ToDoList extends PriorityQueue<ToDoList.ToDoItem> {
    static class ToDoItem implements Comparable<ToDoItem> {

        private char primary;
        private int secondary;
        private String item;

        public ToDoItem(String td, char pri, int sec) {
            primary = pri;
            secondary = sec;
            item = td;
        }

        @Override
        public int compareTo(ToDoItem o) {
            if (primary>o.primary)
                return 1;
            if (primary == o.primary){
                if (secondary>o.secondary)
                    return 1;
                else if (secondary == o.secondary)
                    return 0;
            }
            return -1;
        }

        public String toString() {
            return Character.toString(primary) + secondary + ": " + item;
        }
    }
    public void add(String td, char pri, int sec) {
        super.add(new ToDoItem(td, pri, sec));
    }

    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        toDoList.add("Empty trash", 'C', 4);
        toDoList.add("Feed Dog", 'A', 2);
        toDoList.add("Mow lawn", 'C', 3);
        toDoList.add("Feed Cat", 'B', 1);
        toDoList.add("Water lawn", 'A', 1);

        while (!toDoList.isEmpty()) {
            System.out.println(toDoList.remove());
        }
    }
}
