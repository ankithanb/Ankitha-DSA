package Stack;

import java.util.Scanner;
import java.util.Arrays;
public class CarFleet {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] position = new int[n];
        for(int i = 0; i < n; i++)
        {
            position[i] = sc.nextInt();
        }
        int[] speed = new int[n];
        for(int i = 0; i < n; i++)
        {
            speed[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        int result = Fleet(target, position, speed);
        System.out.println(result);
        sc.close();
    }

    static int Fleet(int target, int[] position, int[] speed)
    {
        int n = position.length;
        double[][] cars = new double[n][2];

        for(int i = 0; i < n; i++)
        {
            cars[i][0] = position[i];
            cars[i][1] = (double)(target - position[i]) / speed[i];
        }

        Arrays.sort(cars,(a, b) -> Double.compare(b[0] , a[0]));
        
        int fleet = 0;
        double maxTime = 0;

        for(int i = 0; i < n; i++)
        {
            if(cars[i][1] > maxTime)
            {
                fleet++;
                maxTime = cars[i][1];
            }
        }
        return fleet;
    }
}
