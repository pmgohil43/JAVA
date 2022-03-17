// Date Cunstructor
import java.util.Calendar;
import java.util.Date;

public class dateConstructor
{
	public static void main(String[] args)
	{
		
		Date d1 = new Date();
		System.out.println("Current date : "+d1);
		
		Date d2 = new Date(2323232322322222222L);
		System.out.println("Represented date : "+d2);
		
	}
}