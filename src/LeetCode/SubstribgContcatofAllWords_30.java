package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SubstribgContcatofAllWords_30 {

	public static void main(String[] args) {
		String s = "barfoothefoobarman";
		String[] words = {"foo","bar"};
		
		System.out.println(findSubstring(s,words));
		

	}

	public static List<Integer> findSubstring(String s, String[] words) {
		int len = words.length;
		int wlen = words[0].length();
		int slice = len * wlen;

		List<Integer> list = new ArrayList<>();
		HashMap<String, Integer> wordMap = new HashMap<>();

		for (String w : words) {
			wordMap.put(w, wordMap.getOrDefault(w, 0) + 1);
		}

		for (int i = 0; i < s.length() - slice; i++) {

			HashMap<String, Integer> map = new HashMap<>(wordMap);
			System.out.println(" Initial map: " + map);
			int left = i;
			int match = 0;

			for (int right = i; right <= i + slice - wlen; right += wlen) {

				String correctWord = s.substring(right, right + wlen);
				System.out.println("correctWord " + correctWord);
				if (map.containsKey(correctWord)) {
					map.put(correctWord, map.get(correctWord) - 1);
					if (map.get(correctWord) == 0)
						match++;
				}
				
				System.out.println("map: " + map);

				if (match == map.size()) {
					list.add(left);
				}
			}
		}
		return list;
	}

}
