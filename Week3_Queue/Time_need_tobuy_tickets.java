package Week3_Queue;
import java.util.*;
public class Time_need_tobuy_tickets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] tickets = new int[n];
        for (int i = 0; i < n; i++) {
            tickets[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int time = 0;   
        Queue<Integer>q = new LinkedList<>();
        for(int i=0;i<n;i++){
            q.add(i);
        }
        while(!q.isEmpty()){
            time++;
            int idx = q.poll();
            tickets[idx]--;
            if(tickets[idx]>0){
                q.add(idx);
            }
            else {
                if(idx==k){
                    System.out.println("Time needed;"+time);
                    break;
                }
            }
        }
        sc.close();
    }
}
