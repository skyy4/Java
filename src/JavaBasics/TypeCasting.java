package JavaBasics;

import  java.util.*;
public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        float a = 7.79f;
//        int b = (int) a;
//        System.out.println(b);
      // there is a loss of data therefore it must be done cautiously
        // called narrowing cause it put larger data into smaller memory
        char ch = 'a';
        int no = ch;
        char ch2 = 'b';
        int no2 = ch2;
        System.out.println(no);
        System.out.println(no2);
    }}