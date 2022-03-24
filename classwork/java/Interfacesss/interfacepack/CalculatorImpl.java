package interfacepack;

public class CalculatorImpl extends Object implements BasicCalInterface, AdvanceCal, ScienticCal  {

	int n1,n2,n3;
	
	CalculatorImpl()
	{
		
	}
	
	CalculatorImpl(int n1,int n2, int n3)
	{
		this.n1=n1;
		this.n2=n2;
		this.n3=n3;
	}
	
	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("sum:"+n1+n2+n3);
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("sum:"+(n1-n2-n3));
	}

	@Override
	public void mult() {
		// TODO Auto-generated method stub
		System.out.println("sum:"+n1*n2*n3);	
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		System.out.println("sum:"+ (n1/n2));
	}

	@Override
	public void log() {
		// TODO Auto-generated method stub
		System.out.println("log 2 ");
	}

	@Override
	public double getPi() {
		// TODO Auto-generated method stub
		return 3.142;
	}

	@Override
	public void sin() {
		// TODO Auto-generated method stub
		System.out.println(0);
	}

	@Override
	public void square(int n) {
		// TODO Auto-generated method stub
		System.out.println(n*n);
	}

	@Override
	public void findTemp() {
		// TODO Auto-generated method stub
		
	}

}
