package Stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class AsteroidCollision {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int[] res = Asteroid(arr);
        System.out.println(Arrays.toString(res));
        sc.close();
    }

    static int[] Asteroid(int[] arr)
    {
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;

        for(int i = 0; i < n; i++)
        {
            boolean destroyed = false;
            while(!stack.isEmpty() && arr[i] < 0 && stack.peek() > 0)
            {
                if(stack.peek() < arr[i])
                {
                    stack.pop();
                    continue;
                }
                else if(stack.peek() == arr[i])
                {
                    stack.pop();
                }

                destroyed = true;
                break;
            }
            if(!destroyed){
                stack.push(arr[i]);
            } 
        }

        int[] res = new int[stack.size()];
        for(int i = stack.size() - 1; i >= 0; i--)
        {
            res[i] = stack.pop();
        }

        return res;
    }
}
