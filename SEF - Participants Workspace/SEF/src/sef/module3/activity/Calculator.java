/**
 * 
 */
package sef.module3.activity;

/**
 * @author 
 *
 */
public class Calculator {
		
	public static void main(String[] args) {
		
	int x = 10;
	int y = 5;
	
	int[] nums = {1, 2, 3, 4};
	
	System.out.println("Addition - " + add(x,y));
	System.out.println("Subtraction - " + subtract(x,y));
	System.out.println("Multiply - " + multiply(nums));
	System.out.println("Divide - " + divide(x,y));
	
	}


	private static int add(int x, int y) {
		int sum = x + y;
		return sum;
	}

	private static int subtract(int x, int y) {
		int diff = 0;
		if (x > y) {
			diff = x-y;
		} else {
			diff = y-x;
		}

		return diff;
	}

	private static int multiply(int[] numbers) {
		int temp = 1;

		for (int i = 0; i < numbers.length; i++) {
			temp = temp * numbers[i];
		}
		return temp;

	}

	private static float divide(int x, int y) {
		//Note: Java handles division by 0 by default, returning Infinity.
		float divValue = 0;
		if (y != 0) {	//Keep divValue as 0 if we divide something by 0.
			divValue = (float)x / (float)y;	//Calculating as floats.
		}
		return divValue;
	}
	
}

