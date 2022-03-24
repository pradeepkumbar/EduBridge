public class Manager extends Employee {

	int mId;
	
	Manager(){
		
	}

	public Manager(int empID, String empName, double salary,int mId) {
		/*this.empID=empID;
		this.empName=empName;
		this.salary=salary;*/
		//super();
		super(empID, empName, salary);
		this.mId = mId;
	}

	@Override
	public String toString() {
		return super.toString()+ "Manager [mId=" + mId + "]";
	}
	
	
	
}
