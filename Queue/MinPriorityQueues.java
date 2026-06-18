package Queue;
import java.util.*;

public class MinPriorityQueues {
    public static void main(String[] args)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(20);
        pq.offer(50);
        pq.offer(30);
        pq.offer(10);

        System.out.println(pq);

        while(!pq.isEmpty())
        {
            System.out.println(pq.poll());
        }
    }
}
