package FlowControl;
import  java.util.*;
public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int n = sc.nextInt();

        System.out.print("reverse of the number = ");
        while (n>0){
          int ld = n%10;
           n /= 10;
            System.out.print(ld);
        }
//        for (int i=0;n != 0;i++){
//                     int  ld = n%10;
//            System.out.print(ld);
//                     n /= 10;
//
//
//        }

    }
    }

