package LeetCode;
/*
 * You are given an integer array nums. You are initially positioned at the array's first index, 
 * and each element in the array represents your maximum jump length at that position.
 * Return true if you can reach the last index, or false otherwise.
 * 
 * Example:
 * Input: nums = [2,3,1,1,4]
 * Output: true
 * 
 * Input: nums = [3,2,1,0,4]
 * Output: false
 * 
 */

public class JumpGame_55 {

	public static void main(String[] args) {
		int[] nums = {2,3,1,1,4};
		System.out.println(canJump(nums));
		int[] nums2 = {3,2,1,0,4};
		System.out.println(canJump(nums2));

	}

	public static boolean canJump(int[] nums) {
        int finalPos = nums.length - 1;

        for(int i = nums.length -2 ; i >=0 ; i--){
            if(i+nums[i] >= finalPos){
                finalPos = i;
            }
        }
        
        return finalPos == 0;
    }
}
