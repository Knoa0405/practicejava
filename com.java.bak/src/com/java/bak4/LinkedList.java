package com.java.bak4;

public class LinkedList {
	private int elements;
	
	private LinkedList next = null;
	
	public LinkedList(int data) {
		elements = data;
	}
	
	public LinkedList add(LinkedList newElement) {
		if(this.next == null) {
			this.next = newElement;
			return this;
		}

		LinkedList nextNode = this.next;
		while (nextNode.next != null) {
			nextNode = nextNode.next;
		}
		
		nextNode.next = newElement;
		
		return this;
	}
	
	public LinkedList add(LinkedList head, )
}
