
// CodeForces Problem Link: https://codeforces.com/problemset/problem/1899/A
import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            if(n%3==0){
                System.out.println("SECOND");
            }
            else{
                System.out.println("FIRST");
            }
        }
    }
}


