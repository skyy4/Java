package ConditionalStatements;

import java.util.Scanner;

public class LargestOf3 { public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the value of a = ");
    int a = sc.nextInt();
    System.out.print("enter the value of b = ");
    int b = sc.nextInt();
    System.out.print("enter the value of c = ");
    int c = sc.nextInt();
    if((a>=b)&&(a>=c)){
        System.out.print("a is the largest of 3");
    }
    else if ((b>=c)){
        System.out.println("b is the largest of 3");
    }
    else{
        System.out.print("c is the largest of three");
}
}}

