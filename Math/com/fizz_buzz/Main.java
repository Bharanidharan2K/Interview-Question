package com.fizz_buzz;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		int n = 15;
		System.out.println(fizzBuzz(n));
	}
	public static List<String> fizzBuzz(int n) {
		List<String> list = new ArrayList<>();
		int fizz = 0, buzz = 0;
		for(int i=1; i<=n; i++) {
			fizz++;
			buzz++;
			if(fizz == 3 && buzz == 5) {
				fizz = 0;
				buzz = 0;
				list.add("FizzBuzz");
			}
			else if(fizz == 3) {
				fizz = 0;
				list.add("Fizz");
			}
			else if(buzz == 5) {
				buzz = 0;
				list.add("Buzz");
			}
			else {
				list.add(i+"");
			}
		}
		return list;
	}

}
