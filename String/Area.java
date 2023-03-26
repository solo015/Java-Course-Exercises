// Java program to find the area of
// the multiple shapes
// using Method Overloading

import java.io.*;
class GFG {

	// Driver code
	public static void main(String[] args)
	{

		// Creating object of Shape class
		Shape obj = new Shape();

		// Calling function
		obj.Area(10.5);
		obj.Area(3);
		obj.Area(5, 4);
	}
}
class Shape {

	static final double PI = Math.PI;

	// Overloaded Area() function to
	// calculate the area of the square
	// It takes one float parameter
	void Area(float a)
	{
		float A = a * a;
		System.out.println("Area of the Square: " + A);
	}

	// Overloaded Area() function to
	// calculate the area of the circle
	// It takes one double parameter
	void Area(double a)
	{
		double A = PI * a * a;
		System.out.println("Area of the Circle: " + A);
	}

	// Overloaded Area() function to
	// calculate the area of the rectangle
	// It takes two int parameters
	void Area(int a, int b)
	{
		int A = a * b;
		System.out.println("Area of the Rectangle: " + A);
	}
}


