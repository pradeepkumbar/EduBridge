
public abstract class TwoD implements Recolorable,Shape {
	ShapeColor sc;
	int a;
	int b;
	int c;
	int d;
	TwoD()
	{

	}
	TwoD(ShapeColor sc,int a)
	{
		this.sc=sc;
		this.a=a;
	}
	TwoD(ShapeColor sc,int a,int b)
	{

	}
	TwoD(ShapeColor sc,int a,int b,int c)
	{

	}
	TwoD(ShapeColor sc,int a,int b,int c,int d)
	{

	}
	TwoD(TwoD td)
	{

	}
	public ShapeColor getSc() {
		return sc;
	}
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	public int getC() {
		return c;
	}
	public int getD() {
		return d;
	}


}
