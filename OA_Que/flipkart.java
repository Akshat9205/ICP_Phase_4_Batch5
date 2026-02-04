// Problem Statement: You are a data analyst at a tech company working on optimizing a financial portfolio represented by an array of daily profit and loss values, nums. Each element in the array corresponds to the net gain or loss for a specific day. Your goal is to maximize the total profit over the period by applying a special operation exactly k times: selecting any day’s value and flipping its sign (changing a loss to a gain or vice versa).
// Because the sign flip operation can be applied multiple times to the same day, you have the flexibility to repeatedly change any value. Your task is to determine the highest possible sum of the array after performing exactly k flips.
// For example, flipping a negative value to positive increases profit, while flipping a positive value to negative might be beneficial if it helps to flip another negative value multiple times, depending on the total number of flips available.
// Write an efficient algorithm that takes an integer array nums representing daily profit/loss and an integer k indicating the number of sign flips. Return the maximum possible total profit after exactly k flips. Your solution should handle various scenarios, including arrays with positive, negative, and zero values, ensuring optimal decisions on which values to flip and when to flip them multiple times.

// Constraints:
// 1 <= nums.length <= 10^4
// -100 <= nums[i] <= 100
// 1 <= k <= 10^4

// Example 1:
// Input: nums = [4,2,3], k = 1
// Output: 5
// Explanation: Choose index 1 and nums becomes [4,-2,3].

// Example 2:
// Input: nums = [3,-1,0,2], k = 3
// Output: 6
// Explanation: Choose indices (1, 2, 2) and nums becomes [3,1,0,2].

// Example 3:
// Input: nums = [2,-3,-1,5,-4], k = 2
// Output: 13
// Explanation: Choose indices (1, 4) and nums becomes [2,3,-1,5,4].

// Input0:
// 4 1 8 7
// 3
// Outptu0:
// 18
// Input1:
// -1 2 1 9 4
// 4
// Outptu1:
// 15
// Input2
// 3 4 2 9 10
// 5
// Outptu2:
// 24
// Input3:
// 1 6 2 7
// 3
// Outptu3:
// 14
// Input4:
// 2 7 1 8 10 9 -3
// 4
// Outptu4:
// 38
// Input5:
// 2 -1 3 5 9
// 4
// Outptu5:
// 18
package OA_Que;
import java.util.*;
public class flipkart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];    
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        Arrays.sort(nums);
        int i = 0;
        while (i < nums.length && nums[i] < 0 && k > 0) {
            nums[i] = -nums[i];
            i++;
            k--;
        }
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int num : nums) {
            sum += num;
            min = Math.min(min, num);
        }
        if (k % 2 == 1) {
            sum -= 2 * min;
        }
        System.out.println(sum);
        sc.close();
    }
}
