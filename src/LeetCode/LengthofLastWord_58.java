package LeetCode;

/*
 * Given a string s consisting of words and spaces, return the length of the last word in the string.
 * A word is a maximal substring consisting of non-space characters only.
 * 
 * Input: s = "Hello World"
 * Output: 5
 * 
 * Input: s = "   fly me   to   the moon  "
 * Output: 4
 * 
 */

public class LengthofLastWord_58 {

	public static void main(String[] args) {
		String s = "Hello World";
		String s1 = "   fly me   to   the moon  ";
		String s2 = "luffy is still joyboy";
		
		System.out.println(lengthOfLastWord(s));
		System.out.println(lengthOfLastWord(s1));
		System.out.println(lengthOfLastWord(s2));
		
		System.out.println(lenOfLastWord(s));
		System.out.println(lenOfLastWord(s1));
		System.out.println(lenOfLastWord(s2));


	}
	
	public static int lengthOfLastWord(String s) {

	    s=s.trim();
	    int count=0;
	    for(int i = s.length()-1; i >=0; i--){
	        if(s.charAt(i) == ' '){
	            break;
	        }
	        count++;
	    }

	    return count;
	       
	    }
	
	public static int lenOfLastWord(String s) {
		s = s.trim();
		String[] str = s.split("\\s+");
		return str[str.length-1].length();
 	}
}
