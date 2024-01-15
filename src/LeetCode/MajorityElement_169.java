package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class MajorityElement_169 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < n ; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i]) > n/2) {
            	return nums[i];
            }
            
        }
        
        return 0;
        
    }
	public int majorityElementAlt(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        return nums[n/2];
        
    }

}
