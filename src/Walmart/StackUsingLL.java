package Walmart;


// Stack using singly Linked List
// Stack should contain top
// push / pop methods - constant time
public class StackUsingLL {

}

class LinkedListStack{
	Node top = null;
	
	void push(int data) {
		Node newTop = new Node(data);
		
		if(top == null) {
			top = newTop;
		}else {
			newTop.next = top;
			top = newTop;
		}
		
	}
	
	
	int pop() {
		//Node topNode;
		int data;
		if(top == null) {
			System.out.println("Error !!Stack is Empty");
			System.exit(-1);
		}
		
		data = top.data;		
		top = top.next;		
		
		return data;
	}
	
}

class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		this.next = null;
	}
}



/**
 * 
 * 
 * int getVal(int a, int b, int c) {
  c *= (--a * b);
  return c << a;
}
 * 
 * 
 */

/*c = c* (--a *b)
 = 4 * (1 * 3)
 = 12
 
 1100
 11000*/
 
 
 //billy.rose@walmart.com
 //bowen.gong@walmart.com

