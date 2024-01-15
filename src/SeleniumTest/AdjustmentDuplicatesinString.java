package SeleniumTest;

import java.util.Stack;

/*
 * Prompt
 * Given a string str, a duplicate removal consists of choosing two adjacent and equal letters, and removing them.
 * We repeatedly make duplicate removals on S until we no longer can.
 * Return the final string after all such duplicate removals have been made. It is guaranteed the answer is unique.
 * 
 */

public class AdjustmentDuplicatesinString {

	public static void main(String[] args) {
		String input = "abbaca";
        String result = removeAdjDuplicates(input);
        System.out.println(result);

	}
	
	public static String removeAdjDuplicates(String str) {
		if(str.isEmpty()) {
			return null;
		}
		
		Stack<Character> stack = new Stack<>();
		
		
		for(int i = 0; i < str.length(); i++ ) {
			if(!stack.isEmpty() && stack.peek() == str.charAt(i)) {
				stack.pop();
			} else {
				stack.push(str.charAt(i));
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(char ch : stack) {
			sb.append(ch);
		}
		
		return sb.toString();
		
	}

}
