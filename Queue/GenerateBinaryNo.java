package Queue;

import java.util.*;

class GenerateBinaryNo {

    public static void generateBinaryNumbers(int n) {

        Queue<String> q = new LinkedList<>();

        q.offer("1");

        for (int i = 0; i < n; i++) {

            String curr = q.poll();

            System.out.print(curr + " ");

            q.offer(curr + "0");
            q.offer(curr + "1");
        }
    }

    public static void main(String[] args) {

        int n = 10;

        generateBinaryNumbers(n);
    }
}