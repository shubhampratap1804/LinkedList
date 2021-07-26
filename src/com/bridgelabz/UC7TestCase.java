package com.bridgelabz;

public class UC7TestCase {

	public static void main(String[] args) {
		INode myFirstNode = new MyNode<Integer>(56);
		INode mySecondNode = new MyNode<Integer>(30);
		INode myThirdNode = new MyNode<Integer>(70);

		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);

		myLinkedList.search(mySecondNode);

		if (myLinkedList.head.getNext().equals(mySecondNode)) {
			System.out.println("Node has been found!");
		}
		myLinkedList.printNodes();

	}
}
