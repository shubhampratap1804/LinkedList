package com.bridgelabz;

public class UC8TestCase {

	public static void main(String[] args) {
		INode myFirstNode = new MyNode<Integer>(56);
		INode mySecondNode = new MyNode<Integer>(30);
		INode myThirdNode = new MyNode<Integer>(40);
		INode myFourthNode = new MyNode<Integer>(70);

		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		 myLinkedList.append(myFourthNode);

		myLinkedList.printNodes();
		myLinkedList.insertBetweenNodes(myFirstNode, myThirdNode, 3);
		myLinkedList.printNodes();

	}
}
