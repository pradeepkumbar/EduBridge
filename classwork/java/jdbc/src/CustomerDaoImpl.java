import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerDaoImpl implements CustomeDao {

	Connection con = null;
	PreparedStatement stmt = null;

	public CustomerDaoImpl() throws SQLException {

		DBProperties db = new DBProperties();

		con = DriverManager.getConnection(db.getUrl(), db.getUserName(), db.getPassword());

	}

	public void saveCustomer() throws SQLException {

		stmt = con.prepareStatement("insert into customer values(?,?,?)");
		Customer customer = new Customer();

		char ch = 'y';
		do {
			System.out.println("Enter the customer_Id, c_name,c_no");
			Scanner sn = new Scanner(System.in);
			customer.setCustomer_Id(sn.nextInt());
			customer.setC_name(sn.next());
			customer.setC_no(sn.nextInt());
			stmt.setInt(1, customer.getCustomer_Id());
			stmt.setString(2, customer.getC_name());
			stmt.setInt(3, customer.getC_no());
			int res1 = stmt.executeUpdate();
			System.out.println(res1);
			System.out.println("Do you want to continue");
			ch = sn.next().charAt(0);
		} while (ch == 'y');

	}

	public void updateCustomerno(int customer_Id,int c_no) throws SQLException {
		stmt = con.prepareStatement("update customer set c_no=? where customer_Id=?");
		stmt.setInt(1, c_no);
		stmt.setInt(2, customer_Id);
		int rs = stmt.executeUpdate();
		if (rs == 1) {
			System.out.println("Üpdated succesfully");
		} else {
			System.out.println("not updated");
		}

	}

	public void deleteCustomerById(int customer_Id) throws SQLException {

		stmt=con.prepareStatement("delete from customer where customer_ID=?");
		stmt.setInt(1, customer_Id);
		int rs = stmt.executeUpdate();
		if (rs == 1) {
			System.out.println("deleted succesfully");
		} else {
			System.out.println("not deleted");
		}
	}

	@Override
	public List<Student> viewAllCustomers() throws SQLException {
		// TODO Auto-generated method stub
		stmt=con.prepareStatement("select *from customer");
		ResultSet rs = stmt.executeQuery();
		List<Customer> list = new ArrayList<>();
		Customer customer = new Customer();
		while (rs.next()) {

			customer.setCustomer_Id(rs.getInt("customer_Id"));
			customer.setC_name(rs.getString("c_name"));
		    customer.setC_no(rs.getInt("c_no"));
			list.add(customer);

			System.out.print(customer.getCustomer_Id() + " ");
			System.out.print(customer.getC_name()+ " ");
			System.out.print(customer.getC_no()+ " ");
			System.out.println();
		}
		
		
		
		return null;
	}

	@Override
	public void updateCustomerName(int customer_Id, String c_name) throws SQLException {
		// TODO Auto-generated method stub
		
		stmt=con.prepareStatement("update customer set c_name=? where customer_Id=?");
		stmt.setString(1, c_name);
		stmt.setInt(2, customer_Id);
				
		int rs = stmt.executeUpdate();
		if (rs == 1) {
			System.out.println("updated succesfully");
		} else {
			System.out.println("not update");
		}
		
		
	}

	@Override
	public Customer findCustomerById(int customer_Id) throws SQLException {
		// TODO Auto-generated method stub
		stmt = con.prepareStatement("select *from customer where customer_Id = ?");
		stmt.setInt(1, customer_Id);
		ResultSet rs = stmt.executeQuery();
		Customer customer = new Customer();
		rs.next();
		customer.setCustomer_Id(rs.getInt("customer_Id"));
		customer.setC_name(rs.getString("c_name"));
		customer.setC_no(rs.getInt("c_no"));
		System.out.print(customer.getCustomer_Id() + " ");
		System.out.print(customer.getC_name()+ " ");
		System.out.print(customer.getC_no()+ " ");
		System.out.println();
		
		return null;
	}

}
