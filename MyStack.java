package com.bridgelabz.stacknqueue;

/**
 * Purpose: Implementation Of Stack Using LInked List
 * @author Ganesh Gavhad
 * @version 1.0
 * @Since 14/06/2021
 */
public class MyStack <T> {
	Node<T> top;
	int index;
	
	//Object of Linked List class to invoke linked List Class Method

	LinkedList<T> List = new LinkedList<T>(); 
									
	/**
	 * Stack Push Operation by Using Linked List Add Method
	 */
	public void push (T data) {
		
		List.AtStart(data);
	}
	 /**
     * For removes the top most Data/value of the stack
     */
    public void pop() {
    	List.pop();
    }
    /**
     * For  find the first element in stack
     * @return
     */
    public T peek() {
    	
    	while(List.peek() != null) {
            System.out.println("Top most element of the stack is: "+List.peek());
            break;
    	}
        return List.peek();
    }
	/**
	 * Show function by Using Linked List Class Method
	 */
	public void showRunner () {
		
		List.show() ;
	}

}
