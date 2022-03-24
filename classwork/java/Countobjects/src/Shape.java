
public class Shape {
static int cnt=0;
 public Shape()
 {
	 cnt++;
 }
 public void count()
 {
	 System.out.println("number of objects created :"+cnt);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape shape=new Shape();
		Shape obj=new Shape();
		obj.count();
			}

}
