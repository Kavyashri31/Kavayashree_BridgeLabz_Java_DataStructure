package com.bridgelabz.hashtable;

public class Node<T> {

	public Node() {
	}

	public Node(T item) {
		this.data = item;
	}

	T data;
	Node next;

}
