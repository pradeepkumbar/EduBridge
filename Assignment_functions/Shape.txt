package pgm;
class Shape
{
	//member variables
	String sname;
	int sid;
	int length, breadth;
	float area;
	static int count;
 //declaring static block to count objects
	static{ count=0;}
	//constructor to count objects
	Shape()	
	{
		count=count+1;	
	}
	Shape(String sname, int sid, int length, int breadth, float area)	
	{
		this.sname=sname;
		this.sid=sid;
		this.length=length;
		this.breadth=breadth;
		this.area=0.0f;
		count=count++;
	}
	public static void main(String[] a)
	{
		Shape shape=new Shape();
		Shape sHape=new Shape();
		Shape shEpe=new Shape();
		Shape shaPe=new Shape();
		System.out.println(Shape.count);
	}
}
