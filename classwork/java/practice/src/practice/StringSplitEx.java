package practice;

public class StringSplitEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String message="Bangalore/Mangalore/Delhi/Calcutta";
		String message="AAA/bba/ccc/DDD/";
		String[] cities=message.split("/");
		StringBuffer sb=new StringBuffer();
		for(String str : cities)
		{
			StringBuffer sb1=new StringBuffer();
			sb1.append(str);
			sb1.reverse();
			System.out.println(sb1.toString().toLowerCase());
			/*sb.append(sb1);
			sb.append(" ");*/
		}
		//System.out.println(sb);
		
		
		
	}

}
