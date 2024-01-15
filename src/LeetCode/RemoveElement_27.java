package LeetCode;
/*
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. 
 * The order of the elements may be changed. 
 * Then return the number of elements in nums which are not equal to val.
 * 
 * Input: nums = [3,2,2,3], val = 3
 * Output: 2, nums = [2,2,_,_]
 * 
 * Input: nums = [0,1,2,2,3,0,4,2], val = 2
 * Output: 5 ,  nums = [0,1,4,0,3,_,_,_]
 * 
 */

public class RemoveElement_27 {

	public static void main(String[] args) {
		int[] nums = {3,2,2,3};
		int val =3;
		
		System.out.println(removeElement(nums,val));

	}
	
	 public static int removeElement(int[] nums, int val) {


	        int count = 0;
	        for(int i = 0; i < nums.length; i++){
	            if(nums[i] != val){
	                nums[count] = nums[i];
	                count++;

	            }
	        }

	        return count;
	        
	    }

}
