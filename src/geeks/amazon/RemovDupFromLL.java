package geeks.amazon;

import java.util.HashMap;
import java.util.Map;

//Write code to remove duplicates from an unsorted linked list.

public class RemovDupFromLL {
	
	public static void main(String[] args) {
		LinkedList dup = new LinkedList();
		LinkedList uni = new LinkedList();
		dup.add(1);
		dup.add(5);
		dup.add(2);
		dup.add(1);
		dup.add(4);
		dup.add(2);
		dup.add(2);
		dup.add(3);
		
		uni = removeDupUsingBuffer(dup);
		
		Node head = uni.head;
		while(head != null) {
			System.out.println(head.data);
			head = head.next;
		}
		
	}
	
	
	public static LinkedList removeDupUsingBuffer(LinkedList ll) {
		
		LinkedList unique = new LinkedList();
		Map lMap = new HashMap();
		
		Node head = ll.head;
		Node curr = head;
		while(curr != null) {
			if(lMap.containsKey(curr.data)) {
				curr = curr.next;
			}else {
				unique.add(curr.data);
				lMap.put(curr.data, 0);
			}
		}
		
		
		return unique;
		
	}

}
