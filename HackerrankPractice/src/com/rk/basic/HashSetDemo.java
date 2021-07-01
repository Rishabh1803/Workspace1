package com.rk.basic;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetDemo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        
        HashSet<String> name = new HashSet<String>();
        int[] size = new int[t];
        for(int i = 0; i<t; i++) {
        	name.add(pair_left[i] + " " + pair_right[i]);
        	size[i] = name.size(); 
        }
        for(int e:size)
        	System.out.println(e);
	}
}
