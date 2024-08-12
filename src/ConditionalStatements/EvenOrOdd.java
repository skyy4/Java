package ConditionalStatements;

import java.util.Scanner;
import java.util.*;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of a = ");
        int a = sc.nextInt();
        if(a%2==0){
            System.out.print("a is even number");
        }
        else{
            System.out.println("a is odd number");
    }
}}
