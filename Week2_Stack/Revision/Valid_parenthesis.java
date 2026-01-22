package Week2_Stack.Revision;
import java.util.*;
public class Valid_parenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(isValid(str));
        sc.close();
    }
    public static boolean isValid(String s){
        // Optimized Approach
        // Stack<Character> st = new Stack<>();
        // for(char ch : s.toCharArray()){
        //     if(ch=='(' || ch=='{' || ch=='['){
        //         st.push(ch);
        //     }else{
        //         if(st.isEmpty()){
        //             return false;
        //         }
        //         char top = st.pop();
        //         if((ch==')' && top!='(') || (ch=='}' && top!='{') || (ch==']' && top!='[')){
        //             return false;
        //         }
        //     }
        // }
        // return st.isEmpty();

        // brute force approach
        if(s.length()%2!=0){
            return false;
        }
        boolean c = true;
        while(c){
            c = false;
            if(s.contains("()")){
                s = s.replace("()", "");
                c = true;
            }
            if(s.contains("{}")){
                s = s.replace("{}", "");
                c = true;
            }
            if(s.contains("[]")){
                s = s.replace("[]", "");
                c = true;
            }
        }
        return s.isEmpty();
    }
}
