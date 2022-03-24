
public class Bycycle {

	private int gear;
	static int speed;
	private int br;
	public Bycycle(int n)
	{
		speed=n;
	}
	public Bycycle(int gear,int br)
	{
		this.gear=gear;
		this.br=br;
		//applyBrake(br);
	}
	public int applyBrake()
	{
		return speed-=br;
	}
	public int speedup(int val1)
	{
		return speed+=val1;
	}
}
