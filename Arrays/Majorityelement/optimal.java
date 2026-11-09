package Arrays.Majorityelement;

//moore voting algorithm
class Solution {
    public int majorityElement(int[] nums) {
        int c = 0;
        int el = 0;
        for (int i = 0; i < nums.length; i++) {
            if (c == 0) {
                c = 1;
                el = nums[i];
            } else if (nums[i] == el) {
                c++;
            } else {
                c--;
            }
        }
        int c1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (el == nums[i]) {
                c1 = c1 + 1;
            }
        }
        if (c1 > (nums.length / 2)) {
            return el;
        }
        return -1;
    }
}

public class optimal {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 1 };

        Solution sol = new Solution();
        System.out.println(sol.majorityElement(nums));
    }
}