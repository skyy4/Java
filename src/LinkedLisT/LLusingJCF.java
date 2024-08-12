package LinkedLisT;
import java.util.LinkedList;
public class LLusingJCF {
    public static void main(String[] args) {
        // creating-
        LinkedList <Integer> ll = new LinkedList<>();
        // add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(1);
        ll.addFirst(4);
        // Print
        System.out.println(ll);

         // remove
         ll.removeLast();
         ll.removeLast();
         ll.removeFirst();

        System.out.println(ll);
    }}
