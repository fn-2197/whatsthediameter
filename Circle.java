package meatheods;

public class Circle
{
private double radius; // This is a State variable … also called Instance
			//Field and Data Member. It is available to code
			//in ALL the methods in this class.
//This part is called the constructor and lets us specify the radius of a
//particular circle.

public Circle(double r) {
	radius = r;
}
//This is a method. It performs some action (in this case it calculates the
//area of the circle and returns it.
public double area(){ //area method 
	double a = Math.PI * radius * radius;
	return a;
}
public double circumference(){ //circumference method
	double c = 2 * Math.PI * radius;
	return c;
}
public double diameter(){
	double d = radius*2;
	return d;
}




}



