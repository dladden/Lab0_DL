import java.*;

public class Circle {
	
	private double radius;//instance field variable
	
	public Circle(){
		
		this.radius = 1.0;
		
	}//End empty argument constructor
	
	public Circle(double r) {
		
		setRadius(r);
		
	}//End Preferred constructor
	
	public double calculateArea() {
		
		double area = Math.PI * Math.Pow(radius, 2.0);
		
		return area;
		
		//return Math.PI * Math.pow(radius, 2.0);
		
	}//End calculateArea

	public double getRadius() {
		
		return radius;
		
	}//End getRadius

	public void setRadius(double radius) {
		
		if(radius < 1.0)
			this.radius = 1.0;
		else
			this.radius = radius;
		
	}//End setRadius

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	
	
	
	
	
}//End Class
