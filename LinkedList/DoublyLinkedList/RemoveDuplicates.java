package LinkedList.DoublyLinkedList;

public class RemoveDuplicates {
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

        public void RemoDuplicates()
        {
            if(head == null || head.next == null) return;

            ListNode curr = head;

            while(curr != null && curr.next != null)
            {
                if(curr.data == curr.next.data)
                {
                    ListNode nextNode = curr.next;

                    curr.next = nextNode.next;
                    if(nextNode.next != null)
                    {
                        nextNode.next.prev = curr;
                    }
                    else{
                        tail = curr;
                    }
                    size--;
                }
                else{
                    curr = curr.next;
                }
            }
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
        list.insertFirst(20);
        list.insertFirst(40);
        list.insertFirst(40);
        list.insertFirst(50);

        list.RemoDuplicates();

        list.display();
    }
}
