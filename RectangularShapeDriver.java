// Asami, Brian - CS-170-01 - Lab 3
// Tester class for above Classes
public class RectangularShapeDriver{
    public static void main(String args[]){
    	// Main method


        Cuboid c=new Cuboid();
        //Object "c" for cuboid
        c.callme(5);
        // If there is a single value, it is a square
        System.out.printf("\n");


        Cuboid d=new Cuboid();
        //Object "d" for Cuboid
        d.callme(5,10);
        //If there is 2 values, it is a rectangle
        System.out.printf("\n")

;
        Cuboid e=new Cuboid();
        //Object "e" for Cuboid
        e.callme(5,5,5); 
        //if there is 3 equal values, it is a cube
        System.out.printf("\n");


        Cuboid f=new Cuboid();
        //Object "f" for Cuboid
        f.callme(5,10,20);
        // if there are 3 unequal values, it is a  Cuboid
        System.out.printf("\n");
    }
}