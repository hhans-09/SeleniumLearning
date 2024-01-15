package LeetCode;

/*
 * Have the function LongestWord(sen) take the sen parameter being passed and return the longest word in the string. 
 * If there are two or more words that are the same length, return the first word from the string with that length. 
 * Ignore punctuation and assume sen will not be empty. 
 * Words may also contain numbers, for example "Hello world123 567"
 * 
 * 
 */

public class LongestWord {

	public static void main(String[] args) {
		String input = "fun&!! time";
		String input2 = "I love dogs";
		
		System.out.println(longestWordinStr(input));
		System.out.println(longestWordinStr(input2));

	}
	
	public static String longestWordinStr(String sen) {

	    String noPun = sen.replaceAll("[^a-zA-Z0-9 ]","");
	    String[] senArr = noPun.split("\\s+");
	    int maxlen = 0;
	    String longestWord = "";
	    for(int i = 0 ; i < senArr.length; i++){
	      if(senArr[i].length() > maxlen){
	        maxlen = senArr[i].length();
	        longestWord = senArr[i];
	      }
	    }
	    return longestWord;
	  }


}
