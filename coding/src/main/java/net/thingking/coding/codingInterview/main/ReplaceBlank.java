package net.thingking.coding.codingInterview.main;

import java.util.regex.Matcher;

public class ReplaceBlank {
    public static String replaceBlank(String str) {
        if (str==null) {
            return null;
        }
        str = str.replace(" ", "%20");
        return str;
    }
    public static void main(String args[]){
        String s="We are happy.";
        System.out.println(replaceBlank(s));
    }
}
