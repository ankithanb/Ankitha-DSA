package LinkedList.SinglyLinkedList;

public class ReverseList {
    class LinkedList                        // we have to declare a class with static keyword, otherwise we have to initialize the outer object.
    {
        class Node{
            int data;
            Node next;
    
            Node(int data)
            {
                this.data = data;
                this.next = null;
            }
        }

        Node head = null;
        Node tail = null;
        int size = 0;

        public void insertFirst(int val)
        {
            Node node = new Node(val);
            node.next = head;
            head = node;

            if(tail == null)
            {
                tail = head;
            }
            size++;
        }

        public void display()
        {
            Node temp = head;
            while(temp != null)
            {
                System.out.print(temp.data +" -> ");
                temp = temp.next;
            }
            System.out.println("End");
        }

        public void reverseList() {
            Node prev = null;
            Node curr = head;
        
            while (curr != null) {
                Node next = curr.next;          // store the next value.
                curr.next = prev;               // store the prev value.
                prev = curr;                    // assign current value.
                curr = next;                    // assign next value.
            }
            
            //return prev;                      // this only we write in the leeetcode reverse problem.
            
            Node temp = head;
            head = prev;
            tail = temp;
        }
    }
    public static void main(String[] args)
    {
        ReverseList r = new ReverseList();              // when we dont declare a class with static keyword in the LinkedList,, then we have to initialize a object of ReverseList.
        LinkedList list = r.new LinkedList();

        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);

        list.display();

        list.reverseList();
        list.display();;

    }
}
