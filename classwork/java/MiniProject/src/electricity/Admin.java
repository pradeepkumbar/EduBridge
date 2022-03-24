package electricity;

//import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Iterator;
import java.util.List;
//import java.io.Serializable;



public class Admin  {

	public static void displayUser() throws FileNotFoundException, IOException, ClassNotFoundException
	{
		
		ObjectInputStream obj=new ObjectInputStream(new FileInputStream("UserRecord.obj"));
		//Object object=obj.readObject();
		@SuppressWarnings("unchecked")
		User user[]=(User)obj.readObject();
		Iterator<User> it=user.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			
		}
		
	}
	
}
