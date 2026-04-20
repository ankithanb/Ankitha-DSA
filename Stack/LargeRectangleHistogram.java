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
