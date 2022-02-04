//implementing the package program 
import employeepackage.*;
import departmentpackage.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaring employee object and initializing through constructor 
		Employee employee=new Employee(100,"pradeep",50555.0f);
		//call info method  
		employee.info();
		//declaring Admin object to call disp method of admin
		Admin admin=new Admin(1001,"Prashant",30000.00f);
		admin.disp();
		//Declaring manger object and initializing constructor
		Manager manager=new Manager(2000,"Nikita",40000.00f);
		//calling Manager display method using manager object
		manager.display();
		//creating department object to call setter and getters method of department
		Department dept=new Department();
		dept.setdId(203);
		dept.setdName("CSE");
		//printing dept values
		System.out.println(dept);
		//declaring project object to call the seter and  getter method
		Project project=new Project();
		project.setpId(10001);
		project.setpName("Web Application");
		//printing project values
		System.out.println(project);
	}

}
