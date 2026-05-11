package LinkedList.DoublyLinkedList;

public class DeleteAllOccurances {
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

        public void DeleteOccurances(int key)
        {
            if(head == null) return;

            ListNode curr = head;
            while(curr != null)
            {
                if(curr.data == key)
                {
                    if(curr == head)
                    {
                        head = head.next;
                    }
                    if(curr.prev != null)
                    {
                        curr.prev.next = curr.next;
                    }
                    if(curr.next != null)
                    {
                        curr.next.prev = curr.prev;
                    }
                    if(curr == tail)
                    {
                        tail = curr;
                    }
                }
                curr = curr.next;
            }
        }

        public void display()
        {
            if(head == null) return;

            ListNode temp = head;
            while(temp != null)
            {
                System.out.print(temp.data + " <=> ");
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
        list.insertFirst(40);
        list.insertFirst(30);
        list.insertFirst(20);
        list.insertFirst(50);

        list.DeleteOccurances(20);
        list.display();
    }
}
