package emptest;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		System.out.println("Welcome to Employee Administration");
		do {
			System.out.println("1: Add Employee");
			System.out.println("2: Display All Employees");
			System.out.println("3: Find Employee based employeeid ");
			System.out.println("4: Find employee based on Name");
			System.out.println("5. Delete Emloyee based on Id");
			System.out.println("enter the option to perform a task");
			Scanner sn=new Scanner(System.in);
			int option=sn.nextInt();


			switch(option)
			{
			case 1: 
				Employee emp=new Employee();
				System.out.println("Enter id name and salary");
				int id;
				String name;
				double salary;
				id=sn.nextInt();
				name=sn.next();
				salary=sn.nextDouble();
				emp.setEmpid(id);
				emp.setEname(name);
				emp.setSalary(salary);
				ManageEmployees.addEmployee(emp); 
				break;

			case 2: ManageEmployees.displayEmployees();
			break;
			case 3:System.out.println("enter the empid need to search");
			int empid=sn.nextInt();
			int pos=ManageEmployees.findEmp_onId(empid);
			if(pos>=0)
				System.out.println("found the employee--position is "+pos);
			else
				System.out.println("not found the employee");	
			break;
			case 4:System.out.println("enter the empname need to search");
			String empname=sn.next();
			Employee emp1=ManageEmployees.findEmp_onName(empname);
			if(emp1!=null)
				System.out.println("found the employee- is "+emp1);
			else
				System.out.println("not found the employee");	
			break;
			case 5: System.out.println("Enter the Id to delete");
			int Eid=sn.nextInt();
			

			default: System.out.println("enter the valid option");

			}
			System.out.println("Do you want to continue");
			ch=sn.next().charAt(0);
		}while(ch=='y' || ch=='Y');
	}
}
