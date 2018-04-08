package geeks.amazon;

//CTCI : Describe how you could use a single array to implement three stacks.

public class ThreeStacksOneArray {

	static int stacksize = 100;
	static int topPtr[] = new int[3];
	static int arr[] = new int[stacksize * 3];

	public static void main(String[] args) {

		ThreeStacksOneArray stacks = new ThreeStacksOneArray();
		// int[] ptr = stacks.topPtr;
		stacks.initTop(topPtr, arr);

		// Numbering the stacks as 1,2,3

		for (int i = 0; i < 3; i++) {
			System.out.println(topPtr[i]);
		}

	}

	public void initTop(int topPointer[], int arr[]) {
		topPointer[0] = 0;
		topPointer[1] = arr.length * 1 / 3 + 1;
		topPointer[2] = arr.length * 2 / 3 + 1;
	}

	public void push(int stackNum, int data) {
		int top = topPtr[stackNum - 1];
		arr[top] = data;
		topPtr[stackNum - 1] = ++top;
	}

	public int pop(int stackNum) {
		return 1;
	}

	public int peek(int stackNum) {
		return 1;
	}

	public boolean isEmpty(int stackNum) {
		// Write logic based on the stackNum
		return false;
	}

}
