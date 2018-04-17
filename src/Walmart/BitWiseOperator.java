package Walmart;

public class BitWiseOperator {
	
	public static void main(String[] args) {
		int a = 2;
		int b= 3; 
		int c=4;
		
		BitWiseOperator op =new BitWiseOperator();
		System.out.println(op.getVal(a, b, c));
	}

	int getVal(int a, int b, int c) {
		c *= (--a * b);
		return c << a;
	}

}
