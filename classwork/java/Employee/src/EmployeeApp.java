import java.util.Scanner;

class EmployeeApp {

	public static void main(String[] args) {
		Employee p1=new Employee();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Employe ID");
		p1.id=scan.nextInt();
		System.out.println("Enter Employe Name");
		scan.nextLine();
		p1.name=scan.nextLine();
		System.out.println("Enter Employee Salary");
		p1.salary=scan.nextFloat();
		System.out.println(p1.id);
		System.out.println(p1.name);
		System.out.println(p1.salary);
		p1.eat();
		p1.work();
		p1.sleep();
	}

}
