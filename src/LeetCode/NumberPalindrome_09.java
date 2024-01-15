package LeetCode;
/*
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 * 
 * Input: x = 121
 * Output : True
 * 
 * Input: x = 10
 * Output : false
 */

public class NumberPalindrome_09 {

	public static void main(String[] args) {
		int num = 121;
		System.out.println(isPalNum(num));
		System.out.println(isPalNum(526));
		System.out.println(isPalNum(-121));

	}
	
	public static boolean isPalNum(int num) {
		
		if(num<0) {return false;}
		
		int reversed = 0;
		int temp = num;
		
		while(temp!=0) {
			int digit = temp%10;   // get the right most digit
			reversed = reversed*10 + digit;
			temp = temp/10; //remove  the right most digit
		}
		
		return (reversed == num);
		
	}

}
