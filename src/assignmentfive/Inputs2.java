package assignmentfive;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;
/**
 * @author IFEOMA LORRITA UDEAGBARA
 * ID:3065737
 * DATE: 15-FEB-2023
 */

public class Inputs2 {

	public static void main(String[] args) {

		int minVal = 0;
		int maxVal = 100;

		Integer[] arr = new Integer[20];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = ThreadLocalRandom.current().nextInt(minVal, maxVal);
		}

		Arrays.sort(arr, Collections.reverseOrder());

		System.out.println(Arrays.toString(arr));
		System.out.println();

		int sum = 0;

		for(int b = 0; b < arr.length; b++){

			sum = sum + arr[b]; 
		}
		int average = ((int)sum) / arr.length;

		int below = 0;

		for(int b = 0; b < arr.length; b++){
			if ((double)arr[b] < average) {
				below++;
			}
		}


		System.out.println("The average is"+" " + average);
		System.out.println(below + " failed");
	}
}