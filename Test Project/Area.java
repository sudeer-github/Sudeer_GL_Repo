
public class Area {

	final float pi = 22/7;
	public float radius, result;
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
     Area area = new Area();
     area.radius = 10;
     area.result = area.pi * area.radius * area.radius;
     
     System.out.println("Area of the circle = " + area.result + "cm" );
	}

}
 