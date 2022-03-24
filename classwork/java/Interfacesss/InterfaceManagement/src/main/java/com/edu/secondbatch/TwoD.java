package com.edu.secondbatch;

public abstract class TwoD implements Shape, Recolorable {

	ShapeColor sc;
	int a,b,c,d;
	
	public TwoD()
	{
		
	}
	public TwoD(TwoD d)
	{
		
	}
	public TwoD(ShapeColor sc, int a)
	{
		this.sc=sc;
		this.a=a;
	}
	public TwoD(ShapeColor sc, int a,int b)
	{
		this.sc=sc;
		this.a=a;
		this.b=b;
				
	}
	public TwoD(ShapeColor sc, int a,int b,int c)
	{
		this.sc=sc;
		this.a=a;
		this.b=b;
		this.c=c;
				
	}
	public TwoD(ShapeColor sc, int a,int b,int c, int d)
	{
		this.sc=sc;
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
				
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
	public void set(ShapeColor sc, int a, int b, int c,int d)
	{
		this.sc=sc;
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
	}
	void reColor(ShapeColor sc)
	{
		this.sc=sc;
	}
	@Override
	public String toString() {
		return "TwoD [sc=" + sc + ", a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
	}
	
	
	
}
