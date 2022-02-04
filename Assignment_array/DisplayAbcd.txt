//program to print alphabet in char array.
public class DisplayAbcd {

	public static void main(String[] args) {
		//creating char array 
		char[] ch=new char[26];
		for(int i=0;i<ch.length;i++)
		{
			//assigning ascii value to char array
			ch[i]=(char)('a'+i);
		}
		//printing characters using for each loop 
		for(char chr: ch)
		{
			System.out.print(chr+" ");
		}

	}

}
