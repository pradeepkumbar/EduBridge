//Implementnig Hangaman game,By taking input from the player. 
package gamepgm;
import java.util.*;

public class Hangmangame {
//Defining display method to print the intructions 
	public static void display()
	{
		System.out.println("---->Choose one person to be the executioner. ");
		System.out.println("---->That person will think of a word or short phrase an mark out blanks (short lines) for each letter of each word.");
				System.out.println("---->Separate words with either a slash, a fairly wide gap, or place words on separate lines. ");
						System.out.println("---->Then another player will guess a letter.");
								System.out.println("---->If that letter is in the word(s) then write the letter in everywhere it would appear, an cross out that letter in the alphabet.");
										System.out.println("---->If the letter isn't in the word then add a body part to the gallows (head, body, left arm, right arm, left leg, right leg).");
												System.out.println("---->The player will continue guessing letters until they can either solve the word (or phrase) or all six body parts are on the gallows");
	}
	public static void playGame()
	{
		System.out.println("You started playing the Game............!");
		
	}
	public static void exitgame()
	{
		System.exit(0);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1.Start the Game");
		System.out.println("2.View the Game instructions");
		System.out.println("3.Exit the Game");
		//Declaring Scanner variable accept the inpu from user 
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:PlayGame();
				main(null);//Calling the main method to choose the option
		
		case 2:display();//Calling Display method for instructions
		       main(null);
			
		case 3:	exitgame();
				break;
		default :System.out.println("wrong choice");		
}

	}

}
