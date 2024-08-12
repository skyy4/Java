package Functions_Methods;

import java.util.Scanner;

public class SyntaxWithParameters {
    public static int CalculateSum(int num1,int num2){     //parameters or formal parameters
        int sum = num1+num2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  number a = ");
        int a = sc.nextInt();
        System.out.println("enter  number a = ");
        int b = sc.nextInt();
        int sum = CalculateSum(a,b); //arguments or actual arguments
        System.out.println("sum is = " +sum);

    }
}
