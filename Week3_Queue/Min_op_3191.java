package Week3_Queue;
import java.util.*;
public class Min_op_3191 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }   
        int c = 0;
        for(int i=0;i<n-2;i++){
            if(a[i]==0){
                a[i] = 1;
                a[i+1] = 1-a[i+1];
                a[i+2] = 1-a[i+2];
                c++;
            }
        }
        System.out.println(c);
        sc.close();
    }
}
