package LeetCode;
/*
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack,
 *  or -1 if needle is not part of haystack.
 *  
 *  Input: haystack = "sadbutsad", needle = "sad"
 *  Output: 0
 *  
 *  Input: haystack = "leetcode", needle = "leeto"
 *  Output: -1
 * 
 */

public class FirstOccurance_28 {

	public static void main(String[] args) {
		String haystack = "sadbutsad";
		String needle = "sad";
		System.out.println(strInStr(haystack, needle));
		System.out.println(strInStrSub(haystack, needle));
		haystack = "leetcode";
		needle = "leeto";
		System.out.println(strInStr(haystack, needle));
		System.out.println(strInStrSub(haystack, needle));
		System.out.println(strInStrSub(haystack, ""));
		
		haystack = "leetcode";
		needle = "code";
		System.out.println(strInStr(haystack, needle));
		System.out.println(strInStrSub(haystack, needle));
		

	}
	
	public static int strInStr(String haystack, String needle) {
		if(needle.length() == 0 || needle == "") {return 0;}
		
		for(int i = 0; i < haystack.length() ; i++) {
			if(haystack.charAt(i) == needle.charAt(0)) {
				if(needle.length() > haystack.length() - i) {
					return -1;
				}
				
				boolean isValid = false;
				for(int j = 0; j < needle.length(); j++) {
					if(haystack.charAt(i+j) != needle.charAt(j)) {
						isValid = false;
						break;
					}
					
					isValid = true;
				}
				if(isValid) {return i;}
				
				
			}
		}
		return -1;
		
	} 
	
	public static int strInStrSub(String haystack, String needle) {
		
		if(needle.length() == 0 || needle == "") {return 0;}
		
		int a = haystack.length();
		int b = needle.length();
		
		for(int i = 0; i<= a-b ; i++) {
			if(haystack.substring(i, i+b).equals(needle)) {
				return i;
			}
		}
		
		return -1;
		
	}

}
