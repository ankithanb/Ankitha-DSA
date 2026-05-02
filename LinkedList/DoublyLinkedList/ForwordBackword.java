package LinkedList.DoublyLinkedList;

public class ForwordBackword {
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
        ListNode tail = null;
        ListNode prev = null;
        int size = 0;

        public void insertFirst(int val)
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

        public void displayForword()
        {
            ListNode temp = head;
            while(temp != null)
            {
                System.out.print(temp.data+" <=> ");
                temp = temp.next;
            }
            System.out.println("Null");
        }

        public void displayBackword()
        {
            ListNode temp = tail;
            while(temp != null)
            {
                System.out.print(temp.data+" <=> ");
                temp = temp.prev;
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

        list.displayForword();

        list.displayBackword();
    }
}
