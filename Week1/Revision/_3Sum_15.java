package Week1.Revision;
import java.util.*;

public class _3Sum_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();

        for(int i = 0; i < n - 2; i++){

            if(i > 0 && nums[i] == nums[i - 1]) continue;

            int j = i + 1;
            int k = n - 1;

            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];

                if(sum == 0){
                    set.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                } else if(sum < 0){
                    j++;
                } else {
                    k--;
                }
            }
        }
        res.addAll(set);
        System.out.println(res);
        sc.close();
    }
}
