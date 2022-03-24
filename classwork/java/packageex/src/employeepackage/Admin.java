package employeepackage;

public class Admin {
	//declaring the instancevariable of Admin
	private int Aid;
	public String Aname;
	private float salary;
	//Initializing instance variable in constructor
	public Admin(int id,String name,float sal)
	{
		this.Aid=id;
		this.Aname=name;
		this.salary=sal;
		
	}
	//printing the values by disp() method
	public void disp()
	{
		System.out.println("AdminId ="+Aid);
		System.out.println("Admin Name ="+Aname);
		System.out.println("Admin Salary ="+salary);
	}
	

	

}
