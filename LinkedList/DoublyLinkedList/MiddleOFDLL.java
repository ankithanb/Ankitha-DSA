package LinkedList.DoublyLinkedList;

public class MiddleOFDLL {
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
        public ListNode Middle()
        {
            ListNode fast = head;
            ListNode slow = head;

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
        LinkedList list = new LinkedList();

        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.insertFirst(50);

        LinkedList.ListNode mid = list.Middle();

        if(mid != null)
        {
            System.out.println(mid.data);
        }
    }
}
