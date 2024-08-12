package ConditionalStatements;
import java.util.*;
public class LargestOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of a = ");
        int a = sc.nextInt();
        System.out.print("enter the value of b = ");
        int b = sc.nextInt();
        if(a>=b){
            System.out.print("a is largest of 2");
        }
        else{
            System.out.println("b is largest of 2");
        }
    }
}
