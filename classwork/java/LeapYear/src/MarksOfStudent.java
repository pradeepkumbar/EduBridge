//Displaying marks of student
import java.util.Scanner;

public class MarksOfStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		//Asking the user to enter the roll no of the student.
		System.out.println("Enter Roll Number");
		int rollnum=scan.nextInt();
		//Asking the user to enter the Name of the student.
		System.out.println("Enter Name of the Student");
		scan.nextLine();
		String name=scan.nextLine();
		//Asking the user to enter the marks of the student.
		System.out.println("Enter Marks ");
		int phy,chm,compap,total; 
		phy=scan.nextInt();
		chm=scan.nextInt();
		compap=scan.nextInt();
		//FInding the total of three subjects.
		total=phy+chm+compap;
		//Finding the percentage of three subjects.
		float percent=((float)(phy+chm+compap)/300.0f)*100.0f;
		//Printing  the student Details and percentage of the student.
		System.out.println("Roll No"+rollnum);
		System.out.println("Name of Student "+name);
		System.out.println("Marks in Physics "+phy);
		System.out.println("Marks in Chemestry "+chm);
		System.out.println("Marks in Computer Application "+compap);
		System.out.println("Total Marks "+total);
		System.out.println("Percentage "+percent);
		//Checking and display the Division of the Student got passed.
		if(percent>=60)
			System.out.println("First");
		else if(percent>=50 && percent<60)
			System.out.println("Second");
		else if(percent>=35 && percent<50)
			System.out.println("Third");
		else
			System.out.println("Fail");
		
		
		
	}

}
