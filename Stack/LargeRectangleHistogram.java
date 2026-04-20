// this is a program to find : how to find the maximum area using range expansion and monotonic stacks.
// Algorithm :
// Create a empty stack.
// Maxarea = 0.
// for each element :
//      find currentHeight, i == n ? 0 : heights[i].
//      while stack not empty AND current height < height at stack top
//          find height = heights[stack.pop()];
//          find boundaries :
//              right = i.
//              left = stack.peek() or -1.
//          find width = right - left - 1.
//          area = height × width
//          maxArea = max(maxArea, area)
//          push the index value into the stack.
// return the maxArea.

// Time complexity : O(n).
// Space complexity : O(n).


package Stack;

import java.util.Scanner;
import java.util.Stack;

public class LargeRectangleHistogram {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] heights = new int[n];
        
        for(int i = 0; i < n; i++)
        {
            heights[i] = sc.nextInt();
        }
        int result = Area(heights);
        System.out.println(result);
        sc.close();
    }

    static int Area(int[] heights)
    {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;

        for(int i = 0; i < n; i++)
        {
            int currentHeight = (i == n) ? 0 : heights[i];
            while(!stack.isEmpty() && currentHeight < heights[stack.peek()])
            {
                int height = heights[stack.pop()];

                int right = i;
                int left = stack.isEmpty() ? -1 : stack.peek();

                int width = right - left - 1;

                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }
        return maxArea;
    }
}
