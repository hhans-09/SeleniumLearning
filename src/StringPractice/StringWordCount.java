package StringPractice;

public class StringWordCount {
	
	/*
	 * Get the count of total words in a capitalized String
	 */

	public static void main(String[] args) {
		String str = "HeenaHansYouTubePracticeSeleniumJava";
		
		int count = 0;
		for(int i= 0; i<str.length(); i++) {
			if(str.charAt(i) >= 'A' && str.charAt(i)<='Z') {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
