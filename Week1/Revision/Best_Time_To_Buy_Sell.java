package Revision;

import java.util.Scanner;

public class Best_Time_To_Buy_Sell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cost = new int[n];
        for (int i = 0; i < n; i++) {
            cost[i] = sc.nextInt();
        }
        int buy = cost[0];
        int maxp = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            if (cost[i] < buy) {
                buy = cost[i];
            } 
            else {
                maxp = Math.max(maxp, cost[i] - buy);
            }
        }
        if (maxp == Integer.MIN_VALUE) {
            System.out.println(0);
            return;
        }
        System.out.println(maxp);
        sc.close();
    }
}
// Brute Force
// for(int i=0;i<n;i++){
//      int buy=cost[i];
//      for(int j=i;j<n;j++){
//          if(cost[j]>buy){
//              maxp=Math.max(maxp,cost[j]-buy);
//          }
//      }
//  }
// System.out.println(maxp);
