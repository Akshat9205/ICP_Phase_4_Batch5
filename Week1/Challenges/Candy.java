package Week1.Challenges;
import java.util.*;
public class Candy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int res = canEat(a);
        System.out.println("She can eat : " + res);
        sc.close();
    }
    public static int canEat(int []a){
        int n = a.length/2;
        HashSet<Integer>set = new HashSet<>();
        for(int  i:a){
            set.add(i);
        }
        return Math.min(n, set.size());
    }
}
