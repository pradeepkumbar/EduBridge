package interfacepack;

public interface EmployeeDAO {
	void save(Employee emp);
	Employee[] findAll();
	Employee update(Employee emp);
	void remove(Employee emp);

}
