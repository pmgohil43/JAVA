// Hash Map
import java.util.HashMap;
import java.util.Map;

public class HashMap1
{
	public static void main(String[] args)
	{
		HashMap<Integer, String> map = new HashMap<>();
		//put values
		map.put(1,"a");
		map.put(2,"b");
		map.put(4,"c");
		map.put(1,"e");
		
		for(Map.Entry m : map.entrySet())
		{
			System.out.println(m.getValue());
		}
		
		//put absent
		map.putIfAbsent(3,"w");
		for(Map.Entry m : map.entrySet())
		{
			System.out.println(m.getValue());
		}
		
		//remove
		map.remove(1,"e");
		for(Map.Entry m : map.entrySet())
		{
			System.out.println(m.getValue());
		}
		System.out.println(map.size());
		
		// Contains
		if(map.containsKey(1))
		{
			// replace
			map.replace(4,"prakash");
			for(Map.Entry m : map.entrySet())
			{
				System.out.println(m.getValue());
			}
			System.out.println(map.size());
		}
		else
		{
			System.out.println("Nothing to replace...");
		}
	}
}