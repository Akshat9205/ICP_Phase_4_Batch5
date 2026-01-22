package Week1.Revision;
import java.util.*;
public class Count_Primes_204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        boolean []a = new boolean[n+1];
        int c = 0;
        Arrays.fill(a,true);
        a[0] = false;
        a[1] = false;
        for(int i=2;i<=n;i++){
            if(a[i]){
                for(int j=2;j*i<=n;j++){
                    a[i*j] = false;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(a[i]==true){
                c++;
            }
        }
        System.out.println(c);
        sc.close();
    }
}
