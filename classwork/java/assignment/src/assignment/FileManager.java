package assignment;
import java.io.*;
import java.util.*;
@SuppressWarnings("unchecked")//Do not delete this line
public class FileManager 
{

	static public File createFile()
	{
		File file =new File("visitors.txt");
		try{     
			file.createNewFile();
		}
		catch (IOException e)   
		{  
			e.printStackTrace();    //prints exception if any  
		}      

		return file;
	}
	//change the return type as per the requirement    
	 public void writeFile(File f, String record)
	{    try { 


		BufferedWriter out = new BufferedWriter(new FileWriter(f.getName())); 
		out.write(record+";"); 
		out.close(); 
	} 
	catch (IOException e) { 
		System.out.println("exception occoured" + e); 
	} 

	} 
	 public String[] readFile(File f)
	{
		while (myReader.hasNextLine()) {

			String []arr= myReader.nextLine().split(";");
			tokens = Arrays.asList(arr);
			tokens.add(myReader.nextLine());

		}

		myReader.close();
	}
	catch (FileNotFoundException e) {
		System.out.println("An error occurred.");
		e.printStackTrace();
	}
	String[] tokenArray = tokens.toArray(new String[0]);
	//=tokenArray.split(";");
	return tokenArray;
}
}

