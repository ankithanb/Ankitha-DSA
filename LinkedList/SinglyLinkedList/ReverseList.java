package LinkedList.SinglyLinkedList;

public class ReverseList {
    

    class LinkedList
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
        
            Node temp = head;
            head = prev;
            tail = temp;
        }
    }


    public static void main(String[] args)
    {
        ReverseList r = new ReverseList();
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
