package Arrays.LeadersinArray;

class lead {
    public int[] answer(int[] nums) {
        int[] ans = new int[nums.length];

        int is = 0;
        for (int i = 0; i < nums.length; i++) {
            int p = 0;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    p = p + 1;
                }
            }
            if (p == nums.length - i - 1) {
                ans[is] = nums[i];
                is = is + 1;
            }
        }
        return ans;
    }
}

public class brute {
    public static void main(String[] args) {
        int[] nums = { 16, 17, 4, 3, 5, 2 };
        lead l = new lead();
        int[] an = l.answer(nums);
        for (int i = 0; i < an.length; i++) {
            if (an[i] != 0) {
                System.out.println(an[i]);
            }
        }
    }
}
