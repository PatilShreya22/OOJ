import java.util.Scanner;
class InputScanner{
	Scanner s;
	InputScanner(){
		s=new Scanner(System.in);
	}
}

abstract class Shape extends InputScanner{
	double a, b;
	abstract void getInput();
	abstract void displayArea();
}


class Rectangle extends Shape{
	void getInput(){
		System.out.println("Enter the dimension of the rectangle(length and breadth):");
		a=s.nextDouble();
		b=s.nextDouble();
	}
	void displayArea(){
		System.out.println("Area of rectangle = "+(a*b));
	}
}

class Triangle extends Shape{
	void getInput(){
		System.out.println("Enter the dimension of the triangle(base and height):");
		a=s.nextDouble();
		b=s.nextDouble();
	}
	void displayArea(){
		System.out.println("Area of triangle = "+((a*b)/2));
	}
}

class Circle extends Shape{
	void getInput(){
		System.out.println("Enter the dimension of the circle(radius):");
		a=s.nextDouble();
	}
	void displayArea(){
		System.out.println("Area of circle = "+(3.14*a*a));
	}
}

class MainMethod{
	public static void main(String args[]){
		Rectangle R=new Rectangle();
		R.getInput();
		R.displayArea();
		
		Triangle T=new Triangle();
		T.getInput();
		T.displayArea();
		
		Circle C=new Circle();
		C.getInput();
		C.displayArea();
	}
}