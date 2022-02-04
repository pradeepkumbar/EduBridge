package departmentpackage;

public class Project {
//declaring the project instance variables 
	String pName;
	int pId;
	//declaring the getters and setters values of project
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	//declaring the toString method to return project values
	@Override
	public String toString() {
		return "Project [pName=" + pName + ", pId=" + pId + "]";
	}
	
	

}
