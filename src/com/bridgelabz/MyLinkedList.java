package com.bridgelabz;

public class MyLinkedList {

	INode head;
	INode tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void add(INode node) {
		if (this.head == null) {
			this.head = node;
		}
		if (this.tail == null) {
			this.tail = node;
		} else {
			INode temp = head;
			this.head = node;
			this.head.setNext(temp);
		}
	}

	public void append(INode node) {
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

	public void insert(INode myNode, INode node) {
		INode tempNode = myNode.getNext();
		myNode.setNext(node);
		node.setNext(tempNode);
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
	
	 public INode search(INode searchKey) {

	        INode tempNode = this.head;
	        while (tempNode != null) {
	            if (tempNode == searchKey) {
	                return tempNode;
	            }
	            tempNode = tempNode.getNext();
	        }
	        return null;
	    }

	public void printNodes() {
		StringBuilder nodes = new StringBuilder("Nodes keys: ");
		INode temp = this.head;
		while (temp != null) {
			nodes.append(temp.getKey());
			if (temp != tail) {
				nodes.append("->");
			}
			temp = temp.getNext();
		}
		System.out.println(nodes);
	}
}
