
package Pt2;

public class CircularShapeApp{

	public static void main(String[] args) {
 		Circle2 circle = new Circle2(12.98);
 		Sphere sphere = new Sphere(25.55);

 		Shape shape = circle;

 		shape.computeArea();
 		System.out.println("circle area: " + shape.getArea());
 		shape.computeVolume();
 		System.out.println("circle volume: " + shape.getVolume());

		shape = sphere;
 		shape.computeArea();
 		System.out.println("Sphere area: " + shape.getArea());
 		shape.computeVolume();
 		System.out.println("Sphere volume: " + shape.getVolume());
 	}

}