import java.util.*;

public class Q1 {
    // https://codeforces.com/problemset/problem/1837/B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            int max = 1;
            int c = 1;
            for(int i=1;i<n;i++){
                if(s.charAt(i)==s.charAt(i-1)){
                    c++;
                }
                else{
                    c=1;
                }
                max = Math.max(max,c);
            }
            System.out.println(max+1);
        }
    }
}
