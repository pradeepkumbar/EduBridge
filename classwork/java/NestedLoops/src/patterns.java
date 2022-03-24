/* Program to print this
    *
   **
  ***
 ****
******/
public class patterns {

	public static void main(String[] args) {
		//for loop for rows 
		for(int i=1;i<=5;i++)
		{
			//for loop for space printing
			for(int j=i;j<5;j++)
			{
				System.out.print(" ");
			}
			//for loop to print star
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			//moving cursor to next line
			System.out.println();
			}
		}

	}


