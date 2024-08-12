package ConditionalStatements;

import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your marks = ");
        int marks = sc.nextInt();
        String result = (marks>=32)?"pass":"fail";
        System.out.println(result);
    }

}
