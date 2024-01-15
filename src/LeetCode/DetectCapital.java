package LeetCode;

public class DetectCapital {

	public static void main(String[] args) {
		System.out.println(detectCapitalUse("USA"));
		System.out.println(detectCapitalUse("abb"));
		System.out.println(detectCapitalUse("India"));
		System.out.println(detectCapitalUse("UnitedAirlines"));
		
		System.out.println(detectCapitalUse2("USA"));
		System.out.println(detectCapitalUse2("abb"));
		System.out.println(detectCapitalUse2("India"));
		System.out.println(detectCapitalUse2("UnitedAirlines"));

	}
	
	public static boolean detectCapitalUse(String word) {
		
		int capitalLetterCount = 0;
		
		for(int i= 0; i < word.length(); i++) {
			if(Character.isUpperCase(word.charAt(i))) {
				capitalLetterCount++;
			}
		}
		
		if ( capitalLetterCount == word.length() || capitalLetterCount == 0 ) return true;
		return capitalLetterCount == 1 && Character.isUpperCase(word.charAt(0));
		
	}
	
	public static boolean detectCapitalUse2(String word) {
		
		if(word.length() <= 1) return true;
		
		if(Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1))){
			
			for(int i = 2; i < word.length(); i++) {
				if(Character.isLowerCase(word.charAt(i))) {
					return false;
				}
			}
			
		} else {
			for(int i = 1; i < word.length(); i++) {
				if(Character.isUpperCase(word.charAt(i))) {
					return false;
				}
			}
		}
		
		return true;
		
		
		
		
	}

}
