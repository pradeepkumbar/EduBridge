import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student> s=new HashSet<>();
		s.add(new Student("pradeep",101,89.0f));
		s.add(new Student("raju",102,80.0f));
		s.add(new Student("ramesh",103,84.0f));
		Iterator<Student> iterator=s.iterator();

while(iterator.hasNext())
{
	System.out.println(iterator.next());
}
	}

}
