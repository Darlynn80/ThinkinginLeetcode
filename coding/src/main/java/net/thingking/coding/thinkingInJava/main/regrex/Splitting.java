package net.thingking.coding.thinkingInJava.main.regrex;

import java.util.Arrays;

/**
 * Created by darlynn on 3/24/17.
 */
public class Splitting {

    public static String knights = "Then , when you have found the shrubbery, you must "+
            "cut down the mightiest tree int the forest... "+
            "with... a herring!";

    public static void split (String regrex) {
        System.out.println(Arrays.toString(knights.split(regrex)));
    }

    public static void main(String[] args) {
        split(" ");
        split("\\W+");  //non-word characters
        split("n\\W+"); //'n' followed by non-word characters

        split("(the)|(you)"); // the and you
    }
}
