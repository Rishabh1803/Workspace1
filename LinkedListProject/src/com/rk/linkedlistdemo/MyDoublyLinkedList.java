package com.rk.linkedlistdemo;

public class MyDoublyLinkedList {

	Node head;
	Node tail;
	class Node{
		int data;
		Node next;
		Node previous;
		public Node(int data, Node next, Node previous) {
			super();
			this.data = data;
			this.next = next;
			this.previous = previous;
		}
	}
	
	public MyDoublyLinkedList insertAtEnd(MyDoublyLinkedList list, int data) {
		Node node1 = new Node(data,null,null);
		list.tail = node1;
		return list;
	}
	public MyDoublyLinkedList insertAtStart(MyDoublyLinkedList list, int data) {
		Node node1 = new Node(data,null,null);
		list.head = node1;
		return list;
	}
	
	public void traversalForward(MyDoublyLinkedList list) {
		Node traverse = list.head;
		while(traverse.next!=null) {
			System.out.println(traverse.data);
			traverse = traverse.next;
		}
	}
	public void traversalBackward(MyDoublyLinkedList list) {
		Node traverse = list.tail;
		while(traverse.previous!=null) {
			Node output = traverse.previous;
			System.out.println(output.data);
			traverse = output;
		}
	}
	public static void main(String[] args) {
		MyDoublyLinkedList list = new MyDoublyLinkedList();
		list.insertAtStart(list, 54);
		list.insertAtStart(list, 65);
		list.insertAtStart(list, 98);
		list.insertAtEnd(list, 34);
		list.insertAtEnd(list, 18);		
		list.traversalBackward(list);
	}
}