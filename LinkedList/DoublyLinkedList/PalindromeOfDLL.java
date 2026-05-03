package LinkedList.DoublyLinkedList;

public class PalindromeOfDLL {
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

        public boolean Palindrome()
        {
            if(head == null)
            {
                return false;
            }

            ListNode left = head;
            ListNode right = tail;

            while(left != right && right.prev != left)
            {
                if(left.data != right.data)
                {
                    return false;
                }
                left = left.next;
                right = right.prev;
            }
            return true;
        }
    }

    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();

        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.insertFirst(10);

        boolean ans = list.Palindrome();

        System.out.println(ans);
    }
}
