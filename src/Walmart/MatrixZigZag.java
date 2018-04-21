package Walmart;

public class MatrixZigZag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r = 4, c = 5;
		int mat[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 } };

		printZigZag(r, c, mat);

	}

	public static void printZigZag(int r, int c, int[][] mat) {
		int rowNum = 0;

		while (rowNum < r) {
			if (rowNum % 2 == 0) {
				for (int i = 0; i < c; i++) {
					System.out.print(mat[rowNum][i]+ " ");
				}
			}else {
				for(int i = c -1; i >= 0; i--) {
					System.out.print(mat[rowNum][i]+ " ");
				}
			}
			rowNum++;
		}

	}

}
