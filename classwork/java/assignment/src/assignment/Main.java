package assignment;
import java.util.*;
import java.io.FileNotFoundException;
//import necessary packages
import java.io.File;
//   @SuppressWarnings("unchecked")//Do not delete this line
public class Main
{
    public static void abcd(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Name");
        String name=in.next();
        System.out.println("Enter Phone Number");
        long phone=in.nextLong();
        System.out.println("Enter Email");
        String id= in.next();
        FileManager f= new FileManager();
        File x =f.createFile();
        f.writeFile(x,name+","+phone+","+id);
        System.out.println("Do you want to enter another record(yes/no)");
        String choice=in.next();
        if(choice.equals("yes")){
            abcd();
        }
        if(choice.equals("no"))
       {String []q=f.readFile(x);
       String pl[]=q[0].split(";");
System.out.println("name,"+"phoneNo,"+"EmailId;");
        for(int i=0;i<pl.length;i++)
        {
            System.out.println(pl[i]+"		");
               }

                System.exit(0);
        }

    }

    public static void main(String[] args) 
    {
        //Main asd=new Main();
        Main.abcd();



    }

}
