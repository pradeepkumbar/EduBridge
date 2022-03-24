import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List list=new ArrayList();
		list.add("pradeep");
		list.add("kumbar");
		list.add(1);
		list.add(2);
		list.clear();
		List list1=new ArrayList();
		list1.add("kumbar");
		list1.add(1);
		list1.add(2);
		list=list1;
		list1.clear();
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("hello");
	}

}
