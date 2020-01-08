package Day49_Recap;

public class Cylinder extends A_Shape {
	
	double radius;
	double height;
	double PI = 3.14;
	
	public Cylinder (double radius, double height) {
		
		this.radius = radius;
		this.height=height;
	}
	
	@Override
	protected void Area() {
		
		double Area =  (2*PI*radius*radius) + (height*2*PI*radius) ;
		
		System.out.println("Area of the cylinder is " + Area);
		
	}
	
	
	@Override
	protected void perimeter () {
		
		double perimeter = 2*(PI*radius*2+height);
		
		System.out.println("perimeter of the cylinder is "+perimeter);
		
		
	}
	
	

}
