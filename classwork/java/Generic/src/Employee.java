
public class Employee implements Comparable {
	String name;
	int id;
	float salary;
	Employee(int id,String name,float salary)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Employee emp=(Employee)o;
		if(this.id==emp.id)//106==103
		return 0;
		else if(this.id>emp.id)
			return 1;
		else
			return -1;
	}	}

}
