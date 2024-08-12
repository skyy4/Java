package Arrays;
import java.util.*;
public class Input_Output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array = ");
        int size = sc.nextInt();
        System.out.println("enter the elements of the array = ");
        int numbers [] = new int [size];
        // input
        for(int i =0 ;i<size;i++){
             numbers[i]= sc.nextInt();
        }
        //output
        for(int i=0;i<size;i++){
            System.out.println(numbers[i]);
        }
    }
}
