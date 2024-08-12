package FlowControl;
import java.util.*;
public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int n = sc.nextInt();
        if(n<2){
            System.out.println("not a prime number");
        }
        else{boolean  isprime = true;
        for(int i =2;i<=n-1;i++){                    //// we can use i<= Math.sqrt(n),it optimizes the code
            if(n%i==0){
                isprime=false;
            }
        }
        if(isprime==true){
            System.out.println("prime number ");
        }
        else{
            System.out.println("not a prime number");
        }
        }
    }}

