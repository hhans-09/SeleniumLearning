package LeetCode;

import java.util.Arrays;

/*
 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. 
 * The digits are ordered from most significant to least significant in left-to-right order. 
 * The large integer does not contain any leading 0's.
 * 
 * Increment the large integer by one and return the resulting array of digits.
 * 
 * Input = [1,2,4]
 * Expected output = [1,2,5]
 * 
 * Input = [9]
 * Expected output = [1,0]
 * 
 */

public class plusOne_66 {

	public static void main(String[] args) {
		
		int[] digits = {1,2,3};
		int[] digits2 = {9};
		int[] digits3 = {4,9,7};
		int[] digits4 = {9,9,9,9};
				
		System.out.println(Arrays.toString(plusOne(digits)));
		System.out.println(Arrays.toString(plusOne(digits2)));
		System.out.println(Arrays.toString(plusOne(digits3)));
		System.out.println(Arrays.toString(plusOne(digits4)));
		

	}
	
	public static int[] plusOne(int[] digits) {
		int n = digits.length;
		
		for(int i = n-1; i >=0 ; i--) {
			if(digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			
			digits[i]=0;
		}
		
		digits = new int[n+1];
		digits[0]=1;
		return digits;
	}

}
