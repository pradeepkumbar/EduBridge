package interfacepack;

public class TestEmployeeDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDAO employeeDAO=new EmployeeDAOImpl();
		employeeDAO.save(new Employee("raksha","manager"));
		
		
	}

}
