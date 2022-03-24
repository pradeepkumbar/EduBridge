package electricity;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class User implements Serializable{

	private String fname;
	private String lname;
	private String userName;
	private String password;
	private String email;
	private double phnumber;
	//Address adress;
	String city;
	public User(){

	}
	public User(String fname, String lname,String email, double phnumber,
			String city) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phnumber = phnumber;
		this.city = city;
	}

	public void details(String username,String password)
	{
		HashMap<String,String> usermap=new HashMap<String,String>();
		usermap.put(username, password);
		File file=new File("userlogin.txt");
		BufferedWriter buffer=null;
		try {
			buffer=new BufferedWriter(new FileWriter(file,true));
			Set<Map.Entry<String,String>> set=usermap.entrySet();
			for(Map.Entry<String,String> st: set)
			{
				buffer.write(st.getKey()+":"+st.getValue());
				buffer.newLine();
			}
			buffer.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				buffer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}



	}

	@Override
	public String toString() {
		return "User [fname=" + fname + ", lname=" + lname + ", email=" + email + ", phnumber=" + phnumber + ", city=" + city + "]";
	}


}
