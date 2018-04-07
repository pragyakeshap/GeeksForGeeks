package geeks.amazon;

public class LinkedList<T> {

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