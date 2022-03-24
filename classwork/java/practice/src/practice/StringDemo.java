package practice;

import java.io.Serializable;

class Student{
	String name;
	transient int id;
	//Teacher teacher;
	
	public Student()
	{
		
	}
	
	public Student(String name, int id)
	{
	this.name=name;
	this.id=id;
	//this.teacher=teacher;
	}

	public String toString()
	{
		return name+" "+id;
	}
}


public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="Hello";//string constant pool
		String name1="Hello";
		
		if(name==name1)
		{
			System.out.println("same");
		}else
			System.out.println("not same");
			
		
		String sname=new String("Hello");
		
		  StringBuffer buf=new StringBuffer("hello");//thread safe
		  buf.append("world");
		  //StringBuilder //not thread safe
				  
		if(name.equals(sname))
			System.out.println("same");
		else 
			System.out.println("not same");
		
		Student s1=new Student("nisha",10);
		Student s2=new Student("nisha",10);
		
		if(s1.equals(s2))
		{
			System.out.println("same");
			
		}else
			System.out.println("not same");
		
		
		
		
		
	}

}
