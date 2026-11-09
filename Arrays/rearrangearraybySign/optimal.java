package Arrays.rearrangearraybySign;

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int pos = 0;
        int neg = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                ans[pos] = nums[i];
                pos = pos + 2;
            } else if (nums[i] < 0) {
                ans[neg] = nums[i];
                neg = neg + 2;
            }

        }
        return ans;
    }
}

public class optimal {
    public static void main(String[] args) {
        int[] nums = { 3, 1, -2, -5, 2, -4 };
        Solution sol = new Solution();
        int[] ans1 = sol.rearrangeArray(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(ans1[i]);
        }
    }
}
