package Week1.Challenges;

import java.util.ArrayList;
import java.util.Scanner;

public class Distribute_cookie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> cookies = new ArrayList<>();
        for(int i=0;i<n;i++){
            cookies.add(sc.nextInt());
        }
        ArrayList<Integer> child = new ArrayList<>();
        for(int i=0;i<n;i++){
            child.add(sc.nextInt());
        }
        sc.close();
        int result = distributeCookies(cookies,child);
        System.out.println("Maximum different types of cookies the child can get: " + result);
    }
    public static int distributeCookies(ArrayList<Integer> cookies,ArrayList<Integer> child){
        int c=0;
        int i=0;
        int j=0;
        while(i<cookies.size() && j<child.size()){
            if(cookies.get(i).equals(child.get(j))){
                c++;
                i++;
                j++;
            }
            else if(cookies.get(i)<child.get(j)){
                i++;
            }
            else{
                j++;
            }
        }
        return c;
    }
}
