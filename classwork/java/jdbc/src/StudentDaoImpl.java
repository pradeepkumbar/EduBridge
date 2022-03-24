import java.util.*;
import java.sql.*;

public class StudentDaoImpl implements StudentDao {
	// System.out.println("Connecting to database...");

	Connection con = null;
	PreparedStatement stmt = null;

	public StudentDaoImpl() throws SQLException {

		DBProperties db = new DBProperties();

		con = DriverManager.getConnection(db.getUrl(), db.getUserName(), db.getPassword());

	}

	public void saveStudent() throws SQLException {

		stmt = con.prepareStatement("insert into students values(?,?,?)");

		char ch = 'y';
		do {
			System.out.println("Enter the rollno, name,age");
			Scanner sn = new Scanner(System.in);
			Student student = new Student();

			student.setRollno(sn.nextInt());
			student.setName(sn.next());
			student.setAge(sn.nextInt());
			stmt.setInt(1, student.getRollno());
			stmt.setString(2, student.getName());
			stmt.setInt(3, student.getAge());

			int res = stmt.executeUpdate();
			System.out.println(res);
			System.out.println("Do you want to continue");
			ch = sn.next().charAt(0);
		} while (ch == 'y');
	}

	@Override
	public void updateStudentAge(int rollno, int age) throws SQLException {
		// TODO Auto-generated method stub
		stmt = con.prepareStatement("update students set age =? where rollno=?");
		stmt.setInt(1, age);
		stmt.setInt(2, rollno);
		int rs = stmt.executeUpdate();
		if (rs == 1) {
			System.out.println("Üpdated succesfully");
		} else {
			System.out.println("not updated");
		}
	}

	@Override
	public void deleteStudentById(int rollno) throws SQLException {
		// TODO Auto-generated method stub
		stmt = con.prepareStatement("delete from students where rollno=?");
		stmt.setInt(1, rollno);
		int rs = stmt.executeUpdate();
		if (rs == 1) {
			System.out.println("deleted succesfully");
		} else {
			System.out.println("not deleted");
		}

	}

	@Override
	public List<Student> viewAllStudents() throws SQLException {
		// TODO Auto-generated method stub
		stmt = con.prepareStatement("select *from students");
		ResultSet rs = stmt.executeQuery();
		List<Student> list = new ArrayList<>();
		Student student = new Student();
		while (rs.next()) {

			student.setName(rs.getString("name"));
			student.setAge(rs.getInt("age"));
			student.setRollno(rs.getInt("rollno"));
			list.add(student);

			System.out.print(student.getRollno() + " ");
			System.out.print(student.getName() + " ");
			System.out.print(student.getAge() + " ");
			System.out.println();
		}

		return list;
	}

	@Override
	public void updateStudentName(int rollno, String name) throws SQLException {
		// TODO Auto-generated method stub
		stmt = con.prepareStatement("update students set name =? where rollno=?");
		stmt.setString(1, name);
		stmt.setInt(2, rollno);
		int rs = stmt.executeUpdate();
		if (rs == 1) {
			System.out.println("Üpdated succesfully");
		} else {
			System.out.println("not updated");
		}
	}

	@Override
	public Student findStudentById(int rollno) throws SQLException {
		// TODO Auto-generated method stub
		stmt = con.prepareStatement("select *from students where rollno = ?");
		stmt.setInt(1, rollno);
		ResultSet rs = stmt.executeQuery();
		Student student = new Student();
		rs.next();
		student.setName(rs.getString("name"));
		student.setAge(rs.getInt("age"));
		student.setRollno(rollno);

		return student;
	}

}
/*
 * public User(String userName,String pasword,String fname, String lname,String
 * email, double phnumber, String city) { super(); this.f_name = fname;
 * this.l_name = lname; this.email = email; this.phnumber = phnumber; this.city
 * = city; }
 */