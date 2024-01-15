package StringPractice;

import java.util.HashMap;
import java.util.Map;

public class RepeatedWords {

	/*
	 * to identify the repeated words in a string and how many time are they repeated.
	 * @input : String "cat dog mouse tiger cat rat dog dog mouse"
	 * @expected output : cat - 2, dog - 3, mouse - 2 , tiger -1
	 */
	public static void main(String[] args) {
		String inputString = "cat dog mouse tiger cat rat dog dog mouse";
		
		String[] wordString = inputString.split("\\s+");
		Map<String, Integer> mapOfWords = new HashMap<String, Integer>();
		
		for (String word : wordString) {
			
			mapOfWords.put(word, mapOfWords.getOrDefault(word, 0)+1);
		}
		
		
		printWordCount(mapOfWords);

	}
	
	public static void printWordCount(Map<String, Integer> map) {
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			
			System.out.println(key + " : " + val );
			
		}
		
	}
	
}
