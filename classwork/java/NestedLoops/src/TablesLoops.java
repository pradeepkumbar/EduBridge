//Programm to print the tables from 2s to 10th.
public class TablesLoops {

	public static void main(String[] args) {
		//for loop to multiplay value
		for(int i=2;i<=10;i++)
		{
			//for loop multiply with table number
			for(int j=1;j<=10;j++)
			{
				//printing the tables line by line
				System.out.print(i*j+" ");
				
			}
			//miving cursor to next line
			System.out.println("");
		}
	}

}
