package practice;


class Sample
{
	int number1;
	
	Sample(int number1)
	{
		this.number1=number1;
	}
	public boolean equals(Object obs)
	{
		Sample s=(Sample)obs;
		if(this.number1==s.number1)
			return true;
		else
			return false;
	}
}

public class StringEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sample sample1=new Sample(100);
		Sample sample2=new Sample(100);
		
		if(sample1.equals(sample2))
		{
			System.out.println("same");
		}else
			System.out.println("not same");
		
		/*String name="Hello";
		
		System.out.println("first"+name);
		
		String name1="Hello";
		
		System.out.println("second"+name);
		
		String n1=new String("kavya");
		String n2=new String("kavya");
		
		if(n1.equals(n2))
		{
			System.out.println("same");
		}
		*/
		/*if(name==name1)
		{
		System.out.println("SAME");	
		}else
			System.out.println("Not SAME");	
		
		if(n1==n2)
		{
		System.out.println("SAME");	
		}else
			System.out.println("Not SAME");	*/
	}

}
