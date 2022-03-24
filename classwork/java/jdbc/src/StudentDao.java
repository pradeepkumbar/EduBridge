import java.sql.SQLException;
import java.util.List;

public interface StudentDao {

	void saveStudent() throws SQLException;
	void updateStudentAge(int rollno,int age) throws SQLException;
	void deleteStudentById(int rollno) throws SQLException;
	List<Student> viewAllStudents() throws SQLException;
	void updateStudentName(int rollno,String name) throws SQLException;
	Student findStudentById(int rollno) throws SQLException;
	
}
