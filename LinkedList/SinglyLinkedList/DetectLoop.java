

package LinkedList.SinglyLinkedList;

public class DetectLoop {
    static class LinkedList{                 // we have to declare a class with static keyword, otherwise we have to initialize the outer object.
        class Node{
            int data;
            Node next;

            Node(int data)
            {
                this.data = data;
                this.next = null;
            }
        }

        Node head = null;
        Node tail = null;
        int size = 0;

        public void insertFirst(int val)
        {
            Node node = new Node(val);
            node.next = head;
            head = node;

            if(tail == null)
            {
                tail = head;
            }
            size++;
        }

        public boolean Loop()
        {
            Node fast = head;
            Node slow = head;

            while(fast != null && fast.next != null)
            {
                slow = slow.next;
                fast = fast.next.next;

                if(fast == slow)
                {
                    return true;
                }
            }
            return false;
        }

        public void CreateLoop(int position)
        {
            if(position < 0)
                return;

            Node temp = head;
            Node loopNode = null;
            int index = 0;

            while(temp.next != null)
            {
                if(position == index)
                {
                    loopNode = temp;
                }
                temp = temp.next;
                index++;
            }
            temp.next = loopNode; 
        }
    }

    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();             // when we dont declare a class with static keyword in the LinkedList,, then we have to initialize a object of ReverseList.

        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.insertFirst(50);

        list.CreateLoop(2);

        boolean resu = list.Loop();

        System.out.println(resu);
    }
}
