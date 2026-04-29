package LinkedList.DoublyLinkedList;

public class BasicFunctions {
    static class LinkedList{
         class ListNode{
            int data;
            ListNode prev, next;

            ListNode(int data)
            {
                this.data = data;
            }
        }

        ListNode head = null;
        ListNode tail = null;
        int size = 0;

        public void insertFirst(int val)                    // this part is insert at First.
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

        public void insertLast(int val)                     // this part is insert at Last.
        {
            if(tail == null)
            {
                insertFirst(val);
                return;
            }
            ListNode node = new ListNode(val);
            tail.next = node;
            node.prev = tail;
            tail = node;
            size++;

        }

        public void insert(int val, int index)              // this part is insert at given index.
        {
            if(index < 0 || index > size)
            {
                System.out.println("Invalid index");
                return;
            }
            if(index == 0)
            {
                insertFirst(val);
                return;
            }
            if(index == size)
            {
                insertLast(val);
                return;
            }

            ListNode temp = head;
            for(int i = 0; i < index - 1; i++)
            {
                temp = temp.next;
            }

            ListNode node = new ListNode(val);

            node.prev = temp;
            node.next = temp.next;

            temp.next.prev = node;
            temp.next = node;

            size++;
        } 

        public int deleteFirst()                            // this part is delete at first.
        {
            if(head == null)
            {
                System.out.println("List is empty");
                return -1;
            }
            int val = head.data;

            head = head.next;
            head.prev = null;
            size--;
            return val;
        }

        public int deleteLast()                             // this part is delete at Last.
        {
            if(tail == null)
            {
                System.out.println("List is empty");
                return -1;
            }

            int val = tail.data;
            tail = tail.prev;
            tail.next = null;

            size--;
            return val;
        }

        public int delete(int index)                    // this part is delete at given index.
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

            ListNode temp = head;
            for(int i = 0; i < index; i++)
            {
                temp = temp.next;
            }

            int val = temp.data;
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;

            size--;
            return val;
        }

        public void display()                               // this part is display.
        {
            if(head == null)
            {
                System.out.println("Empty list");
                return;
            }
            ListNode temp = head;
            while(temp != null)
            {
                System.out.print(temp.data +" <=> ");
                temp = temp.next;
            }
            System.out.println("Null");
        }
    }
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();

        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.insertFirst(50);
        list.display();

        list.insertLast(60);
        list.display();

        list.insert(70 , 2);
        list.display();

        list.deleteFirst();
        list.display();

        list.deleteLast();
        list.display();

        list.delete(2);
        list.display();
    }
}
