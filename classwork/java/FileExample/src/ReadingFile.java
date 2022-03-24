import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFile {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		try {
			File file=new File("log.txt");
			FileReader reader=new FileReader(file); 
			
			BufferedReader read=new BufferedReader(reader);
			StringBuffer buff=new StringBuffer();
			String str;
			while((str=read.readLine())!=null)
			{
				buff.append(str);
				buff.append("\n");
			}
			reader.close();
			System.out.println("content of file");
			
			System.out.println(buff.toString());
			reader.close();
			
		}catch(FileNotFoundException ex)
		{
			System.out.println("File not found");
			ex.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		
	}

}
