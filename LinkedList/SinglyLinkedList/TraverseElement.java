// this is a program to print the elements in the linked list.
// Algorithm :
// first we have to insert the elements into the list.
// display all the values inserted in the list by using while loop.


package LinkedList.SinglyLinkedList;
 
public class TraverseElement {

    class TraversList{                           // we have to declare a class with static keyword, otherwise we have to initialize the outer object.
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
    }
    public static void main(String[] args)
    {
        TraverseElement t = new TraverseElement();              // when we dont declare a class with static keyword in the LinkedList,, then we have to initialize a object of ReverseList.
        TraversList list = t.new TraversList();

        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);

        list.display();
    }
}
