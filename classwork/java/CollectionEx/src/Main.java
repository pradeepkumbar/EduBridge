import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
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
	scan.close();
	HashMap<String,String> mp=UserMainCode.calculateGrade(student);
	Set<Map.Entry<String,String>> set=mp.entrySet();
	for(Map.Entry<String,String> st: set)
	{
		System.out.println(st.getKey());
		System.out.println(st.getValue());
	}
}
}