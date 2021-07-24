package com.first_unique_character_in_string;

public class Main {

	public static void main(String[] args) {
		String s = "loveleetcode";
		System.out.println(firstUniqChar(s));
	}
	public static int firstUniqChar(String s) {
		int c[] = new int[26];
		for(int i=0; i<s.length(); i++) {
			c[s.charAt(i) - 'a']++;
		}
		for(int i=0; i<s.length(); i++) {
			if(c[s.charAt(i) - 'a'] == 1) return i;
		}
		return -1;
	}

}
