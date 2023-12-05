package EasyCodes;

public class TwoSum {
	public static void main(String[] args) {
        int[] nums = {1,2,22,4};
        int target = 26;
        TwoSum sol = new TwoSum();
        int[] ans = sol.twoSum(nums, target);
        System.out.println(ans);
	}

    public int[] twoSum(int[] nums, int target) {
        int addition = 0;
        for (int i = 0; i<=nums.length; i++){
             addition += i;
        }
        
        return null;
    }
}
