package JavaPrograms;

public class Array4 {

	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3, 4 }, { 23, 35, 34, 45 }, { 2, 54, 64, 4 } };
		// total number of rows
		int row = a.length; // this length is the property of array
		System.out.println(row); // 3
		int column = a[0].length;
		System.out.println(column);
		// print all values in matrix form
		// outer loop
		for (int i = 0; i < row; i++) {

			for (int j = 0; j < column; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

}
