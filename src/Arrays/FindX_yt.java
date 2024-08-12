package Arrays;
import java.util.*;
public class FindX_yt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array = ");
        int size = sc.nextInt();
        int numbers[] = new int [size];
        System.out.println("Enter the elements of the number = ");
        //input
        for(int i = 0;i<size;i++){
            numbers[i]=sc.nextInt();


        }
        System.out.println("Enter the element you want to find = ");
        int x = sc.nextInt();
        //output
        for(int i = 0 ; i< numbers.length;i++){
            if(numbers[i]==x){
                System.out.println("Element x found at = "+i);

            }
        }
    }
}
