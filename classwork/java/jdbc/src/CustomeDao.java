import java.sql.SQLException;
import java.util.List;

public interface CustomeDao {
	
	void saveCustomer() throws SQLException;
	void updateCustomerno(int customer_Id,int c_no)throws SQLException;
	void deleteCustomerById(int customer_Id) throws SQLException;
	List<Student> viewAllCustomers() throws SQLException;
	void updateCustomerName(int customer_Id,String c_name) throws SQLException;
	Customer findCustomerById(int customer_Id) throws SQLException;

}
