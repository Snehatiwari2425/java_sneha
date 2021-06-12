
package Day3Task;



class Shape{
	void draw() {
		System.out.println("drwaing....");
	}
	
}

class Circle extends Shape{
	void draw() {
		System.out.println("drwaing circle");
	}
	
	
}
class Rectangle extends Shape{
	void draw() {
		System.out.println("drwaing rectangle");
	}
	
}


public class PolyShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape s;
		s=new Circle();
		s.draw();
		s=new Rectangle();
		s.draw();

	}

}
