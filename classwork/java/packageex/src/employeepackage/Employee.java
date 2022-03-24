package employeepackage;
//Declaring Employee class
public class Employee {
	//declaring employee instance variable
	private int Empid;
	public String Empname;
	protected float Empsalary;
	
	//Employee constructor 
		public Employee(int id,String name,float sal)
	{
		this.Empid=id;
		this.Empname=name;
		this.Empsalary=sal;
	}
	//declaring info to print employee
	public void info()
	{
		System.out.println("Employee Id ="+Empid);
		System.out.println("Employee Nmae ="+Empname);
		System.out.println("Employee Salary ="+Empsalary);
	}

	

}
