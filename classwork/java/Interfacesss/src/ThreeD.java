
public abstract class ThreeD implements Shape,Resizable{

	ShapeColor sc;
	double a;
	public ThreeD()
	{

	}
	public ThreeD(ShapeColor sc, double a) {
		super();
		this.sc = sc;
		this.a = a;
	}
	public ThreeD(ThreeD td)
	{

	}

	public void setSc(ShapeColor sc,double a) {
		this.sc = sc;
		this.a=a;
	}
	public double getA() {
		return a;
	}

	void resize(double percentage)
	{
		

}
	double volume()
	{
		return a;
	}
	@Override
	public String toString() {
		return "ThreeD [sc=" + sc + ", a=" + a + "]";
	}
		

}
