package com.bridgelabz.linkedlist;

public class LinkedList<T> {

	Node head;
	Node tail;

	public LinkedList() {
		head = null;
		tail = null;
	}

	public static LinkedList List() {
		return new LinkedList();
	}

	/* Append an item */
	public void append(T item) {
		Node node = new Node(item);

		// When list is empty
		if (head == null) {
			head = node;
			tail = node;
		}
		// When list is non-empty
		else {

			tail = node;

			Node ptr = head;

			// Advance pointer to the end of the list
			while (ptr.next != null) {
				ptr = ptr.next;
			}

			// Add node to the end
			ptr.next = node;

		}

	}

	public void insert(int pos, T item) {
		Node node = new Node(item);

		if (pos == 1) {
			add(item);
		} else if (pos == size() + 1) {
			append(item);
		} else {

			Node ptr = head;
			int i = 1;
			while (i != pos - 1) {
				ptr = ptr.next;
				i++;
			}

			node.next = ptr.next;
			ptr.next = node;
		}

	}

	// Add an item to the beginning of the list
	public void add(T item) {
		Node node = new Node(item);

		// When list is empty
		if (head == null) {
			head = node;
			tail = node;
		}
		// When list is non-empty
		else {

			node.next = head;
			head = node;
		}

	}

	public void print() {

		Node ptr = head;

		while (ptr != null) {

			System.out.print(ptr.data + " --> ");
			ptr = ptr.next;
		}
		System.out.println();
	}

	public boolean search(T item) {
		Node ptr = head;

		while (ptr != null) {
			if (ptr.data.equals(item))
				return true;

			ptr = ptr.next;
		}

		return false;
	}

	public boolean isEmpty() {
		if (head == null)
			return true;

		else
			return false;
	}

	public int size() {

		int count = 0;

		Node ptr = head;

		while (ptr != null) {
			count++;
			ptr = ptr.next;
		}

		return count;
	}

	public int index(T item) {

		int index = -1;
		int count = 0;

		Node ptr = head;

		while (ptr != null) {
			count++;
			if (ptr.data.equals(item)) {
				index = count - 1;
			}
			ptr = ptr.next;
		}

		return index;
	}

	public T pop() {

		Node tmp = head;

		head = head.next;

		return (T) tmp.data;

	}

	public T popLast() {

		Node tmp = tail;

		Node ptr = head;
		while (ptr.next != null && ptr.next.next != null) {

			ptr = ptr.next;
		}

		ptr.next = null;
		tail = ptr;

		return (T) tmp.data;

	}

}
