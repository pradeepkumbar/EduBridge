//ckage com.exceptiondemo.pack;

import java.io.FileWriter;
import java.io.IOException;

public class EXampl2 {

	public static void main(String[] args) {
	//DO Auto-generated method stub
		FileWriter writer=null;
		try {
			writer=new FileWriter("hello.txt");
		
			 for(char ch='a'; ch<='z';ch++)
			 {
				 System.out.println(ch);
				 writer.write(ch);
				
			 }
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}finally
		{
			 try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
