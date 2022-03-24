package emptest;

public class ManageEmployees {

	static Employee[] employeeList=new Employee[50];
	static int count=0;
	
	public static void addEmployee(Employee employee)
	{
		employeeList[count]=employee;
		count++;
	}
	public static void displayEmployees()
	{
		for(int i=0;i<count;i++)
		{
			System.out.println(employeeList[i]);
		}
	}
	public static int findEmp_onId(int empid)
	{
		for(int i=0;i<count;i++)
		{
			if(employeeList[i].getEmpid()==empid)
			{
				return i;
				
			}
		}
		return -1;
	}
	public static Employee findEmp_onName(String empname)
	{
		for(int i=0;i<count;i++)
		{
			if(employeeList[i].getEname().equals(empname))
			{
				return employeeList[i];
				
			}
		}
		return null;
	}
	public static int deletEmp_onId(int eid)
	{
		for(int i=0;i<count;i++)
		{
			if(employeeList[i].getEmpid()==eid)
			{
				
				
			}
		}
		return -1;
	}
}
