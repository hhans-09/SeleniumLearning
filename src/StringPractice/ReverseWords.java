package StringPractice;

public class ReverseWords {

	public static void main(String[] args) {
		System.out.println(revWords("apple banana kiwi")); // kiwi banana apple
        System.out.println(revWords("I am John Doe")); // Doe John am I
        System.out.println(revWords("orange")); // orange

	}
	
	public static String revWords(String str) {
		StringBuilder res = new StringBuilder();
		String[] words = str.split("\\s+");
		
		for(int i = words.length-1; i >= 0 ; i--) {
			res.append(words[i]).append(" ");
		}
		
		return res.toString().trim();
	}

}
