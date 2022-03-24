package practice;

public class StringBufferEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			StringBuffer buffer=new StringBuffer("Hello Hi How are you");
			StringBuffer buffer1=new StringBuffer("end of line");
			String message="end of line";
			int len=buffer.length();
			buffer.append('?');
			buffer.insert(5, '!');
			buffer.insert(9, ',');
			buffer.insert(14, 78.8f);
			buffer.replace(10, 26, message);
			System.out.println(buffer);
			
	}

}
