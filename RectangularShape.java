// Asami, Brian - CS-170-01 - Lab 3
//Super class calculates area and volume of square, cube or cuboid depending on how many values and whether the 3 values are matching
abstract class RectangularShape{ 
	//super class
    abstract void callme(int a,int b);
    // abstract method (it should be implementd in sub class )
    abstract void callme(int a); 
    // Method overloading (for square)
}
abstract class Rectangle extends RectangularShape{ 
	// sub class of RectangularShape


    void callme(int a){
    	// Method overriding
        System.out.printf("Area of square with side %d is side*side = %d square uints \n",a,a*a);
    }
    void callme(int a,int b){
        System.out.printf("Area of Rectangle with l=%d and b=%d is length*breadth = %d square uints \n",a,b,a*b);
    }
    abstract void callme(int a,int b,int c);
    // Method overloading (for Cuboid and cube)
}
class Cuboid extends Rectangle{
	//sub class of Rectangle
    
    void callme(int a,int b,int c){
        if(a==b && b==c){
        	//=cube if all 3 sides are equal
            System.out.printf("Volume of cube with a=%d is a^3 = %d cubic uints \n",a,a*b*c);
            System.out.printf("Surface area of cube with a=%d is 6a^2 = %d  \n",a,6*(a*a));
            System.out.printf("Lateral surface area of cube with a=%d is 4(s*s) = %d\n",a,4*(a*a));
            //display cube volume/area calculations 
        }
        else{
        	//If not it is a suboid
            System.out.printf("Surface Area of cuboid l=%d b=%d h=%d is 2(l*b)+2(b*h)+2(l*h) = %d\n",a,b,c,(2*(a*b))+(2*(b*c))+(2*(c*a)));
            System.out.printf("Volume of cuboid with l=%d b=%d h=%d is l*b*h = %d cubic uints \n",a,b,c,(a*b*c));
            //Display Cuboid volume/surface area calculations
        }
    }
}