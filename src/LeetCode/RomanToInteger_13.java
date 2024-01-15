package LeetCode;

import java.util.HashMap;

public class RomanToInteger_13 {

	public static void main(String[] args) {
		
		String s = "III";
		String s2 = "LVIII";
		String s3 = "MCMXCIV";
		
		RomanToInteger_13 retToInt = new RomanToInteger_13();
		
		System.out.println(retToInt.romanToInt(s));
		System.out.println(retToInt.romanToInt(s2));
		System.out.println(retToInt.romanToInt(s3));
		System.out.println(retToInt.romanToIntAlt(s));
		System.out.println(retToInt.romanToIntAlt(s2));
		System.out.println(retToInt.romanToIntAlt(s3));

	}
	
	public int romanToInt(String s) {
		HashMap<Character, Integer> map = new HashMap<Character,Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		int sum =0;
		
		for(int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i) == 'V' || s.charAt(i) == 'X') {
				if(i >0 && s.charAt(i-1) == 'I') sum -=2;
			}
			if(s.charAt(i) == 'L' || s.charAt(i) == 'C') {
				if(i >0 && s.charAt(i-1) == 'X') sum -=20;
			}
			
			if(s.charAt(i) == 'D' || s.charAt(i) == 'M') {
				if(i >0 && s.charAt(i-1) == 'C') sum -=200;
			}
			 sum += map.get(s.charAt(i));
		}
		
		return sum ;
		
	}
	
	public int romanToIntAlt(String s) {
		HashMap<Character, Integer> map = new HashMap<Character,Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		int sum =0;
		
		for(int i = 0; i < s.length(); i++) {
			
			if(i<s.length()-1 && map.get(s.charAt(i)) < map.get(s.charAt(i+1))) {
				sum -= map.get(s.charAt(i));
			} else {
				sum += map.get(s.charAt(i));
			}
		}
		
		return sum ;
		
	}

}
