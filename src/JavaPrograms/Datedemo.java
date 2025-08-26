package JavaPrograms;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Datedemo {

	public static void main(String[] args) {
		
		Date d=new Date();
		SimpleDateFormat ad= new SimpleDateFormat("MM/DD/YYYY");
		System.out.println(ad.format(d));
		System.out.println(d.toString());
		System.out.println(d.getDate());
		Calendar cal= Calendar.getInstance();
		System.out.println(ad.format(cal.getTime()));
	System.out.println(ad.format(cal.getWeekYear()));
	System.out.println(cal.get(Calendar.AM_PM));
	System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
	}

}
