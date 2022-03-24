import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UserMain {
	
	static double calculateAverage(HashMap<Integer,Double> hashmap,int hashmapsize)
	{
		Set<Map.Entry<Integer,Double>> s = hashmap.entrySet();
		double sum=0.0,avg=0.0;
		int count=0;
		for(Map.Entry<Integer, Double>  mpl : s)
		{
			int key=mpl.getKey();
			if(key%2!=0)
			{
				sum=sum+mpl.getValue();
				count++;
			}
		}
		avg=sum/count;
		DecimalFormat df = new DecimalFormat(".##");
		String b1 = df.format(avg);
		double b = Double.parseDouble(b1);
		
		return b;
		
	}

}
