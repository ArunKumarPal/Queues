package com.queue.demo;

public class Queue {
	
	private Node first;
	private Node last;
	private int length;
	
	public Queue(){
		this.first = null;
		this.last = null;
		this.length = 0;
	}
	
	public void enQueue(String value){
		Node newNode = new Node(value);
		if(first == null){
			first = newNode;
			last = newNode;
		}
		else {
			last.next = newNode;
			last = newNode;
		}
		length++;
	}
	
	public String deQueue() {
		if(length == 0){
			return "Queue is empty";
		}
		else {
			String value = first.value;
			first = first.next;
			length--;
			return "dequeue value is "+value;
		}
	}
	
	public String peek(){
		if(length == 0){
			return "Queue is empty";
		}
		else {
			return "peek value is "+first.value;
		}
	}

}
