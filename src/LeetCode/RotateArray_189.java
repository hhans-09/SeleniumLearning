package LeetCode;

import java.util.Arrays;

public class RotateArray_189 {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7};
		int k = 3;
		
		int[] rotated = rotate(nums,k);
		System.out.println(Arrays.toString(rotated));
		
		int[] nums2 = {-1,-100,3,99};
		 int l = 2;
		
		int[] rotated2 = rotate(nums2,l);
		System.out.println(Arrays.toString(rotated2));

	}
	
	public static int[] rotate(int[] nums, int k) {
        k = k% nums.length;

        reverse(nums,0, nums.length-1);
        reverse(nums,k,nums.length-1);
        reverse(nums,0,k-1);
        
       
        return nums;
    }

    static void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
