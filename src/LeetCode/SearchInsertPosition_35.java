package LeetCode;
/*
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. 
 * If not, return the index where it would be if it were inserted in order.
 * 
 * You must write an algorithm with O(log n) runtime complexity.
 * 
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 * 
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 * 
 */

public class SearchInsertPosition_35 {

	public static void main(String[] args) {
		int[] nums = {1,3,5,6};
		int target = 5;
		
		SearchInsertPosition_35 searchPos = new SearchInsertPosition_35();
		System.out.println(searchPos.searchInsert(nums, target));
		
		target = 2;
		System.out.println(searchPos.searchInsert(nums, target));
		
		target = 7;
		System.out.println(searchPos.searchInsert(nums, target));
		

	}

	
	public int searchInsert(int[] nums, int target) {

        int low = 0;
        int high = nums.length -1;

        while(low <= high){
            int mid = low + (high-low) /2;
            if (nums[mid] == target) {
                return mid;
            }
            if(nums[mid] > target){
                high = mid -1;
            } else {
                low = mid+1;
            }
        }

        return low;
        
    }
	
	
}
