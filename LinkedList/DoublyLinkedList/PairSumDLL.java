package LinkedList.DoublyLinkedList;

public class PairSumDLL {
    static class LinkedList{
        class ListNode{
            int data;
            ListNode next,prev;

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

        public void PairSum(int target)
        {
            if(head == null) return;

            ListNode left = head;
            ListNode right = tail;

            while(left != right && right.next != left)
            {
                int sum = right.data + left.data;

                if(sum == target)
                {
                    System.out.println(left.data + " + " + right.data + " = " + target);

                    left = left.next;
                    right = right.prev;
                }

                else if(sum < target)
                {
                    left = left.next;
                }

                else{
                    right = right.prev;
                }
            }  
        }
    }

    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();

        list.insertFirst(60);
        list.insertFirst(50);
        list.insertFirst(40);
        list.insertFirst(30);
        list.insertFirst(20);
        list.insertFirst(10);

        list.PairSum(70);
    }
}
