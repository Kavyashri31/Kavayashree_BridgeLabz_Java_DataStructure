package com.bridgelabz.hashtable;

public class MyNode<K> implements INode<K> {

	private K key;
	private MyNode next;

	public MyNode() {
		this.key = null;
		this.next = null;
	}

	public MyNode(K key) {
		this.key = key;
		this.next = null;
	}

	/**
	 * @return the next
	 */
	public MyNode getNext() {
		return next;
	}

	@Override
	public K getKey() {
		return key;
	}

	@Override
	public void setKey(K key) {
		this.key = key;
	}

	@Override
	public void setNext(INode next) {
		this.next = (MyNode) next;

	}
}
