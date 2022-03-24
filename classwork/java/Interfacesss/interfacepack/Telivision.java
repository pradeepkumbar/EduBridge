package interfacepack;

public class Telivision implements ElectronicGadgets{

	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("Use remote or App to switch on the tv");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("Use remote or App to switch off the tv");
	}

}
