public class Employee extends Object {
	
	private int empID;                            
					  
													  
	private String empName;
	private double salary;
	
	public Employee()
	{
		super();//object class default constructor
	}

	public Employee(int empID, String empName, double salary) {
		super();//calls the object class default constructor
		this.empID = empID;
		this.empName = empName;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", salary=" + salary + "]";
	}
	

}
