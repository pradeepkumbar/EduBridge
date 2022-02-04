/*Program to print this
*
**
***
****
*****/
public class PatternTriangle {

	public static void main(String[] args) {
		//for loop for rows
		for(int i=1;i<=5;i++)
		{
			//for loop for culmn to print star
			for(int j=1;j<=i;j++)
			{
			System.out.print("*");	
			}
			//Moving cursor to next line
			System.out.println("");
		}	
	}

}
