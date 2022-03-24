import java.util.HashSet;
import java.util.Set;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class Student extends Object{
	String name;
	int id;
	float marks;
	Student(String name,int id,float marks)
	{
		this.name=name;
		this.id=id;
		this.marks=marks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", marks=" + marks + "]";
	}

	

}
