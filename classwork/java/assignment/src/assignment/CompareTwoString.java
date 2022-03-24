//comparing the two strings lexicographically
package assignment;

public class CompareTwoString {

	public static void main(String[] args) {
		String string1="Hello World";
		String string2="hello world";
		String string3="Hello World";
		int result=string1.compareTo(string2);
		if(result<0)
		{
			System.out.println("String 1 is less than string 2 ");
		}
		else if(result==0)
		{
			System.out.println("String 1 and String 2 are Equal");
		}
		else
		{
			System.out.println("String 1 is Greater than String 2");
		}
		
		int result1=string1.compareTo(string3);
		if(result1<0)
		{
			System.out.println("String 1 is less than string 2 ");
		}
		else if(result1==0)
		{
			System.out.println("String 1 and String 2 are Equal");
		}
		else
		{
			System.out.println("String 1 is Greater than String 2");
		}
		
	}

}
