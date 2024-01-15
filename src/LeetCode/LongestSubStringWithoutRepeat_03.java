package LeetCode;

import java.util.HashMap;

public class LongestSubStringWithoutRepeat_03 {

	public static void main(String[] args) {
		String s = "abcabcbb";
		System.out.println(lengthOfLongestSubstring(s));
		
	}
	
	public static int lengthOfLongestSubstring(String s) {
        int max_len = 0;
        int l = 0;
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
        	System.out.println(s.charAt(i));
            if(map.containsKey(s.charAt(i))){
                l = Math.max(l, map.get(s.charAt(i))+1);
                System.out.println("l " + l);
            }
            map.put(s.charAt(i),i);
            max_len = Math.max(max_len, i-l+1);
            System.out.println("max " + max_len);
        }

        return max_len;
    }

}
