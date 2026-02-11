// https://codeforces.com/problemset/problem/1559/A


import java.util.*;
public class Q5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int ans=sc.nextInt();
            for(int i=1;i<n;i++){
                ans&=sc.nextInt();
            }
            System.out.println(ans);
        }
    }
}