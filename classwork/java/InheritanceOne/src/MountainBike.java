
public class MountainBike extends Bycycle {

	private int seatheight=0;
	public MountainBike(int gr,int br,int set)
	{
		super(gr,br);
		this.seatheight=set;
		Setheight();
	}
	public int Setheight()
	{
		return seatheight+=seatheight;
		
	}
}
