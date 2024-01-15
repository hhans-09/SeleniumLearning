package LeetCode;

/*
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. 
 * The relative order of the elements should be kept the same. 
 * Then return the number of unique elements in nums.
 * 
 * Input: nums = [1,1,2]
 * Output: 2,
 * 
 * Input: nums = [0,0,1,1,1,2,2,3,3,4]
 * Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
 */
public class RemoveDuplicateFromArray_26 {

	public static void main(String[] args) {
		int[] nums = {1,1,2};
		int[] arr = {0,0,1,1,1,2,2,3,3,4};
		
		System.out.println(removeDuplicates(nums));
		System.out.println(removeDuplicates(arr));
				

	}
	
	public static int removeDuplicates(int[] nums) {
		
		int count = 1;
		for(int i=0; i < nums.length-1; i++) {
			if(nums[i] != nums[i+1]) {
				nums[count] = nums[i+1];
				count++;
			}
		}
		
		return count;
		
	}

}

