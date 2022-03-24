package gamepgm;

public class jhkhjh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,mult=0;
		for(int i=100,j=100;i<=200;i++,j++)
		{
			if(i%3==0)
			{
				sum=sum+i;
			}
			if(j<=200)
			{
				if(j%5==0)
				{
					mult=mult+j;
				}
			}
			
		}
		System.out.println(sum);
		System.out.println(mult);
	}

}
