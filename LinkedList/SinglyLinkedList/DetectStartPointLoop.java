// this is a program to find the Starting point of the loop.
// first, we have to check whether this list having loop or not.
// second, if there is no loop, then return .
// third, find the starting point using slow and fast pointers.
// at last print the slow node. 


package LinkedList.SinglyLinkedList;

public class DetectStartPointLoop {
    static class LinkedList{                // if we didnt declare a class with static , then we have to create a outer object of DetectStartPointLoop class.
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

        public Node StartingPoint()
        {
            Node fast = head;
            Node slow = head;

            while(fast != null && fast.next != null)        // Detect loop.
            {
                slow = slow.next;
                fast = fast.next.next;

                if(slow == fast)
                {
                    break;
                }
            }

            if(fast == null && fast.next == null)           // No loop
            {
                return null;
            }

            slow = head;                                   // finding the starting point.
            while(slow != fast)
            {
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }

        public void CreateLoop(int position)                    // Creating a loop linked list.
        {
            if(position < 0)
                return;

            Node temp = head;
            Node LoopNode = null;
            int index = 0;

            while(temp.next != null)
            {
                if(index == position)
                {
                    LoopNode = temp;
                }
                index++;
                temp = temp.next;
            }
            temp.next = LoopNode;
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

        list.CreateLoop(2);

        LinkedList.Node Start = list.StartingPoint();

        System.out.println(Start.data);

    }
}
