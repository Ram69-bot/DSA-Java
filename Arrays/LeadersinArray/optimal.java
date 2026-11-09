package Arrays.LeadersinArray;

import java.util.*;

class Solution {
    public List<Integer> leaders(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();
        int n = nums.length;
        int max = nums[n - 1];
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] >= max) {
                al.add(nums[i]);
                max = nums[i];
            }
        }
        return al;

    }
}

public class optimal {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = { 16, 17, 4, 3, 5, 2 };
        List<Integer> an = sol.leaders(nums);
        for (int i : an) {
            System.out.println(i);
        }

    }
}
