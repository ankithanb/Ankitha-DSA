package Queue;

public class ImplementUsingArray {
    static class Queue{
    int[] arr = new int[5];
    int front = -1, rear = -1;

    void Enqueue(int x)
    {
        if(rear == arr.length  -1)
        {
            System.out.println("Array is overflow");
            return;
        }

        if(front == -1)
            front = 0;

        arr[++rear] = x;
        System.out.print(x+" ");
    }

    void Dequeue()
    {
        if(front == -1 || front > rear)
        {
            System.out.println("Array is underflow");
            return;
        }

        System.out.println();
        System.out.println("The Deleted item is : " + arr[front++]);
    }
    }
    public static void main(String[] args)
    {
        Queue qq = new Queue();
        qq.Enqueue(10);
        qq.Enqueue(20);
        qq.Enqueue(30);
        qq.Enqueue(40);

        qq.Dequeue();
    }
}
