// Gregorian Calendar

import java.util.Calendar;
import java.util.GregorianCalendar;

public class gregorianCalendar
{
	public static void main(String[] args)
	{
		GregorianCalendar gc = new GregorianCalendar();
		
		System.out.println(gc.isLeapYear(2022)+" Is Leap Year..");
		System.out.println("Day : " +gc.get(Calendar.DATE));
		System.out.println("Month : " +gc.get(Calendar.MONTH));//its index value is 0 so it's return month-1
		System.out.println("Year : " +gc.get(Calendar.YEAR));
		System.out.println("Hour : " +gc.get(Calendar.HOUR));
		System.out.println("Minute : " +gc.get(Calendar.MINUTE));
		System.out.println("Second : " +gc.get(Calendar.SECOND));
		System.out.println("Calendar Type : " +gc.getCalendarType());
		System.out.println("Current Week Year : " +gc.getWeekYear());
	}
}