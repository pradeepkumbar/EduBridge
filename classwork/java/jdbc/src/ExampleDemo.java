import java.io.*;

class Example {
	String user_Name;
	String password;

	Example(String user_Name, String password) {
		this.user_Name = user_Name;
		this.password = password;

	}

	void write_File() {

		BufferedWriter out;
		try {
			out = new BufferedWriter(new FileWriter("E:\\java notes\\example2.txt"));
			out.write(user_Name);
			out.write(password);
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class ExampleDemo {
	public static void main(String[] args) {
		Example e = new Example("root ", "12345678");
		e.write_File();
	}

}
