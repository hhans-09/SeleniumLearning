package LeetCode;

import java.util.Stack;

public class ValidParanthesis_20 {

	public static void main(String[] args) {
		
		ValidParanthesis_20 valPar = new ValidParanthesis_20();
		System.out.println(valPar.isValid("()"));
		System.out.println(valPar.isValid("()[]{}"));
		System.out.println(valPar.isValid("(]"));
		System.out.println(valPar.isValid("({})"));
		System.out.println(valPar.isValid("()]"));
		System.out.println(valPar.isValid("([)]"));
		System.out.println(valPar.isValid("([}}])"));
		
	}
	
	public boolean isValid(String s) {

        if(s.length() % 2 != 0) {return false;}

        Stack<Character> stack = new Stack();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            } else {
            	if (stack.isEmpty()) {return false;} 
            	if (c == ')' && stack.peek() == '(' 
                    || c == '}' && stack.peek() == '{'
                        || c == ']' && stack.peek() == '['
                     ){
                         stack.pop();
                     } 
            	else {return false;}
            }
        }

        return stack.isEmpty();

        
    }

}
