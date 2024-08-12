package FlowControl;
import java.util.*;
public class ContinueQuestion {
    public static void main(String[] args) {
        for(;;){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number = ");
            int n = sc.nextInt();
            if(n%10==0){
                continue;
            }
            System.out.println("number was " +n);

        }
    }
}
