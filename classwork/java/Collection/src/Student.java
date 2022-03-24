import java.util.HashMap;
import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		String name;
		float mark;
		HashMap<String,Float> student=new HashMap<String,Float>();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter how many Students You want to enter");
		int n=scan.nextInt();
		for(int i=0;i<n;i++)
		{
		System.out.println("Enter the Name of the student");
		name=scan.next();
		System.out.println("enter the marks of the student");
		mark=scan.nextFloat();
		student.put(name, mark);
		}
		System.out.println(student);
	}

}
