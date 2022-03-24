package interfacepack;

public class TestEGadgets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ElectronicGadgets eg=new ElectronicGadgets();
		ElectronicGadgets eg;
		
		eg=new Computer("hp",76532.73,2,20);
		eg.on();//
		eg.off();
		System.out.println(eg);
		eg=new Telivision();
		
		
		eg.on();
		eg.off();
	}

}
