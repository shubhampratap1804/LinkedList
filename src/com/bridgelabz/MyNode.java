package com.bridgelabz;

public class MyNode<K> {

	private K key;
	private MyNode<K> next;

	public MyNode(K key) {
		this.key = key;
		this.next = null;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public K getKey() {
		return this.key;
	}

	public void setNext(MyNode next) {
		this.next = next;
	}

	public MyNode<K> getNext() {
		return this.next;
	}
}
