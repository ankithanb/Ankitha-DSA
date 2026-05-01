package LinkedList.DoublyLinkedList;

public class LengthOfDLL {
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

        public int count()
        {
            ListNode temp = head;
            int count = 0;
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
        LinkedList list = new LinkedList();

        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.insertFirst(50);
        list.insertFirst(60);
        list.insertFirst(70);

        int result = list.count();

        System.out.println(result);
    }
}
