package assignmentfive;

/**
 * @author IFEOMA LORRITA UDEAGBARA
 * ID:3065737
 * DATE: 15-FEB-2023
 */

public class Inputs4 {

	// TODO Auto-generated method stub
	public static void main(String[] args) {

		int arr_2d[][] = getArr();

		printArr(arr_2d);
	}

	private static int[][] getArr() {
		int arr[][] = {{32,32,95,95,95,95},
				{32,47,92,95,95,95,92},
				{47,92,32,92,95,95,95,92},
				{92,32,92,47,32,47,47,32,470}}; 

		return arr;
	}

	private static void printArr(int[][] arr_2d) {
		for (int i = 0; i < arr_2d.length; i++) {
			for (int j = 0; j < arr_2d[0].length; j++) {
				System.out.print(arr_2d[i][j] + " ");
			}
			System.out.println();
		}
	}
}

