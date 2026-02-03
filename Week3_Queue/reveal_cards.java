package Week3_Queue;
import java.util.*;
public class reveal_cards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   
        int[] cards = new int[n];
        for (int i = 0; i < n; i++) {
            cards[i] = sc.nextInt();
        }
        Arrays.sort(cards);
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            q.add(i);
        }
        int[] result = new int[n];
        for(int i=0;i<n;i++){
            int idx = q.poll();
            result[idx] = cards[i];
            q.add(q.poll());
        }
        for(int i=0;i<n;i++){
            System.out.print(result[i]+" ");
        }
    }
}
