import java.util.*;
public class Q3 {
    // https://codeforces.com/contest/1878/problem/A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int []a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            boolean ok = false;
            for (int l = 0; l < n; l++) {
                int[] freq = new int[101];
                for (int r = l; r < n; r++) {
                    freq[a[r]]++;
                    int fk = freq[k];
                    boolean isMost = true;
                    for (int x = 1; x <= 100; x++) {
                        if (x != k && freq[x] >= fk) {
                            isMost = false;
                            break;
                        }
                    }
                    if (fk > 0 && isMost) {
                        ok = true;
                        break;
                    }
                }
                if (ok) break;
            }
            System.out.println(ok ? "YES" : "NO");
        }
    }
}
