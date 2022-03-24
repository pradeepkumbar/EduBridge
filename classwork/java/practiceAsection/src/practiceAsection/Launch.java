package practiceAsection;

public class Launch  extends demo implements Sample {
	private Launch() {
		super(5);
		System.out.println("child class constru");
	}

	
	 void add() { System.out.println(" child class"); }
	public static void sayhello()
	{
		System.out.println("hello");
	}

	public static void main(String[] args) {
		demo d = new demo();
		demo l = new Launch();
		Launch l1 = new Launch();
		l.add();
		d.add();
		l1.add();
		l1.sayhello();

	}

}
