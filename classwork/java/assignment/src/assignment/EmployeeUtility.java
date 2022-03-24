package assignment;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
//import java.io.FileWriter;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeUtility 
{
	public boolean addEmployee(String fileName,ArrayList<Employee> employeeList) throws FileNotFoundException, IOException
	{
		ObjectOutputStream obj=new ObjectOutputStream(new FileOutputStream(fileName));
		obj.writeObject(employeeList);
		obj.close();
		return true;
		
	}

	public Employee viewEmployeeById(String fileName,int employeeId) throws ClassNotFoundException, IOException
	{
		ObjectInputStream obj=new ObjectInputStream(new FileInputStream(fileName));
		List<Employee> list=(List<Employee>) obj.readObject();
		Iterator<Employee> it=list.iterator();
		while(it.hasNext())
		{
			Employee emp=it.next();
			if(emp.getEmployeeId()==employeeId)
			{

