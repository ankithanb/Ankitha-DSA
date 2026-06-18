// this is priority queue question..
// in this program, offer the value into the queue.
// they will give the k value, that number of values should be in the queue, if more than that then remove by using the poll() function.
// and return the peek() value;

package Queue;
import java.util.*;

public class KthLargestElementInStream {
    PriorityQueue<Integer> pq;
    int k;

    public KthLargestElementInStream(int k, int[] nums) {
        pq = new PriorityQueue<>();             // this is a smallest priority queue.
        this.k = k;

        for(int num : nums)
        {
            add(num);
        }
    }

    public int add(int val){
        pq.offer(val);

        if(pq.size() > k)
        {
            pq.poll();
        }
        return pq.peek();
    }
}
