// Asami, Brian - CS-170-01 - Lab 3
//
package Pt2;

import javax.swing.*;

public class CircleShapeApp{ //class declaration

	public static void main(String[] args) {
		double radius, height; //declaring radius and height for future use

		int input; //declaring first input dialog
		String data; //declaring second input dialog
		String toContinue; //declaring y/n string
 		Shape shape; //declaring class variable to

		do {
			input = Validator.verifyIntWithRange("1.<Circle>\n2.<Sphere>\n3.<Cone>", 1, 3);

			switch (input) {
				case (1):
					radius = Double.parseDouble(JOptionPane.showInputDialog("<Radius>"));

					Circle2 circle = new Circle2(radius);

					shape = circle; //declaring class variable to Cone
					shape.computeArea(); //running formula for area
					shape.computeVolume(); //running formula for volume

					JOptionPane.showMessageDialog(null, shape.toString());
					break;

				case (2):
					radius = Double.parseDouble(JOptionPane.showInputDialog("<Radius>"));

					Sphere sphere = new Sphere(radius);

					shape = sphere; //declaring class variable to Cone
					shape.computeArea(); //running formula for area
					shape.computeVolume(); //running formula for volume

					JOptionPane.showMessageDialog(null, shape.toString());

					break;

				case (3):
					data = JOptionPane.showInputDialog("<Radius> <Height>");

					radius = Double.parseDouble(data.split(" ")[0]);
					height = Double.parseDouble(data.split(" ")[1]);

					Cone cone = new Cone(radius, height);

					shape = cone; //declaring class variable to Cone
					shape.computeArea(); //running formula for area
					shape.computeVolume(); //running formula for volume

					JOptionPane.showMessageDialog(null, shape.toString());

					break;
			}

			toContinue = Validator.validateYN("<y> to continue\n<n> to exit");

		} while(toContinue.equals("y"));
	}
}
 