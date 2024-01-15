package LeetCode;

public class MinimumSizeSubArray {

	public static void main(String[] args) {
		int target = 7;
		int[] nums = {2,3,1,2,4,3};
		
		System.out.println(minSubArrayLen(target,nums));

	}
	
	public static int minSubArrayLen(int target, int[] nums) {

        int n = nums.length, left = 0, result = Integer.MAX_VALUE, sum = 0;
        for(int r = 0 ; r < n; r++){
            sum += nums[r];
            System.out.println("sum " + sum);

            while(sum >= target){
                result = Math.min(result, r+1-left);
                System.out.println("result " + result);
                sum -= nums[left];
                System.out.println("sum in if " + sum);
                left++;
            }
        }

        return result == Integer.MAX_VALUE ? 0 : result;
        
    }
}
