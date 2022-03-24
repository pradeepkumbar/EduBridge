package employeepackage;

public class Manager {
	//declaring the manager instance variable 
	private int Mid;
	public String Mname;
	protected float salary;
	//initializing Manager values by constructor
	public Manager(int id,String name,float sal)
	{
		this.Mid=id;
		this.Mname=name;
		this.salary=sal;
	}
	//display method to print manager values
	public void display()
	{
		System.out.println("Manager Id ="+Mid);
		System.out.println("Manager Name ="+Mname);
		System.out.println("Manager Salary ="+salary);
		
	}
	
	

}
