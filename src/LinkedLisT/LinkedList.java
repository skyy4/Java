package LinkedLisT;

public class LinkedList {
    public static class Node{
        int data ;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }}
        public static Node head;
        public static Node tail;
        public static int size;
        public void addFirst (int data){
            // step 1 : create a new node
            Node newNode = new Node(data);
            size++;
            if(head == null){
                head=tail=newNode;
                return;
            }
                // step 2 : new node next = head;
                newNode.next = head;
                // step 3 : head = new node;
                head  = newNode ;


        }
        public void addLast(int data ){
            Node newNode = new Node(data);
            size++;
            if(head==null){
                head=tail=newNode;
                return;
            }
             tail.next=newNode;
            tail=newNode;
        }
        public void print(){
            if(head==null){
                System.out.println("LL is empty");
            }
            else{
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data + "-->");
                temp = temp.next;

            }
            System.out.println("null");
            }

        }
        public void add(int idx ,int data){
            if(idx==0){
                addFirst(data);
                return;
            }
            Node newNode = new Node(data);
            size++;
            Node temp = head;
            int i = 0 ;
            while(i<idx-1){
                temp=temp.next;
                i++;
            }
            // i = idx-1 ; temp -> prev
            newNode.next=temp.next;
            temp.next= newNode;

        }
        public int removeFirst(){
            if(size==0){
                System.out.println("LL is empty");
                return Integer.MIN_VALUE;
            }else if(size == 1){
                int val = head.data;
                head = tail = null;
                size = 0;
                return val;
            }
            int val = head.data;
            head = head.next;
            size--;
            return val;
        }
        public int removeLast(){
            if (size==0){
                System.out.println("LL is empty");
                return Integer.MIN_VALUE;
            }
            else if (size==1){
                int val= head.data;
                head=tail=null;
                size= 0;
                return val;
            }
            Node prev= head;
            for(int i = 0; i<size-2;i++){
                prev=prev.next;
            }
            int val = prev.next.data; //tail ka data  or tail.data;
            prev.next = null;
            tail = prev;
            size --;
            return val;
        }
          public int itrSearch(int key){
            Node temp = head ;
            int i = 0 ;
            while(temp != null){
                if(temp.data== key){
                    return i;

                }
                temp = temp.next;
                i++;
            }
            return -1;
          }
          public void reverse(){
             Node prev = null;
             Node curr = tail=head;
             Node next;
             while(curr!=null){
                 next=curr.next;
                 curr.next=prev;
                 prev = curr;
                 curr = next;
             }
             head = prev;
          }
          public void removeNthfromEnd(int n){
            // calculate size
              int sz = 0;
              Node temp = head;
              while(temp != null){
                  temp = temp.next;
                  sz++;
              }
              if(n==sz){
                  head=head.next;  //removeFirst
              }
              // sz-n
              int i = 1;
              int iToFind = sz-n;
              Node prev = head;
              while(i<iToFind){
                  prev= prev.next;
                  i++;
              }
              prev.next = prev.next.next;
              return;

          }
           // Slow Fast Approach
          public Node findMid(Node head){   //helper
             Node slow = head ;
             Node fast = head;
             while(fast != null && fast.next != null){
                 slow = slow.next; // +1
                 fast = fast.next.next; // +2
             }
             return slow;    // slow is my midNode
          }
          public boolean checkPalindrome(){
            if(head== null || head.next == null ){
                return true;
            }
            // step 1  - to find midNode
              Node Midnode = findMid(head);

            //step 2  - reverse 2nd half  of ll
              Node prev = null;
              Node curr = Midnode;
              Node next;

              while(curr != null){
                  next = curr.next;
                  curr.next= prev;
                  prev= curr;
                  curr = next;
              }
              Node right = prev;    //right half head
              Node left = head;

              //step 3 -  check left half & right half

              while(right!=null){
                  if(left.data!= right.data){
                      return false;
                  }
                  left = left.next;
                  right = right.next;
              }
              return true;

          }
          public static boolean   isCycle(){    //floyd's Fc
            Node slow = head;
            Node fast = head;
            while(fast != null && fast.next  != null){
                slow = slow.next; //+1
                fast = fast.next.next;
                if(slow == fast ){
                    return true; // cycle exists
                }

            }
            return false;

          }
          public static void  removeCycle(){
            // detect cycle
              Node slow = head;
              Node fast  = head;
              boolean cycle = false;
              while(fast != null && fast.next!= null){
                  slow = slow.next;
                  fast  = fast.next.next;
                  if(fast == slow){
                      cycle = true;
                      break;
                  }
              }
              if (cycle == false){
                  return ;
              }
              // find the meeting point
              slow = head ;
              Node prev = null;
              while (slow!= fast){
                  prev = fast;
                  slow = slow.next;
                  fast= fast.next;

              }
              //remove cycle  -  last.next= null;
              prev.next= null;

          }
          private Node getMid(Node head){
            Node slow = head;
            Node fast = head.next;

            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow ; // mid node
          }
          private Node merge(Node head1 , Node head2){
            Node mergeLL = new Node (-1);
            Node temp = mergeLL;

            while(head!= null && head2 != null){
                if(head1.data <= head2.data){
                    temp.next = head1;
                    head1 = head1.next;
                    temp = temp.next;
                }else{
                    temp.next = head2;
                    head2 = head2 .next;
                    temp = temp.next;
                }
            }
            while(head1 != null){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            while(head2 != null){
                temp.next = head2;
                head2 = head2 .next;
                temp = temp.next;

            }
             return mergeLL.next;
          }
          public Node mergeSort(Node head){
            if(head==null  ||  head.next  == null){
                return head;
            }
            // find mid
              Node mid = getMid(head);
            // left & right Ms
              Node rightHead = mid.next;
              mid.next = null;
              Node newLeft = mergeSort(head);
              Node newRight = mergeSort(rightHead);
              //merge
              return  merge(newLeft,newRight);
          }
        public static void main(String[] args) {
           LinkedList ll = new LinkedList();
            ll.addFirst(1);
            ll.addFirst(2);
            ll.addFirst(3);
            ll.addFirst(4);
            ll.addFirst(5);
            // 5->4->3->2->1
            ll.print();
            ll.head = ll.mergeSort(ll.head);
            ll.print();
//            ll.add(2,3);
//            ll.print(); //1->2->3->4->5
          //  System.out.println("size of the linkedlist = "+ll.size);
//            ll.removeFirst();
//            ll.print();
//
//            ll.removeLast();
//            ll.print();
//            System.out.println(ll.size);
//            System.out.println("Index = " +ll.itrSearch(3));
//            System.out.println(ll.itrSearch(10));
//            ll.reverse();
//            ll.print();
//             ll.removeNthfromEnd(3);
//             ll.print();
//            ll.addLast(1);
//            ll.addLast(2);
//            ll.addLast(1);
//            ll.addLast(1);
//            ll.addLast(2);
//            ll.addLast(1);
//
//            ll.print();
//            System.out.println(ll.checkPalindrome());
//             head = new Node(1);
//                Node temp = new Node(2);
//            head.next =temp;
//            head.next.next = new Node(3);
//            head.next.next.next= temp;
//            // 1->2->3->2
//
//            System.out.println(isCycle());
//            removeCycle();
//            System.out.println(isCycle());
//            ll.print();


        }
    }
