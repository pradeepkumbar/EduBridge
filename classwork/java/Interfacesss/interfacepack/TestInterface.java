package interfacepack;

public class TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BasicCalInterface basic=new CalculatorImpl(100,2,3);
basic.add();
basic.mult();
basic.div();
basic.sub();

AdvanceCal cal=new CalculatorImpl();
cal.log();
cal.sin();
cal.square(4);
cal.getPi();

ScienticCal cal1=new CalculatorImpl();
cal1.findTemp();




	}

}
