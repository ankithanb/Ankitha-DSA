package Queue;

class MyCircularQueue {
    int[] arr;
    int front;
    int rear;
    int size;

    public MyCircularQueue(int k) {
        arr = new int[k];
        front = -1;
        rear = -1;
        size = k;
    }
    
    public boolean enQueue(int value) {
        if((rear + 1) % size == front)          // if(isFull()) is also ok beacuse it is the operation of that C.queue.
        {
            return false;
        }
        if(front == -1)
        {
            front = 0;
        }
        
        rear = (rear + 1) % size;
        arr[rear] = value;
        return true;
    }
    
    public boolean deQueue() {
        if(front == -1)               // if(isEmpty()) is also ok, because it is the operation of the C.queue.
        {
            return false;
        }
        if(front == rear)
        {
            front = rear = -1;
        }
        else{
            front = (front + 1) % size;
        }
        return true;
    }
    
    public int Front() {
        if(front == -1)                 // return (isEmpty()) ? -1 : arr[rear];
        {
            return -1;
        }
        return arr[front];
    }
    
    public int Rear() {
        if(isEmpty())                   // return (isEmpty()) ? -1 : arr
        {
            return -1;
        } 
        return arr[rear];
    }
    
    public boolean isEmpty() {
        return front == -1;
    }
    
    public boolean isFull() {
        return (rear + 1) % size == front;
    }
}
