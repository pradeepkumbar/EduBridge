public class TestIn {

	public static void main(String[] args) {
	
		Employee e=new Employee();//default constructor of employee
		//memory gets allocated and default values will be assigned
		//address will be assigned to e variable
		System.out.println(e);
		
		Manager manager=new Manager(100,"Nitish",65341.73,200);
		
		System.out.println(manager);//tostring()
       
		AssistantManager manager1=new AssistantManager(100,"Nitish",65341.73,200);
       
		System.out.println(manager1);
	}

}
