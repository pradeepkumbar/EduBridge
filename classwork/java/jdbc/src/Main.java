import java.sql.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);

		System.out.println("Enter 1 - students & 2 - customer ");
		int option=sn.nextInt();
		if(option==1) {
		StudentDaoImpl studentDaoImpl = new StudentDaoImpl();
		studentDaoImpl.saveStudent();
		System.out.println("Enter the student rollno");
		int rollno=sn.nextInt();
		studentDaoImpl.deleteStudentById(rollno);
		System.out.println("Enter the student rollno");
		rollno=sn.nextInt();
		studentDaoImpl.findStudentById(rollno);
		System.out.println("Enter the student rollno & age");
		rollno=sn.nextInt();
		int age = sn.nextInt();
		studentDaoImpl.updateStudentAge(rollno,age );
		System.out.println("Enter the student rollno & name");
		rollno=sn.nextInt();
		String name = sn.next();
		studentDaoImpl.updateStudentName(rollno, name);
		studentDaoImpl.viewAllStudents();
		}
		if(option==2) {
		CustomerDaoImpl customerDaoImpl = new CustomerDaoImpl();
		customerDaoImpl.saveCustomer();
		System.out.println("Enter the customer Id");
		int c_Id=sn.nextInt();
		customerDaoImpl.deleteCustomerById(c_Id);
		System.out.println("Enter the customer Id & c_no");
		c_Id=sn.nextInt();
		int c_no = sn.nextInt();
		customerDaoImpl.updateCustomerno(c_Id, c_no);
		System.out.println("Enter the customer Id & c_name");
		c_Id=sn.nextInt();
		String c_name=sn.next();
		customerDaoImpl.updateCustomerName(c_Id, c_name);
		customerDaoImpl.viewAllCustomers();
		System.out.println("Enter the customer Id");
	    c_Id=sn.nextInt();
		customerDaoImpl.findCustomerById(c_Id);
		}
		
		
		
		
		
	}

}
