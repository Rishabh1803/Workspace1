package com.rk.linkedlistdemo;

public class MyLinkedList {

	Node head;

	static class Node{
		int data;
		Node next;
		public Node(int data, Node next) {
			super();
			this.data = data;
			this.next = next;
		}


	}

	public static MyLinkedList insert(MyLinkedList list,int data) {

		Node newNode=new Node(data,null);
		//		newNode.next=null;
		//checking if link list is empty
		if(list.head==null) {
			//make this node as first node
			list.head=newNode;
		}
		else {
			Node last=list.head;

			while(last.next!=null)
				last=last.next;

			last.next=newNode;
		}
		return list;

	}

	public static void traversal(MyLinkedList list) {
		Node currentNode=list.head;
		while(currentNode!=null) {
			System.out.print(currentNode.data+" -> ");
			currentNode=currentNode.next;
		}
		System.out.println("null");
	}

	public static MyLinkedList delete(MyLinkedList list, int data) {
		Node currentNode = list.head;
		if(list.head.data == data) {
			list.head = list.head.next;
		}
		else {
			while(currentNode.next.data != data) {
				currentNode = currentNode.next;
			}
			if(currentNode.next!=null)
			currentNode.next = currentNode.next.next;
		}
		return list;
	}

	public static void main(String[] args) {
		MyLinkedList list=new MyLinkedList();

		list=list.insert(list, 10);
		list=list.insert(list, 49);
		list=list.insert(list, 23);
		list=list.insert(list, 40);
		list=list.insert(list, 90);
		list=list.insert(list, 60);

		list.traversal(list);
//		try {
			list = list.delete(list, 20);
//		}catch(Exception e) {
//			System.out.println("No element found!");
//		}
		list.traversal(list);
	}
}
