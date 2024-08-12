package ConditionalStatements;

import java.util.Scanner;

public class IncomeTaxCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the income  = ");
        int a = sc.nextInt();
        double tax ;
        if(a<500000){
            System.out.print("income tax = 0 ");
        }
        else if (a>=500000 && a<1000000){
            tax = a*(.2);
            System.out.print("income tax =  " + tax);
        }
        else{
           tax = a*(.3);
            System.out.print("income tax = " + tax);
        }

    }
}

