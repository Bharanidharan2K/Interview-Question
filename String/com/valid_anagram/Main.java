package com.valid_anagram;

public class Main {

	public static void main(String[] args) {
		String s = "anagram", t = "nagaram";
		System.out.println(isAnagram(s, t));
	}
	public static boolean isAnagram(String s, String t) {
		if(s.length() != t.length()) return false;
		int charFreq[] = new int[26];
		for(int i=0; i<s.length(); i++) {
			charFreq[s.charAt(i) - 'a']++;
			charFreq[t.charAt(i) - 'a']--;
		}
		for(int i=0; i<s.length(); i++) {
			if(charFreq[i] != 0) return false;
		}
		return true;
	}

}
