/**
 * 
 */
package com.uvg.main;

/**
 * @author moises.alonso
 *
 */
public class StackNodes<T> implements IStack<T> {
	
	private Node<T> head;
	private int count;
	
	public StackNodes() {
		head = null;
	}

	@Override
	public void push(T value) {
		Node<T> newNode = new Node<T>(value);
		
		if (isEmpty()) {
			head = newNode;
		} else {
			newNode.setNext(head);
			head = newNode;
		}
		count++;
	}

	@Override
	public T pull() {
		
		if (count() == 0) {
			return null;
		} else if(count() == 1) {
			Node<T> temp = head;
			head = null;
			count--;
			return temp.getValue();
		} else {
			Node<T> temp = head;
			head = temp.getNext();
			count--;
			return temp.getValue();
		}
		
	}

	@Override
	public T peek() {
		if (isEmpty()) {
			return null;
		} else {
			return head.getValue();
		}
	}

	@Override
	public int count() {
		return count;
	}

	@Override
	public boolean isEmpty() {
		return (head == null);
	}

	
}
