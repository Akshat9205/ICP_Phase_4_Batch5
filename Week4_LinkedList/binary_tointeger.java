package Week4_LinkedList;
import java.util.*;
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class binary_tointeger {
    static ListNode takeInput(Scanner sc) {
        ListNode head = null, tail = null;
        while (true) {
            int x = sc.nextInt();
            if (x == -1) break;
            ListNode node = new ListNode(x);
            if (head == null) {
                head = tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
        }
        return head;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListNode head = takeInput(sc);
        System.out.println(getDecimalValue(head));
    }
    static int getDecimalValue(ListNode head) {
        int ans = 0;
        while (head != null) {
            ans = ans * 2 + head.val;
            head = head.next;
        }
        return ans;
    }
}
