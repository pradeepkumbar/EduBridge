package interfacepack;
                              // on{}                   on();
public class Computer extends Gadgets implements ElectronicGadgets{

	int memorysize;
	
	
	public Computer(String name, double price,int warranty,int memorysize) {
		super(name,price,warranty);
		this.memorysize = memorysize;
		
	}
	public void on()
	{
		System.out.println("press start button to start ");
	}
	public void off()
	{
		System.out.println("do shutdown ");
		
	}
	@Override
	public String toString() {
		return super.toString()+" "+ "Computer [memorysize=" + memorysize + "]";
	}
	
}
