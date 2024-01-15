package LeetCode;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/*
 * Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order,
 * find two numbers such that they add up to a specific target number. 
 * Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
 * Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
 * 
 * The tests are generated such that there is exactly one solution. You may not use the same element twice.
 * Your solution must use only constant extra space.
 * 
 * Input: nums = [2,7,11,15], target = 9
 * Output: [1,2]
 * Explanation: Because nums[0] + nums[1] == 9, we return [1, 2].
 * 
 * Example 2:
 * Input: nums = [2,3,4], target = 6
 * Output: [1,3]
 * 
 * Example 3:
 * Input: nums = [-1,0], target = -1
 * Output: [1,2]
 * 
 */
public class TwoSumII_167 {

	public static void main(String[] args) {
		int[] nums = {2,7,11,15};
		int target = 17;
		
		TwoSumII_167 twoSum = new TwoSumII_167();
		System.out.println(Arrays.toString(twoSum.twoSum(nums, target)));
		
	}
	
	public int[] twoSum(int[] numbers, int target) {

        Map<Integer, Integer> map = new LinkedHashMap<>();
        int[] arr = new int[2];
        int n = numbers.length;

        for(int i = 0; i <n; i++){
            map.put(numbers[i],i);
        }

        for(int i= 0; i < n; i++){
            if(map.containsKey(target-numbers[i])){
                int j = map.get(target-numbers[i]);
                arr[0] = i+1;
                arr[1] = j+1;
                break;
            }
        }

        return arr;
}
}
