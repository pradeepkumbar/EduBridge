package emptest;

public class Employee {
	//member variables
	private String ename;
	private int empid;
	private double salary;

	//member functions or methods
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return "Employee [ename=" + ename + ", empid=" + empid + ", salary=" + salary + "]";
	}
}
	
