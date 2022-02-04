//program to create employee object initializing
package pgm5;

public class employee {

	int empId;
	String empName;
	int empSalary;
	String empDesg;
	public void display()
	{
		empId=101;
		empName="Pradeep kumbar";
		empSalary=25000;
		empDesg="Software Developer";
		System.out.println("Employe Id :"+empId+"\nEmploye Name :"+empName+"\nEmploye Salary :"+empSalary+"\nEmploye Designation :"+empDesg);
	}
	public static void main(String[] args) {
		

		employee emp=new employee();
		emp.display();
		employee emp1=new employee();
		emp1.display();
		employee emp2=new employee();
		emp2.display();
		
	}

}

