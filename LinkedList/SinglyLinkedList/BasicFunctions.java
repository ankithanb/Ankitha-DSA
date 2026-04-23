package LinkedList.SinglyLinkedList;

public class BasicFunctions {
    
    class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    class LinkedList 
    {
        Node head;
        Node tail;
        int size = 0;

        public void insertFirst(int data)               // insert at first.
        {
            Node node = new Node(data);
            node.next = head;
            head = node;

            if(tail == null)
            {
                tail = head;
            }
            size++;
        }

        public void insertLast(int data)              // insert at last.
        {
            if(tail == null)
            {
                insertFirst(data);
                return;
            }
            Node node = new Node(data);
            tail.next = node;
            tail = node;
            size++;
        }

        public void insert(int data, int index)       // insert at given index.
        {
            if(index == 0)
            {
                insertFirst(data);
                return;
            }
            if(index == size)
            {
                insertLast(data);
                return;
            }

            if(index < 0 || index > size)
            {
                System.out.println("Invalid index");
                return;
            }

            Node temp = head;
            for(int i = 1; i < index; i++)
            {
                temp = temp.next;
            }
            Node node = new Node(data);
            temp.next = node;
            size++;
        }

        public void display()
        {
            Node temp = head;
            while(temp != null)
            {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("End");
        }

        public int deleteFirst()                          // delete at first.
        {
            if(head == null)
            {
                System.out.println("List is empty");
                return -1;
            }
            
            int val = head.data;
            head = head.next;
            if(head == null)
            {
                tail = null;
            }
            size--;
            return val;
        }

        public Node get(int index) {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        }

        public int deleteLast()                             // delete at last.
        {
            if(head == null)
            {
                System.out.println("List is Empty");
                return -1;
            }
            if(size == 1)
            {
                int val = head.data;
                head = null;
                tail = null;
                size--;
                return val;
            }

            Node SecondLast = get(size - 2);
            int val = tail.data;

            SecondLast.next = null;
            tail = SecondLast;

            if(head == null)
            {
                tail = null;
            }
            size--;
            return val;
        }

        public int delete(int index)                        // delete at given index.
        {
            if(index < 0 || index > size)
            {
                System.out.println("Invalid index");
                return -1;
            }
            if(index == 0)
            {
                return deleteFirst();
            }
            if(index == size - 1)
            {
                return deleteLast();
            }
            
            Node prev = get(index - 1);
            int val = prev.next.data;
            prev.next = prev.next.next;

            return val;
        }
    }
    
    public static void main(String[] args)
    {
        BasicFunctions bf = new BasicFunctions();
        LinkedList list = bf.new LinkedList();
        list.insertFirst(10);
        list.insertFirst(20);

        list.display();

        list.insert(50, 2);

        list.display();

        list.insertLast(5);
        list.insertLast(2);

        list.display();

        System.out.println(list.deleteFirst());
        list.display();

        System.out.println(list.deleteLast());
        list.display();

        System.out.println(list.delete(1));
        list.display();
    }
}
