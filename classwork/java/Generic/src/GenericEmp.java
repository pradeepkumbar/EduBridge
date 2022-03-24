import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class GenericEmp {

	public static void main(String[] args)
	{
	
	Set<Employee> set=new TreeSet<>();
	
	set.add(new Employee(101,"Pradeep",50000.0f));
	set.add(new Employee(102,"deepa",45000.0f));
	set.add(new Employee(103,"kavya",48000.0f));
	Iterator<Employee> iterator=set.iterator();

	while(iterator.hasNext())
	{
		System.out.println(iterator.next());
	}
		}
}
