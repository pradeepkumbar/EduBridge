//package collectionclasses;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) throws IOException
	{
	
	 FileReader reader = new FileReader("db.properties");
	  
      // create properties object
      Properties p = new Properties();
 
      // Add a wrapper around reader object
      p.load(reader);

      // access properties data
      System.out.println(p.getProperty("username"));
      System.out.println(p.getProperty("password"));
      System.out.println(p.getProperty("port"));
      System.out.println(p.getProperty("databasename"));
      
      
      
      
	}
}
