package geeks.threads;

public class Product {

	public static void main(String[] args) {
		int n =5;
		
		int[] a= new int[n] ;
		for(int i = 0 ; i < n ; i++) {
			a[i] = i+1;
			System.out.println(a[i]);
		}
		
		Product p = new Product();
		p.product(a, 3);

	}
	
	public void product(int[] a, int x ) {
		int product = 1;
		for(int i = 0; i < a.length ; i++) {
			if(!(i ==x)) {
				product *= a[i];
			}
		}
		System.out.println("Product is : "+ product);
	}

}
