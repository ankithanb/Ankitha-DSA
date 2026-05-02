package LinkedList.DoublyLinkedList;

public class SearchElementDLL {
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

        public boolean Search(int element)
        {
            ListNode temp = head;

            while(temp != null)
            {
                if(temp.data == element)
                {
                    return true;
                }
                temp = temp.next;
            }
            return false;
        }
    }

    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();

        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);

        boolean res = list.Search(50);
        System.out.println(res);
    }
}
