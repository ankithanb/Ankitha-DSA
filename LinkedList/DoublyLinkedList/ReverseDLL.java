// this is a program to print the element of the list in reverse order.
// first, pointer assign to the tail.
// second, using while loop, traverse the element from tail to head using the prev pointer.
// third, print the traversed element.


package LinkedList.DoublyLinkedList;

public class ReverseDLL {
    static class LinkedList{
        class ListNode{
            int data;
            ListNode next, prev;

            ListNode(int data)
            {
                this.data = data;
            }
        }
        
        ListNode head = null;
        ListNode prev = null;
        ListNode tail = null;
        int size = 0;

        public void insertFirst(int val)                // insert first block.
        {
            ListNode node = new ListNode(val);
            if(head == null)
            {
                head = tail = node;
                return;
            }

            node.next = head;
            head.prev = node;
            head = node;
            size++;
        }

        public void Reverse()                           // Reverse block.
        {
            ListNode temp = tail;

            while(temp != null)
            {
                System.out.print(temp.data+" <=> ");
                temp = temp.prev;
            }
            System.out.println("Start");
        }

        public void display()                           // Display block.
        {
            ListNode temp = head;
            while(temp != null)
            {
                System.out.print(temp.data+" <=> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
        
    } 

    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();

        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);

        list.display();

        list.Reverse();
        list.display();
    }
}
