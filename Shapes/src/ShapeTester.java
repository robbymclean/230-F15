import java.util.ArrayList;


public class ShapeTester {

	public static void main(String[] args) {
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		
		// TODO each team should initialize 
		// a shape & add to shapes
		//Shape triangle 	= new Triangle();
		//shapes.add(triangle);
	    Shape circle 	= new Circle();
<<<<<<< HEAD
	    shapes.add(circle);
	    //Shape triangle 	= new Triangle(double sideLength);
=======
	    Shape triangle 	= new Triangle(10.5);
>>>>>>> 5e6832143365124a3e674f83e1ef01498d519f93

//		Shape pentagon 	= new Pentagon(/* TODO parameters? */);
		Shape hexagon	= new Hexagon();
		shapes.add(hexagon);
<<<<<<< HEAD
		Shape square = new Square();
		shapes.add(square);
=======
		Shape square = new Square();		
		shapes.add(square);
		shapes.add(circle);
		shapes.add(triangle);
>>>>>>> 5e6832143365124a3e674f83e1ef01498d519f93
		
		for (Shape shape : shapes) {
			String s = 	"---------- "+ shape.getClass() +" --------- \n";
			
			s +=			"Side Length: " + shape.getSideLength()+"\n";
			s +=			"Num sides:   " + shape.getNumSides()+"\n";
			s += 	 	"Area: 		  " + shape.getArea()+"\n";
			s += 	 	"Perimeter: 	  " + shape.getPerimeter()+"\n";
			s +=			"Height:		  " + shape.getHeight()+"\n";
			s +=			"Width:		  " + shape.getWidth()+"\n";
			s +=			"Angle:		  " + shape.getInteriorAngle()+"\n";
			shape.setSideLength(5);
			s +=			"New Length:  " + shape.getSideLength()+"\n";
			//s +=			"-------------------------------------";
			System.out.println(s);
		}
		
	}

}
