import java.io.FileReader;
	import java.util.Properties;
public class DBProperties {
	
	private String Url;
	private String userName;
	private String password;
	private String driverName;
	 

	public String getUrl() {
		return Url;
	}


	public void setUrl(String url) {
		Url = url;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getDriverName() {
		return driverName;
	}


	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}


	public DBProperties()
	{
		try {
			
		FileReader reader=new FileReader("db.properties");
		Properties properties=new Properties();
		properties.load(reader);
		driverName=properties.getProperty("driverclass");
		Url=properties.getProperty("Url");
		userName=properties.getProperty("username");
		password=properties.getProperty("password");
	
	}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}

	}


