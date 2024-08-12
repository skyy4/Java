package Functions_Methods;
import java.util.*;
public class ProductOfAnB {
    public static int multiply(int a,int b){

        int product = a*b;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a= sc.nextInt();
        int b = sc.nextInt();
        int product1 = multiply(a,b);
        System.out.println("product of a and b = "+product1);



    }
}
