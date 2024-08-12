package ConditionalStatements;
import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter value no a = ");
        int a = sc.nextInt();
        System.out.print("enter value no b = ");
        int b = sc.nextInt();
        System.out.print("Enter operation = ");
        char op = sc.next().charAt(0);
        switch (op) {
            case '+' :
                System.out.println("sum ="+(a+b));
                break;
            case '-':
                System.out.println("difference = "+(a-b));
                break;
            case '*':
                System.out.println("product = "+(a*b));
                break;
            case '/':
                System.out.println("division = "+(a/b));
                break;
            case '%':
                System.out.println("remainder = "+(a%b));
                break;
            default:
                System.out.println("error");
        }


    }
}
