// Asami, Brian - CS-170-01 - Lab 2
package Pt2;

public class Cone extends Circle2 {
	protected static double height; //declaration of variables
	protected static double radius;

	public Cone() { //constructor
		super();
	}

	public Cone(double radius, double height) { //constructor
		super(radius);
	}

	public Cone(double x1, double y1, double x2, double y2) { //constructor
		super(x1, y1, x2, y2);// call super class four-argument constructor
	}

	public void computeArea() { // compute cones's area
		area = Math.PI * radius * (radius + Math.sqrt(height * height + radius * radius)); //formula for area of cone
	}

	public void computeVolume() { // compute cones's volume
		volume = height / 3 * Math.PI * radius * radius;

	}
	public String toString() {					//override the toString() method
		 return  "Cone Area: " + area + "\n"+"Cone Volume:"+ volume;
		 
	  }
}
 