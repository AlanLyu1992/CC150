package Chap1;

import java.util.*;
public class Try {
    public static void main(String[] args) {
        int a = -2147483648;
        int b;
        b = 1 << 32;
        System.out.println(b);
        b = (1 << 30)<< 2;
        System.out.println(b);
        b = 1 << 34;
        System.out.println(b);
        b = (1 << 30)<< 4;
        System.out.println(b);
        b = 1 << 31;
        System.out.println(Integer.toBinaryString(b));
        System.out.println(b);
        b = (1 << 31) + (1 << 15);
        System.out.println(Integer.toBinaryString(b));
        System.out.println(b);
        b = ((1 << 31) + 1)<< 1;
        System.out.println(Integer.toBinaryString(b));
        System.out.println(b);
        b = -1 >>> 2;
        System.out.println(Integer.toBinaryString(b));
        System.out.println(b);
    }
}
