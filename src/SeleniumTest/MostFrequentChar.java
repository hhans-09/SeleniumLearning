package SeleniumTest;

import java.util.HashMap;
import java.util.Map;

/*
 * Write a function that accepts a String as input and returns the character that appears most frequently in that String.
 * 
 * Clarifying Questions & Assumptions
 * Answers to questions the fellows may ask:
 * Could the input String ever be null? Yes
 * What should be returned if input is null? Return null
 * What should be returned if input is an empty string? Return an empty string
 * Do spaces count? No; ignore spaces
 * Do punctuation or digits count? Yes; consider them like like you would letters
 * Does case matter? No, "a" should be treated as equivalent to "A"
 * What if two or more characters "tie" as the most frequently occurring? Return whichever one appears first in the input String
 * 
 * Sample Inputs & Outputs
 * mostFrequentChar("Hello World!") returns 'l'
 * mostFrequentChar("abacaba") returns 'a'
 * mostFrequentChar("xyyXzz") returns 'x' (not y)
 * mostFrequentChar("") returns ''
 * mostFrequentChar("a b a b a") returns 'a' (not space)
 * 
 * 
 */

public class MostFrequentChar {

	public static void main(String[] args) {
		System.out.println(mostFrequent("Hello World!"));
		System.out.println(mostFrequent("abacaba"));
		System.out.println(mostFrequent("xyyXzz"));
		System.out.println(mostFrequent(""));
		System.out.println("value : "+ mostFrequent("a b a b a"));

	}
	
	public static Character mostFrequent(String str) {
		
		if(str.isEmpty() || str == null) {
			return null;
		}
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(int i =0; i < str.length(); i++) {
			char c = Character.toLowerCase(str.charAt(i));
			if(c != ' ') {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
				
			} else map.put(c, 1);
		}
	}
		
		char mostFreq = str.charAt(0);
		
		for(int i = 0; i < str.length(); i++) {
			char currentChar = Character.toLowerCase(str.charAt(i));
			
			if(currentChar != ' ' && map.get(currentChar) > map.get(Character.toLowerCase(mostFreq))) {
				mostFreq = str.charAt(i);
			}
		}
		
		return mostFreq;
		
		
		
		
	}

}
