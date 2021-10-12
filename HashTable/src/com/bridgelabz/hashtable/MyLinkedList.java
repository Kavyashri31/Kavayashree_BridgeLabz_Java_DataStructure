package com.bridgelabz.hashtable;

public class MyLinkedList<K> {

	private INode head;
	private INode tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void add(INode node) {

		if (this.tail == null) {
			this.tail = node;
		}

		if (this.head == null) {
			this.head = node;
		} else {

			INode tempNode = this.head;
			this.head = node;
			this.head.setNext(tempNode);
		}

	}

	public void append(INode<K> node) {

		if (this.head == null) {
			this.head = node;
		}

		if (this.tail == null) {
			this.tail = node;
		} else {

			this.tail.setNext(node);
			this.tail = node;

		}

	}

	public void insert(INode myNode, INode newNode) {
		INode tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);

	}

	public INode pop() {
		INode tempNode = this.head;
		this.head = head.getNext();
		return tempNode;

	}

	public INode popLast() {
		INode tempNode = head;
		while (!tempNode.getNext().equals(tail)) {
			tempNode = tempNode.getNext();
		}
		this.tail = tempNode;
		tempNode = tempNode.getNext();
		return tempNode;
	}

	public void printMyNodes() {
		StringBuffer myNodes = new StringBuffer("My Nodes: ");
		INode tempNode = head;

		while (tempNode.getNext() != null) {
			myNodes.append(tempNode.getKey());
			if (!tempNode.equals(tail))
				myNodes.append("->");
			tempNode = tempNode.getNext();

		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}

	public <K> INode<K> search(K key) {
		INode ptr = head;

		while (ptr != null && ptr.getNext() != null) {
			if (ptr.getKey().equals(key))
				return ptr;

			ptr = ptr.getNext();
		}

		return null;
	}

	@Override
	public String toString() {
		return "MyLinkedList [head=" + head + "]";
	}

}
