package net.thingking.coding;

import java.util.*;

/**
 * Created by darlynn on 7/21/17.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] peachList = new int[n];
        Arrays.stream(peachList).forEach(i -> i = scanner.nextInt());
        int max = maxPeaches(peachList);
        System.out.println(max);
    }

    private static int maxPeaches(int[] peachList) {
        int max = 0;
        int len = peachList.length;
        TreeMap map = new TreeMap<Integer, Integer>();
        for (int i = 0; i < peachList.length; i++) {
            for (int j = 0; j < i; j++) {
                if (peachList[i] > peachList[j])
                    map.put(j, (int) map.getOrDefault(j, 0) + 1);
            }
        }
        max = (int) map.descendingMap().firstEntry().getValue();
        return max;
    }
}


class Programe {
    public static void M(){

        Func<String,Integer> func = Programe::method;

        Programe p = new Programe();

        func = p::instanceMethod;

        int result = func.invoke("world");

    }



    public static int method(String arg){

        System.out.println("hello " + arg);
        return 1;

    }



    public int instanceMethod(String arg){

        System.out.println( "Woo " + arg );
        return 2;

    }

    public static void main(String[] args) {
        M();
    }
}

