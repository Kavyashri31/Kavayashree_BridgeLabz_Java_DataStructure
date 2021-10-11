package com.bridgelabz.linkedlist;

public class LinkedListApplication {

	public static void main(String[] args) {

		LinkedList list1 = new LinkedList();

		list1.append(70);
		list1.append(30);
		list1.append(56);

		list1.print();

		list1.insert(2, 55);

		list1.print();

		list1.insert(3, 88);
		list1.print();

		list1.pop();
		list1.print();

		list1.pop();
		list1.print();

		list1.pop();
		list1.print();

		list1.pop();
		list1.print();
	}

}
