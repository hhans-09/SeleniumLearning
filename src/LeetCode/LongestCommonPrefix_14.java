package LeetCode;

import java.util.Arrays;

public class LongestCommonPrefix_14 {

	public static void main(String[] args) {
		String[] strs = {"flower","flow","flight"};
		String[] strs2 = {"dog","racecar","car"};
		
		
		System.out.println(longestPrefix(strs));
		System.out.println(longestPrefixAlt(strs));
		System.out.println(longestPrefix(strs2));
		System.out.println(longestPrefixAlt(strs2));
	}
	
	public static String longestPrefix(String[] strs) {
		if(strs.length == 0) {return "" ;}
		
		String prefix = strs[0];
		
		for(int i = 1; i < strs.length; i++) {
			while(strs[i].indexOf(prefix) != 0) {
				
				prefix = prefix.substring(0, prefix.length()-1);
				
			}
		}
		
		return prefix;
		
		
	}
	
	public static String longestPrefixAlt(String[] strs) {
		if(strs.length == 0) {return "" ;}
		
		Arrays.sort(strs);
		String s1 = strs[0];
		String s2 = strs[strs.length-1];
		int idx = 0;
		
		while(idx < s1.length() && idx < s2.length()) {
			if(s1.charAt(idx) == s2.charAt(idx)) {
				idx ++;
			} else {
				break;
			}
		}
		
		return s1.substring(0,idx);
		
		
	}

}
