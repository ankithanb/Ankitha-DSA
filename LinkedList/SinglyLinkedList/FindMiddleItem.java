package LinkedList.SinglyLinkedList;

public class FindMiddleItem {
    static class LinkedList{
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

        public Node Middle()
        {
            Node fast = head;
            Node slow = head;

            while(fast != null && fast.next != null)
            {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
    }

    public static void main(String[] args)
    {
        //FindMiddleItem F = new FindMiddleItem();            // when we dont use the static keyword for the LinkedList class ,then we have to declare this object..    // otherwise there is no need ot create the outer object.
        LinkedList list = new LinkedList();

        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        // list.insertFirst(40);                            // for even no. of elements,, the second middle element will be the answer means index(2) and index(3) will be the middle index so it will take second middle element.
        list.insertFirst(50);

        LinkedList.Node mid = list.Middle();                // here we used LinkedList.Node for accessing the element , just because of Node is in LinkedList (ex. room inside in House so we can write -> House.Room).

        if(mid != null)
        {
            System.out.println("Middle element : "+ mid.data);
        }
    }
}
