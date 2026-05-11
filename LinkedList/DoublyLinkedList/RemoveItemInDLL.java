package LinkedList.DoublyLinkedList;

public class RemoveItemInDLL {
    static class LinkedList{
        class ListNode{
            int data;
            ListNode next, prev;

            ListNode(int data)
            {
                this.data = data;
            }
        }

        ListNode head, prev, tail;
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

        public void Remove(int element)
        {
            if(head != null && head.data == element)
            {
                head = head.next;
            }

            ListNode temp = head;

            while(temp != null)
            {
                if(temp.data == element)
                {
                    temp.next.prev = temp.prev;
                    temp.prev.next = temp.next;
                    size--;
                }
                temp = temp.next;
            }
        }
        
        public void display()
        {
            ListNode temp = head;
            while(temp != null)
            {
                System.out.print(temp.data + " <=> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    } 
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();

        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.display();

        list.Remove(40);
        list.display();
    }
}
