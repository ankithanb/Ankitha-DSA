package Queue;

public class CircularQueue {
    static class queue{
        int[] arr = new int[5];
        int front = -1, rear = -1;
        int size = arr.length;

        void enqueue(int x)
        {
            if((rear + 1) % size == front)
            {
                System.out.println("Queue is full");
                return;
            }

            if(front == -1)
            {
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = x;
            System.out.print(arr[rear]+" ");
        }

        void dequeue()
        {
            if(front == -1)
            {
                System.out.println("Queue is empty");
                return;
            }

            System.out.print(arr[front] + " ");

            if(front == rear)
            {
                front = rear = -1;
            }
            else{
                front = (front + 1) % size;
            }
        }
    }

    public static void main(String[] args)
    {
        queue q = new queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        
        System.out.println();

        q.dequeue();
        q.dequeue();
        
        System.out.println();

        q.enqueue(60);

    }
}

