package net.thingking.coding.thinkingInJava.main.template;

import java.util.Random;

/**
 * Created by darlynn on 4/30/17.
 */
public class RandomGenerator{

    private static Random r = new Random(47);

    public static class Boolean implements Generator<java.lang.Boolean> {

        @Override
        public java.lang.Boolean next() {
            return r.nextBoolean();
        }
    }

    public static class Byte implements Generator<java.lang.Byte> {

        @Override
        public java.lang.Byte next() {
            return (byte)r.nextInt();
        }
    }

    public static class Integer implements Generator<java.lang.Integer> {

        private int mod=10000;
        public Integer(){}
        public Integer(int modulo) {
            mod = modulo;
        }
        @Override
        public java.lang.Integer next() {
            return r.nextInt(mod);
        }
    }

    public static class Character implements Generator<java.lang.Character> {
        static char[] chars = ("abcdefghijklmnopqrstuvwxyz").toCharArray();

        @Override
        public java.lang.Character next() {
            return chars[r.nextInt(chars.length)];
        }
    }

    public static class String implements Generator<java.lang.String> {
        private int len = 7;
        Generator<java.lang.Character> cg = new Character();

        public String(){}
        public String(int length) {
            len = length;
        }

        @Override
        public java.lang.String next() {
            char[] buf = new char[len];
            for (int i = 0; i < len; i++) {
                buf[i] = cg.next();
            }
            return new java.lang.String(buf);
        }
    }

    //TODO
    public static class Float implements Generator<java.lang.Float> {

        @Override
        public java.lang.Float next() {
            return null;
        }
    }

    //TODO
    public static class Long implements Generator<java.lang.Long> {

        @Override
        public java.lang.Long next() {
            return null;
        }
    }

    //TODO
    public static class Short implements Generator<java.lang.Short> {

        @Override
        public java.lang.Short next() {
            return null;
        }
    }

    //TODO
    public static class Double implements Generator<java.lang.Double> {

        @Override
        public java.lang.Double next() {
            return null;
        }
    }
}
