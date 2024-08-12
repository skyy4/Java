package FlowControl;

import java.util.Scanner;

public class ReverseTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int n = sc.nextInt();
        int rev = 0;
        System.out.print("reversing  the number = ");
        while (n > 0) {
            int ld = n % 10;
            rev = (rev * 10) + ld;
            n /= 10;

        }
        System.out.print(rev);
    }}
