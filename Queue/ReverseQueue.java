package Queue;
import java.util.Stack;

public class ReverseQueue {
    static class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
        }
    }
    static class Queue{
        Node front, rear;

        void Enqueue(int x)                 // for inserting the elements in the rear point.
        {
            Node temp = new Node(x);

            if(rear == null)
            {
                front = rear = temp;
                return;
            }
            rear.next = temp;
            rear = temp;
        }

        int Dequeue()                       // for deleting the elements in the front point.
        {
            if(front == null)
            {
                System.out.println("Empty");
                return -1;
            }
            int val = front.data;
            front = front.next;

            if(front == null)
            {
                rear = null;
            }
            return val;
        }

        boolean isEmpty() {
            return front == null;
        }

        void Reverse()
        {
            Stack<Integer> st = new Stack<>();
            while(!isEmpty())
            {
                st.push(Dequeue());
            }

            while(!st.isEmpty())
            {
                Enqueue(st.pop());
            }
        }

        void display()
        {
            Node temp = front;

            while(temp != null)
            {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Queue q = new Queue();

        q.Enqueue(10);
        q.Enqueue(20);
        q.Enqueue(30);

        System.out.println("Original queue : ");
        q.display();

        q.Reverse();

        System.out.println("Reversed queue : ");
         q.display();
    }
}
