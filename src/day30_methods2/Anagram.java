package day30_methods2;

public class Anagram {
	public static void main(String[] args) {
		System.out.println(isAnagram("earth", "heart"));
	}

	public static boolean isAnagram(String word1, String word2) {
		String w1 = word1.toLowerCase();
		String w2 = word2.toLowerCase();
		if (word1.length() == word2.length()) {
		for (int i = 0; i < word1.length(); i++) {
			int count=0;
	for(int j=0; j<word2.length(); j++) {
		if(w1.charAt(i)==w2.charAt(j)) {
			count++;
		}
	}
	if(count>0) {
		return true;
	}else {
		return false;
	}
	}
}
		return false;
	}
}