//subclass Sphere inherits Circle2
package Pt2;

 class Sphere extends Circle2{
	public Sphere() {
		super();			//call super class non-argument constructor
	}
	public Sphere(double radius) {
		super(radius);		//call super class one-argument constructor
	}
	public Sphere(double x1, double y1, double x2, double y2) {
		super(x1, y1, x2, y2);//call super class four-argument constructor
	}

	public void computeArea() {		//compute sphere's area
		super.computeArea();		//call super class' method
		area = 4 * area;
	}

	public void computeVolume() {	//compute sphere's volume
		volume = 4.0/3 * radius * radius * radius * Math.PI;
	}
	
	public String toString() {					//override the toString() method
		 return "Sphere Area: " + area + "\nSphere Volume: " + volume + "\n";
	  }
}
