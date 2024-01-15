package SeleniumTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnagramOrSubset {

	public static void main(String[] args) {
		String s1 = "elbow";
		String s2 = "below";
		
		isAnagramOrSubString(s1,s2);
		
		String s3 = "below";
		String s4 = "elboww";
		
		isAnagramOrSubString(s3,s4);
		
		System.out.println("***********");
		isAnagram(s1,s2);
		isAnagram(s3,s4);

	}
	
	public static void isAnagramOrSubString(String s1, String s2) {
		
		
			char[] arr1 = s1.toCharArray();
			char[] arr2 = s2.toCharArray();
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			if(Arrays.equals(arr1,arr2)) {
				System.out.println("Strings are anagram");
			
		} else {
			
			boolean isSubset = false;
			
			for(char ch1 : arr1) {
				boolean found = false;
				for(char ch2 : arr2) {
					
					if(ch1 == ch2) {
						found = true;
						break;
					}
					
					
				}
				
				if(!found) {
					isSubset = false;
					break;
				}
			}
			
			if(isSubset) {
				System.out.println("strings are subseet");
			} else {
				System.out.println("strings are neither anagram or subset");
			}
				
			
			
		}
		
		
		
	}
	
	
	
	public static void isAnagram(String s1, String s2) {
		Map<Character, Integer> map = new HashMap<>();
		
		for(char ch : s1.toCharArray()) {
			map.put(ch, map.getOrDefault(ch,0)+1);
		}
		
		for(char ch : s2.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)-1);
		}
		
		boolean strAnagram = true;
		for(int val : map.values()) {
			if(val != 0) {
				strAnagram= false;
				break;
			}
			
			
		}
		
		if(strAnagram) {
			System.out.println("Strings are anagram");
		} else 
		
		System.out.println("Strings are not anagram");
		
		
	}

}
