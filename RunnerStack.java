
package com.bridgelabz.stacknqueue;

/**
 * @author Ganesh Gavhad
 * Runner For Stack 
 */
public class RunnerStack {
	
	public static void main(String[] args) {
		MyStack<Integer> List = new MyStack<Integer>();
        List.push(70);
        List.push(30);
        List.push(56);
        List.showRunner();
        
        System.out.println();

        List.peek();
        List.pop();
        List.showRunner();
        
	}
	}

