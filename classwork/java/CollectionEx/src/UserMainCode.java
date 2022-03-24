import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UserMainCode {

	static HashMap<String,String> calculateGrade(HashMap<String,Float> student)
	{
		HashMap<String,String> map=new HashMap<String,String>();
		Set<Map.Entry<String,Float>> set=student.entrySet();
		for(Map.Entry<String,Float> st: set)
		{
			if(st.getValue()>=60)
			{
				map.put(st.getKey(),"PASS");
				
			}
			else
				map.put(st.getKey(), "FAIL");
		}
		return  map;
	}
}
