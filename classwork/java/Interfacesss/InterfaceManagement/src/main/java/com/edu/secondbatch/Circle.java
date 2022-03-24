package com.edu.secondbatch;

public class Circle extends TwoD {

	int radius;
	public Circle()
	{
		
	}
	public Circle(Circle c)
	{
		
	}
	public Circle(ShapeColor sc,int radius)
	{
	this.sc=sc;
	this.radius=radius;
	}
	public int getRadius()
	{
		return radius;
	}
	void set(ShapeColor sc, int radius)
	{
		this.sc=sc;
		this.radius=radius;
	}
	public double area() {
		// TODO Auto-generated method stub
		return 3.142*radius*radius;
	}
	public void recolor(ShapeColor sc) {
		// TODO Auto-generated method stub
		this.sc=sc;
	}
	@Override
	public String toString() {
		return super.toString()+"Circle [radius=" + radius + "]";
	}
	
	
}
