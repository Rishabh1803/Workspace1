package com.rk.demo;
import java.util.*;
public class BalanceString{

	public static boolean checkBalance(String s) {
		char[] arr = s.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; arr != null && i < arr.length; i++) {
			if (arr[i] == '{' || arr[i] == '[' || arr[i] == '(')
				stack.push(arr[i]);
			else {
				if(stack.isEmpty())
					return false;
				else if (stack.peek() == '(' && arr[i] == ')')
					stack.pop();
				else if (stack.peek() == '[' && arr[i] == ']')
					stack.pop();
				else if (stack.peek() == '{' && arr[i] == '}')
					stack.pop();
				else
					return false;
			}
		}
		return stack.isEmpty();
	}
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String input=sc.next();
			System.out.println(checkBalance(input));
		}
		sc.close();
	}
}