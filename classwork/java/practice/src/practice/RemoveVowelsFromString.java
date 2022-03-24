package practice;

public class RemoveVowelsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="edubridge";//123456789  // 2468  dbig 01233
		//System.out.println(0%2);
		System.out.println(removeEvenElements(s1));
	}

public static String removeEvenElements(String s1) //capacity
{
StringBuffer sb1=new StringBuffer();//empty

for(int i=0;i<s1.length();i++)//0<8 1<8 2<8 3<8 4<8 5 6 7
if((i%2)==0)//0%2==0  1%2==0 2%2 ==0 3%2==0
sb1.append(s1.charAt(i));//0  sb1=cpcty
else if((i%2)!=0)//1%2 ! =0  
if(s1.charAt(i)!='a' && s1.charAt(i)!='e' &&
s1.charAt(i)!='i' && s1.charAt(i)!='o' && s1.charAt(i)!='u')
if(s1.charAt(i)!='A' && s1.charAt(i)!='E' &&
s1.charAt(i)!='I' && s1.charAt(i)!='O' && s1.charAt(i)!='U')
sb1.append(s1.charAt(i));
return sb1.toString();
}
}

