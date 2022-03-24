package assignment;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		EmployeeUtility emp1=new EmployeeUtility();
		ArrayList<Employee> arraylist=new ArrayList<Employee>();
		arraylist.add(new Employee(101,"sam",345.56f));
		arraylist.add(new Employee(102,"harry",205.56f));
  		emp1.addEmployee("akio.txt",arraylist );
  		Employee emp2=emp1.viewEmployeeById("akio.txt", 102);
  		System.out.println(emp2.getName()+" "+emp2.getEmployeeId()+" "+emp2.getAppraisalRating());
	}

}

