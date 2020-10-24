abstract class Figureg {
double dim1;
double dim2;
Figureg(double a, double b) {
dim1 = a;
dim2 = b;
}
// area is now an abstract method
abstract double area();
}
class Rectanglew extends Figureg {
Rectanglew(double a, double b) {
super(a, b);
}
// override area for rectangle
double area() {
System.out.println("Inside Area for Rectangle.");
return dim1 * dim2;
}
}
class Trianglew extends Figureg {
Trianglew(double a, double b) {
super(a, b);
}
// override area for right triangle
double area() {
System.out.println("Inside Area for Triangle.");
return dim1 * dim2 / 2;
}
}
public class AbstractAreas {
	public static void main(String args[]) {
		// Figure f = new Figure(10, 10); // illegal now
		Rectanglew r = new Rectanglew(9, 5);
		Trianglew t = new Trianglew(10, 8);
		//Figureg figref; // this is OK, no object is created
		//figref = r;
		System.out.println("Area is " + r.area());
		//figref = t;
		System.out.println("Area is " + t.area());
	}
}
