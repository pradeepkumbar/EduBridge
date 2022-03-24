package interfacepack;

public class Employee {
private String name;
private String desg;
public Employee(String name, String desg) {
	super();
	this.name = name;
	this.desg = desg;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDesg() {
	return desg;
}
public void setDesg(String desg) {
	this.desg = desg;
}

}
