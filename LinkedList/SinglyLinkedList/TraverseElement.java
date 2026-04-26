package LinkedList.SinglyLinkedList;

    
public class TraverseElement {

    class TraversList{
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
        TraverseElement t = new TraverseElement();
        TraversList list = t.new TraversList();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);

        list.display();
    }
}
