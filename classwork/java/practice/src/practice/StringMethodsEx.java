package practice;

public class StringMethodsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String message="hello welcome to java program";
		int length=message.length();
		System.out.println(length);
		
		char ch=message.charAt(10);
		System.out.println(ch);
		char[] dst=new char[message.length()];
		message.getChars(6, 14, dst, 0);
		for(char ch1 : dst)
		{
			System.out.print(ch1);
		}
		
		System.out.println(String.valueOf(dst));
		
		String message2="hello";//abcdefgh 97 98 99 100 101 102 103 104 66-104
		if(message.equals(message2))
		{
			System.out.println("same");
		}else
			
			System.out.println("not same");
		
		String msg="Bye";
		
		int result=msg.compareTo(message2);
		System.out.println(result);
		
		System.out.println(message.startsWith("hello"));
		
		System.out.println(message.endsWith("hello"));
		System.out.println(msg.indexOf('y'));
		System.out.println(message2.lastIndexOf('l'));
		System.out.println(message.substring(5));
		System.out.println(message.substring(6, 21));
		
		String fname="Edubridge";
		String lname="trainer";
		String fullname=fname.concat(lname);
		System.out.println(fullname);
		
		String test="    massage";
		System.out.println(test.replace('a', 'e').toUpperCase());
		
		
		
		System.out.println(test.trim());
		
		String m="edubridge";
		char[] charArray=m.toCharArray();
		
		int vcount=0, ccount=0;
		for(char c : charArray)
		{
			if(c=='a' || c=='e'||c=='i'||c=='o'||c=='u') {
				vcount++;
			}else
				ccount++;
		}
		System.out.println("vowels"+vcount+"   consonents"+ccount);
		
		
		
		boolean flag=true;
		String bstring=String.valueOf(flag);
		
		System.out.println(bstring);
		
		
		if(message.equalsIgnoreCase("Hello Welcome to java Program"))
		{
			System.out.println(true);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
