package departmentpackage;

public class Department {
	//declaring the instance variables of department
	
	int dId;
	String dName;
	//declaring the setter and getter methods of Department
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	//returning the values by to string method
	@Override
	public String toString() {
		return "Department [dId=" + dId + ", dName=" + dName + "]";
	}
	
	
}
