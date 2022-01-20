package day04;

import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public class StringStatistics {

	private static final String VOWELS = "aeiou";

	public Map<Character, Integer> vowelCounter(String word) {
//		char c = 'a';
//		switch(c) {
//			case 'a','e'
//		}
		Map<Character, Integer> result = new TreeMap<>();
		for (int i=0; i<word.length();i++) {
			char act = word.charAt(i);
			if(isVowel(act)) {
				if(!result.containsKey(act)) {
					result.put(act,1);
				} else {
					result.put(act,result.get(act)+1);
				}
			}
		}
		return result;
	}

	private boolean isVowel(char c) {
//		if (VOWELS.indexOf(c)>=0 || VOWELS.toUpperCase().indexOf(c)>0){
//			return true;
//		}
//		return false;
		return VOWELS.indexOf(Character.toLowerCase(c))>=0;
	}
}
