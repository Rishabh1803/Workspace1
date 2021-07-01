package com.rk.treedemo;

public class AVLTree <T extends Comparable<T>> {
	Node root;
	class Node{
		T key;
		Node left;
		Node right;
		public Node(T key) {
			this.key = key;
		}
	}
	
	public int getHeight(Node root) {
		if(root == null)
			return -1;
		int left = getHeight(root.left) + 1;
		int right = getHeight(root.right) + 1;
		return (left>right) ? left : right;
	}
	
	public int balance(Node root) {
		if(root == null)
			return 0;
		return getHeight(root.left) - getHeight(root.right);
	}
	
	public Node rotation1(Node root) {
		
		
		return root;
	}
	public Node insertKey(Node root, T key) {
		if(root == null) {
			root = new Node(key);
			return root;
		}
		else if (key.compareTo(root.key) < 0) {
			root.left = insertKey(root.left,key);
		}
		else if(key.compareTo(root.key) > 0) {
			root.right = insertKey(root.right,key);
		}
		
		return root;
	}
}
