import java.time.*;
import java.util.*;
import java.text.*;
class Date{
	private static int day;
	private static int month;
	private static int year;


	public Date (int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public static boolean isValid(){
		if( day < 1 || month <1 || month > 12)
			return false;
		return true;
	}
	public static void getDayOfWeek(){
		String str;
		if (day<10 && month<10)
			str = String.valueOf(year)+"-0"+ String.valueOf(month)+"-0"+String.valueOf(day);
		else if (day<10)
			str = String.valueOf(year)+"-"+ String.valueOf(month)+"-0"+String.valueOf(day);
		else if (month<10)
			str = String.valueOf(year)+"-0"+ String.valueOf(month)+"-"+String.valueOf(day);
		else
			str = String.valueOf(year)+"-0"+ String.valueOf(month)+"-0"+String.valueOf(day);
		
		LocalDate dt = LocalDate.parse(str);   
        System.out.println("Day of Week = "+dt.getDayOfWeek());  
	}

	public static boolean isLeapYear(){
		if( (year%4 == 0 && year%100 !=0 ) || year%400 == 0)
			return true;
		return false;
	}

	public Date getNextDay() {
        int nextDay = day + 1;
        int nextMonth = month;
        int nextYear = year;

        if (nextDay > getDaysInMonth(nextMonth, nextYear)) {
            nextDay = 1;
            nextMonth++;
            if (nextMonth > 12) {
                nextMonth = 1;
                nextYear++;
            }
        }

        return new Date(nextDay, nextMonth, nextYear);
    }

     private int getDaysInMonth(int month, int year) {
        int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (month == 2 && isLeapYear()) {
            return 29;
        }
        return daysInMonth[month - 1];
    }

    public Date getPreviousDay() {
        int prevDay = day - 1;
        int prevMonth = month;
        int prevYear = year;

        if (prevDay < 1) {
            prevMonth--;
            if (prevMonth < 1) {
                prevMonth = 12;
                prevYear--;
            }
            prevDay = getDaysInMonth(prevMonth, prevYear);
        }

        return new Date(prevDay, prevMonth, prevYear);
    }
    public static void getDate(){
    	System.out.println(day+"/"+month+"/"+year);
    }


}

class UsingDate{

	public static void main(String[] args) {
		Date date = new Date (22,03,2024);
		System.out.print("Your Date = ");
		date.getDate();
		System.out.println("Your Date isValid = "+date.isValid());
		date.getDayOfWeek();
		System.out.println("Leap Year = "+date.isLeapYear());
		System.out.print("Next Day = ");
		Date nextDay = date.getNextDay();
		nextDay.getDate();
		Date previousDay = date.getPreviousDay();
		System.out.print("Previous Day = ");
		previousDay.getDate(); 

		
	}
}