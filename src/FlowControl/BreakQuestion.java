package FlowControl;
import java.util.*;
public class BreakQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(;;){
            System.out.println("Enter the number = ");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                break;
            }
            System.out.println(n);


        }
    }
}