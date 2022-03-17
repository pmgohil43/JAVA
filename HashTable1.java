// Hash Table
import java.util.Hashtable;
import java.util.Map;

public class HashTable1
{
	public static void main(String[] args)
	{
		Hashtable<Object, Object> veg = new Hashtable<>();
		
		System.out.println(veg.put(1,"a"));
		System.out.println(veg.put("b",2));
		System.out.println(veg.put(3,"c"));
		System.out.println(veg.put(4,"D"));
		System.out.println(veg.put(3,""));
	
	}
}