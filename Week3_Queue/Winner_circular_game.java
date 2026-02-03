package Week3_Queue;

import java.util.*;

public class Winner_circular_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            q.add(i);
        }
        while (q.size() != 1) {
            for (int i = 0; i < k-1; i++) {
                q.add(q.poll());
            }
            q.poll();
        }
        System.out.println("winner is: "+q.peek());
        sc.close();
    }
}
