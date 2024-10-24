package studio6;

import java.util.Arrays;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
		if (n==0) {
			return 0;
		}
		double sum = Math.pow(0.5, n) + geometricSum(n-1);
	
			return sum;
		
	}
	
	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
			double radiusMinimumDrawingThreshold) {
		
		// FIXME
	}

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 * 
	 */
	
	public static int[] reverseHelper(int[] array, int start, int end) {
			
		if (start>end) {
			return array;
			
		}
		
		int temporary = array[start];
		array[start] =array[end];
		array [end] = temporary;
		
		
		reverseHelper(array, start+1, end-1);
		return array;
		
		
		
	}
	public static int[] toReversed(int[] array) {
		
		int[] CopyArray = Arrays.copyOf(array, array.length);
		
				
		if (array.length ==0 || array.length ==1) {
			return CopyArray;
			
		}
		
		
		return reverseHelper(CopyArray,0, array.length-1);
		
		
	}
	
	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
		
if (q==0) {
	
	return p;
	
}
return gcd(q,p%q);

		
	}

}
