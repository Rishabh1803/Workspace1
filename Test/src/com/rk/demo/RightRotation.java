package com.rk.demo;

import java.util.Scanner;

public class RightRotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word1 = sc.nextLine();
		String word2 = sc.nextLine();
		int pos = word2.indexOf(word1.charAt(0));
		boolean check = true;
		for(int i = 0; i < word1.length() ; i++) {
			char ch1 = word1.charAt(i);
			char ch2;
			if((pos + i) >= word1.length())
				ch2 = word2.charAt(pos + i - word1.length());
			else
				ch2 = word2.charAt(pos + i);
			if(!(ch1 == ch2))
				check=false;
		}
		int answer =0;
		if(check)
			answer = 1;
		else
			answer = -1;
		System.out.println(answer);
		sc.close();
	}

}
