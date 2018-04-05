package geeks.amazon;

public class AddLinkedList {

	public static void main(String[] args) {

		LinkedList l1 = new LinkedList();
		l1.add(3);
		l1.add(2);
		l1.add(1);
		// l1.add(data);

		LinkedList l2 = new LinkedList();
		l2.add(5);
		l2.add(4);
		// l2.add(data);

		LinkedList res = addLists(l1, l2);
		res.iterate();
	}

	private static LinkedList addLists(LinkedList l1, LinkedList l2) {
		LinkedList result = new LinkedList();
		int sum = 0, carry = 0;

		Node p1 = l1.head;
		Node p2 = l2.head;

		while (p1 != null || p2 != null) {
			sum = ( (p1 != null ? p1.data : 0) +  (p2 != null ? p2.data : 0)  + carry);

			if (sum > 10) {
				carry = 1;
				sum %= 10;
			}
			
			Node sumNode = new Node(sum);
			result.add(sumNode);
			
			if (p1 != null) {
				p1 = p1.next;
			}
			if (p2 != null) {
				p2 = p2.next;
			}
			
			
		}		

		return result;
	}
}

class LinkedList {

	Node head;

	public void add(int data) {
		Node temp = new Node(data);
		if (head == null) {
			head = temp;
		} else {
			temp.next = head;
			head = temp;
		}
	}

	public void add(Node n) {
		if (head == null) {
			head = n;
		} else {
			n.next = head;
			head = n;
		}
	}

	public void iterate() {
		Node tmp = head;
		if (head == null) {
			return;
		} else {
			while (tmp != null) {
				System.out.println(tmp.data + " ");
				tmp = tmp.next;
			}
		}
	}
}

class Node {

	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}
