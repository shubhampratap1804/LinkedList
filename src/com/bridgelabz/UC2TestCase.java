package com.bridgelabz;

public class UC2TestCase {

	public static void main(String[] args) {
		INode myFirstNode = new MyNode<Integer>(70);
		INode mySecondNode = new MyNode<Integer>(30);
		INode myThirdNode = new MyNode<Integer>(56);
		
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		
		myLinkedList.printNodes();

	}
}
