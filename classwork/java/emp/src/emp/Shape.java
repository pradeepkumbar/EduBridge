package emp;

public class Shape {

	public int Id;
	public String name;
	public String color;
	Shape()
	{
		
	}
	
	public Shape(int Id,String name,String color)
	{
		this.Id=Id;
		this.name=name;
		this.color=color;
	}
	@Override
	public String toString() {
		return "Shape [Id=" + Id + ", name=" + name + ", color=" + color + "]";
	}
	
}
