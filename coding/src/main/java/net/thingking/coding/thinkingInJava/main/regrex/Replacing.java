package net.thingking.coding.thinkingInJava.main.regrex;

/**
 * Created by darlynn on 3/24/17.
 */
public class Replacing {
    static String s = Splitting.knights;

    //TODO
    public static void main(String[] args) {
        System.out.println(s.replaceFirst("f\\w+", "located"));
        System.out.println(s.replaceAll("shrubbery|tree|herring", "banana"));

        System.out.println(s.replaceAll("[aeiou]", "_"));
    }


}
