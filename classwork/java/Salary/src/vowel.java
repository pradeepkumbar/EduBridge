import java.util.Scanner;

public class vowel {
public static void main(String[] args) {

	Scanner scan=new Scanner(System.in);
	char x=scan.next().charAt(0);
	if(x=='a'|| x=='A')
	System.out.println("vowel");
else if(x=='e'|| x=='E')
	System.out.println("vowel");
else if(x=='i'|| x=='I')
	System.out.println("vowel");
else if(x=='o'|| x=='O')
	System.out.println("vowel");
else if(x=='u'|| x=='U')
	System.out.println("vowel");
else
	System.out.println("consonent");
	
}
	
}
