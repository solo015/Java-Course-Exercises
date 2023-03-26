/*
 8. Define an abstract method simpleInterest(double p, double t) to 
calculate the simple interest of 2 different bank. Here the r will be declared in 
site the method. 
 */
// amount, time and rate of interest.
import java.io.*;

class GFG {
	public static void main(String args[])
	{
		// We can change values here for
		// different inputs
		float P = 1, R = 1, T = 1;

		/* Calculate simple interest */
		float SI = (P * T * R) / 100;
		System.out.println("Simple interest = " + SI);
	}
}

// This code is contributed by Anant Agarwal.
