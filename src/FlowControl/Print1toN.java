package FlowControl;
import java.util.*;
public class Print1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n = ");
        int n = sc.nextInt();
        int counter = 1;
        while(counter<=n){
            System.out.println(counter);
            counter++;
        }
    }
}
