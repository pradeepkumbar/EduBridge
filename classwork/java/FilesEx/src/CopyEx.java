//package com.exceptiondemo.pack;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//InputStream --abstract baseclass for byte input stream

public class CopyEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			FileOutputStream output=new FileOutputStream("sample.txt");
			byte[] bytear=new byte[26];
			
			for(int i=0;i<=25;i++)
				bytear[i]=(byte)('a'+i);
			output.write(bytear);//write with byte array 
			output.write(bytear,5, bytear.length-5);
			
			
			output.close();
			FileOutputStream input=new FileOutputStream("Text.txt");
			do {
				
			}
			
	}

	

}
