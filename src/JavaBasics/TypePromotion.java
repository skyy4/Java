package JavaBasics;

import java.util.Scanner;

public class TypePromotion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        char a = 'a';
//        char b = 'b';
//        int c = (char)b-a;
//        System.out.println((int)(b));
//        System.out.println((int)(a));
//        System.out.println(c);

//        short a = 50;
//        byte b = 8;
//        char c = 'c';
//        int d =(a+b+c);
//        System.out.println(d);

//        long l = 2232;
//        int i = 323;
//        float f = 34.56f;
//        double d = 3234.98;
//        double ans = (l+i+f+d);
//        System.out.println(ans);

        // noticeable that
        byte b = 5;
        b = (byte)(b*2);
        System.out.println(b);
        // if not type casted it would have give error because their is type promotion int (b*2) due to * expression
    }
}
