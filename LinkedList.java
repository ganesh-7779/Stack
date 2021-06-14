/**
 * Purpose: Implementation of Linked List Data Structure
 * @author Ganesh Gavhad
 * Version 1.0
 * @param <T>
 */
package com.bridgelabz.stacknqueue;

public class LinkedList <T> {
		Node<T> head;

		/**
		 * Adding Node to the linkedList
		 * @param data
		 */
		public void add(T data) {
			Node<T> newNode = new Node<>();
			newNode.data = data;
			if (head == null) {
				head = newNode;
			
			} else {
				Node<T> node = head;
				while (node.next != null) {
					node = node.next;
				}
				node.next = newNode;
			}
		}
		/**
		 * @param Node data added at Start
		 */
		public void AtStart(T data) {
			Node<T> node =new Node<>();
			node.data=data;
			node.next=head;
			head=node;
		}
		public void AddAtIndex(int index, T data) {
			Node<T> newNode = new Node<>();
			newNode.data = data;

			if (index == 0) {
				AtStart(data);
			} else {
				Node<T> node = head;
				for (int i = 0; i < index - 1; i++) {
					node = node.next;
				}
				newNode.next = node.next;
				node.next = newNode;
			}
		}
		/**
		 * @param data
		 * Deleting first Node from Link
		 */
		public void deleteFirst (){
			if (head != null) {
				Node<T> Head = head.next;
				
				head=Head;
			}
		}
		/**
		 * Delete Last Node Operation
		 */
		public void deleteLast() {
			Node<T> node = head;
			Node<T> PreviousNode = head;
			while(node.next != null) {
				PreviousNode = node;
				node = node.next;
			}
			PreviousNode.next = null;
		}		
			
		/**
		 * Added : Search operation Function
		 * @param data
		 */
		public void SearchOperation (T data ) {
			Node<T> P = head;
			P.data=data;
			while(P !=null) {
				if(P.data==data) {
					System.out.println("Element Found");
					break;
				}
				P=P.next;
			}
			
		}
		/**
		 * @param Remove data by using index value
		 */
		public void deleteAt(int index ) {
			if (index == 0) {
				head = head.next;
			} else {
				Node<T> node = head;
				Node<T> PreviousNode = null;
				for (int i = 0; i < index - 1; i++) {
					node = node.next;
				}
				PreviousNode = node.next;
				node.next = PreviousNode.next;
			}
		}
			
		
		public int size() {
			Node<T> node = head;
			int count = 0;
			if(node != null) {
				while((node.next != null) || (node.data != null)) {
					node = node.next;
					count++;
					if(node == null) {
						break;
				}
				}
			}
			return count;
		}
		/**
		 * For Removing Top Most Value/Data from Stack and queue.
		 * @return
		 */
		public int pop() {
	        if (head != null) {
	            int size = 0;
	            int temp = (int) head.data;
	            head = head.next;
	            size--;
	            return temp;
	        } else {
	            System.out.println("Empty list");
	            return -1;
	        }
	    }
		/**
		 * Printing The Data Of Node till next equal to null
		 */
		public void show() {
			Node<T> node = head;
			while (node.next != null) {
				System.out.println(node.data);
				node = node.next;
			}
			System.out.println(node.data);
		}
	}



