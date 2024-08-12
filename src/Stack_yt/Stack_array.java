package Stack_yt;
import java.util.*;
  class Stack{
      int top = -1;
      int n =10;
      int a[] = new int [n];
      void push(){
          Scanner sc = new Scanner(System.in);
          if(top == (n-1)){
              System.out.println("Overflow Condition");
          }
          else{
              System.out.println("Enter data ");
              int i = sc.nextInt();
              top = top +1;
              a[top]=i;
              System.out.println("item inserted");
          }}
          void pop(){
          if(top == -1){
              System.out.println("Underflow Condition");
          }else {
              top = top -1;
              System.out.println("item deleted");

      }}
          void display(){
              System.out.println("items are = ");
              for(int j = top ; j>=0;j-- ){
                  System.out.println(a[j]);


              }

      }
  }

public class Stack_array {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        Stack s  = new Stack();

        int l ;
        do {
            System.out.println("press 1 to push ");
            System.out.println("press 2 to pop ");
            System.out.println("press 3 to display ");
            System.out.println("Enter your choice  =  ");
            int d = sc.nextInt();

            switch (d) {
                case 1: {
                    s.push();
                    break;

                }
                case 2: {
                    s.pop();
                    break;
                }
                case 3: {
                    s.display();
                    break;
                }
            }
            System.out.println(" press 0 to main menu");
            System.out.println("press any key to exit ");
            l = sc.nextInt();
        }while(l==0);
            System.out.println("Exit successfully");

            }
        }






