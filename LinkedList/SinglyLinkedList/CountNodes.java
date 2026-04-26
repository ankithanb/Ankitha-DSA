package LinkedList.SinglyLinkedList;

public class CountNodes {
    class LinkedList{                        // we have to declare a class with static keyword, otherwise we have to initialize the outer object.
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

        public int Count()
        {
            int count = 0;
            Node temp = head;
            while(temp != null)
            {
                count++;
                temp = temp.next;
            }
            return count;
        }
    }
    
    public static void main(String[] args)
    {
        CountNodes C = new CountNodes();                // when we dont declare a class with static keyword in the LinkedList,, then we have to initialize a object of ReverseList.
        LinkedList list = C.new LinkedList();

        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);

        int resu = list.Count();

        System.out.println(resu);
    }
}
