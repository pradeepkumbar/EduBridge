import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the the value to set speed");
		int n=scan.nextInt();
		Bycycle bycycle=new Bycycle(n);
		//System.out.println(mountainbike.speedup(n));
		System.out.println("Enter gear and break to reduce the speed");
		int gear=scan.nextInt();
		int breaks=scan.nextInt();
		System.out.println("Enter the value set seat height");
		int setht=scan.nextInt();
		MountainBike mountainbike=new MountainBike(gear,breaks,setht);
		System.out.println("reduced speed is :"+mountainbike.applyBrake());
		
		System.out.println("enter value to increase the speed");
		int sp=scan.nextInt();
		System.out.println("Increased speed is :"+mountainbike.speedup(sp));
		System.out.println("Seat height is :"+mountainbike.Setheight());
				
	}

}
