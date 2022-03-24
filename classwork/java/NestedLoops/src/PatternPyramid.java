/*Program to print this
      *
     ***
    *****
   *******
  *********
 
 */
public class PatternPyramid {

	public static void main(String[] args) {
		int x=1;
		//for loop for rows
		for(int i=0;i<5;i++)
		{
			//for loop for printing spaces count
			for(int j=0;j<=5-i;j++)
			{
				System.out.print(" ");	
			}
			//for loop to take i position and printing star.
			for(int k=0;k<x;k++) {
				System.out.print("*");
				}
			x+=2;
			//moving cursor to next line
			System.out.println();
		}	

	}

}
