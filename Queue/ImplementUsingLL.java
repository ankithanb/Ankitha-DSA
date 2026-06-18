package Queue;

public class ImplementUsingLL {
    static class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
        }
    }
    static class Queue{
        Node front , rear;

        void Enqueue(int x)
        {
            Node temp = new Node(x);

            if(rear == null)
            {
                front = rear = temp;
                System.out.print(rear.data + " ");
                return;
            }

            rear.next = temp;
            rear = temp;
            System.out.print(rear.data + " ");
        }

        void Dequeue()
        {
            if(front == null)
            {
                System.out.println("Empty");
                return;
            }
            System.out.print(front.data + " ");
            front = front.next;

            if(front == null)
            {
                rear = null;
            }
        }
    }

    public static void main(String[] args)
    {
        Queue q = new Queue();
        q.Enqueue(10);
        q.Enqueue(20);
        q.Enqueue(30);

        System.out.println();

        q.Dequeue();
        q.Dequeue();

        System.out.println();
        
        q.Enqueue(40);
    }
}
