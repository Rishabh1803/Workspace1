package com.rk.treedemo;

import java.util.Scanner;

public class MyBinarySearchTree<T extends Comparable<T>>{

	Node root;
	
	class Node{
		T key;
		Node left,right;
		
		public Node(T key) {
			this.key = key;
		}

		
	}
	void insert(T i) {
		root=insertKey(root,i);
	}
	
	Node insertKey(Node root,T key) {
		//if tree is empty
		if(root==null) {
			root=new Node(key);
			return root;
		}
		if(key.compareTo(root.key)<0)
			root.left=insertKey(root.left,key);
		else if(key.compareTo(root.key)>0)
			root.right=insertKey(root.right,key);
		return root;
	}
	
	void inorder() {
		inorderKey(root);
		System.out.println();
	}
	
	void inorderKey(Node root) {
		if(root!=null) {
			inorderKey(root.left);
			System.out.print(root.key+"  ");
			inorderKey(root.right);
		}
	}
	void delete(T key) {
		root=deleteKey(root,key);
	}
	
	Node deleteKey(Node root,T key) {
		//empty tree
		if(root==null)
			return root;
		
		//searching the key
		if(key.compareTo(root.key)<0)
			root.left=deleteKey(root.left,key);
		else if(key.compareTo(root.key)>0)
			root.right=deleteKey(root.right,key);
		//if key found : this is the node which is supposed to be deleted
		else {
			//node with one child
			if(root.left==null)
				return root.right;
			else if(root.right==null)
				return root.left;
			
			/*
			 * node with two children :Get the inorder successor
			 * smallest in right subtree
			 */
			root.key=replaceValue(root.right);
			
			//Delete The inorder Successor
			root.right=deleteKey(root.right,root.key);
			
		}
		return root;
	}
	
	T replaceValue(Node root) {
		T repValue=root.key;
		while(root.left!=null) {
			repValue=root.left.key;
			root=root.left;		
		}
		return repValue;
		
	}
	
	void preorder() {
		preorderKey(root);
		System.out.println();
	}
	
	void preorderKey(Node root) {
		if(root!=null) {
			System.out.print(root.key+"  ");
			preorderKey(root.left);
			preorderKey(root.right);
		}
	}
	void postorder() {
		postorderKey(root);
		System.out.println();
	}
	
	void postorderKey(Node root) {
		if(root!=null) {
			postorderKey(root.left);
			postorderKey(root.right);
			System.out.print(root.key+"  ");
		}
	}
	public int calculateHeight() {
		return height(root);
	}
	public int height(Node root) {
		if(root == null)
			return -1;
		else {
			int heightLeft = height(root.left);
			int heightRight = height(root.right);
			int height = heightLeft>heightRight ? heightLeft : heightRight;
			return height + 1;
		}
	}
	public static void main(String[] args) {
		MyBinarySearchTree<Integer> tree = new MyBinarySearchTree<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();
		System.out.println("Enter elements: ");
		for(int i = 0; i<n ;i++) {
			tree.insert(sc.nextInt());
		}
		System.out.println("Inorder Traversal: ");
		tree.inorder();
//		System.out.print("\nEnter value to be deleted: ");
//		tree.delete(sc.nextInt());
//		System.out.println("After Removal: ");
//		tree.inorder();
		System.out.println("Preorder Traversal: ");
		tree.preorder();
		System.out.println("Postorder Traversal: ");
		tree.postorder();
		System.out.print("Height: " + tree.calculateHeight());
		sc.close();
	}
}