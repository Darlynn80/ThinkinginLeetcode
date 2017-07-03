package net.thingking.coding.thinkingInJava.main.regrex;

/**
 * Created by darlynn on 3/24/17.
 */
public class IntegerMatch {


    private static final String REGREX_1 = "-?\\d+";       //check if a sequence of number starts with '-' or nothing
    private static final String REGREX_2 = "(-|\\+)?\\d+"; //check if a sequence of number starts with '+', or '-' or nothing
    private static final String REGREX_3 = "[A-Z]+(\\s|\\d|\\D|\\w)*(.)";  //check if a char array starts with Capital Character or end with '.'


    public static void main(String[] args) {

        System.out.println("-1234".matches(REGREX_1));
        System.out.println("5678".matches(REGREX_1));
        System.out.println("+911".matches(REGREX_1));
        System.out.println("+911".matches(REGREX_2));
        System.out.println("A...".matches(REGREX_3));

    }
}
