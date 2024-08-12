package Stack_yt;

import java.util.Scanner;
class stack1{
      static class Node{
           int data ;
           Node next;
           Node(int data){
               this.data=data;
               this.next=null;
           }

       }
    Node top= null;
       void push(){
          Scanner sc= new Scanner(System.in);
           System.out.println("enter data");
          int  data= sc.nextInt();
           Node new_node = new Node(data);
           if(top==null){
               top =new_node;
           }
           else{
               new_node.next = top;
               top = new_node;
           }
       }
       void pop(){
           if(top==null){
               System.out.println("Stack is empty");
           }
           else{
                top=top.next;
           }
       }
       void display(){
           Node temp = top;
           while(temp != null){
               System.out.println(temp);
               temp= temp.next;
           }
       }
}

public class Stack_LL {
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
