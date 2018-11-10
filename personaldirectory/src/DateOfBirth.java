/*  The DateOfBirth Class

    Description: Converts the date of birth inputted by the
    user as numbers to their String equivalent.
    + Tests if the month is valid
    + Tests if the day is valid for each month
    + Tests if the year is valid for age

	The class is designed to receive input for year first,
	followed by month and day. This is to ensure that
	the date of birth is not ahead of the current date

	Authors: Ricky Chon
*/

import java.lang.Integer;
import java.lang.NumberFormatException;
import java.util.Calendar;
import java.util.Scanner;

public class DateOfBirth
{
	private Scanner sc = new Scanner(System.in);
	private TextFormat format = new TextFormat();

	private final String[] MONTH_WITH_31_DAYS = {"January", "March", "May", "July", "August", "October", "December"};
	private final String[] MONTH_WITH_30_DAYS = {"April", "June", "September", "November"};
	private final String MONTH_WITH_28_DAYS = "February";

    private String month;
    private String day;
    private String year;

	public String getMonthWith28Days()
	{
		return MONTH_WITH_28_DAYS;
	}

	public String getMonthWith30Days(int i)
	{
		return MONTH_WITH_30_DAYS[i];
	}

	public String getMonthWith31Days(int i)
	{
		return MONTH_WITH_31_DAYS[i];
	}

  	public String getMonth()
  	{
    	return month;
  	}

  	public String getDay()
  	{
      	return day;
  	}

  	public String getYear()
  	{
      	return year;
  	}

	public void setMonth(String month)
	{
		this.month = month;
	}

	public void setDay(String day)
	{
		this.day = day;
	}

	public void setYear(String year)
	{
		this.year = year;
	}

  	public void testMonth(String month) throws InterruptedException
  	{
		try
		{
			if(!(isNumeric(month))) throw new NumberFormatException();
			else
			{
				if(isCurrentYear(getYear()))
				{
					if(!(isCurrentMonthOrLess(month))) throw new MonthOutOfBoundsException();
					if(!(isValidMonth(month))) throw new MonthOutOfBoundsException();
				}
				else
				{
					if(!(isValidMonth(month))) throw new MonthOutOfBoundsException();
				}
			}
			monthNumToString(month);
		}
		catch(NumberFormatException e)
		{
			System.out.println(format.toRedText("\nYou must enter a valid month in the form of a number.\n"));
			Thread.sleep(500);
			monthMenu();
		}
		catch(MonthOutOfBoundsException e)
		{
			System.out.println(format.toRedText("\nYou must enter a valid month.\n"));
			Thread.sleep(500);
			monthMenu();
		}
  	}

	public void testDay(String day) throws InterruptedException
	{
		try
		{
			if(!(isNumeric(day))) throw new NumberFormatException();

			if(isCurrentYear(getYear()))
			{
				if(isCurrentMonth(monthStringToNum(getMonth())))
				{
					for(String month : MONTH_WITH_31_DAYS)
					{
						if(getMonth().equals(month))
						{
							if(!(isBetween31Days(day))) throw new DayOutOfBoundsException();
							else if(!(isCurrentDayOrLess(day))) throw new DayOutOfBoundsException();
						}
					}

		 			for(String month : MONTH_WITH_30_DAYS)
					{
						if(getMonth().equals(month))
						{
							if(!(isBetween30Days(day))) throw new DayOutOfBoundsException();
							else if(!(isCurrentDayOrLess(day))) throw new DayOutOfBoundsException();
						}
					}

					if(getMonth().equals(MONTH_WITH_28_DAYS))
					{
						if(!(isBetween28Days(day))) throw new DayOutOfBoundsException();
						else if(!(isCurrentDayOrLess(day))) throw new DayOutOfBoundsException();
					}
				}
				else
				{
					for(String month : MONTH_WITH_31_DAYS)
					{
						if(getMonth().equals(month))
						{
							if(!(isBetween31Days(day))) throw new DayOutOfBoundsException();
						}
					}

					for(String month : MONTH_WITH_30_DAYS)
					{
						if(getMonth().equals(month))
						{
							if(!(isBetween30Days(day))) throw new DayOutOfBoundsException();
						}
					}

					if(getMonth().equals(MONTH_WITH_28_DAYS))
					{
						if(!(isBetween28Days(day))) throw new DayOutOfBoundsException();
					}
				}
			}
			else
			{
				for(String month : MONTH_WITH_31_DAYS)
				{
					if(getMonth().equals(month))
					{
						if(!(isBetween31Days(day))) throw new DayOutOfBoundsException();
					}
				}

				for(String month : MONTH_WITH_30_DAYS)
				{
					if(getMonth().equals(month))
					{
						if(!(isBetween30Days(day))) throw new DayOutOfBoundsException();
					}
				}

				if(getMonth().equals(MONTH_WITH_28_DAYS))
				{
					if(!(isBetween28Days(day))) throw new DayOutOfBoundsException();
				}
			}
			setDay(day);
		}
		catch(NumberFormatException e)
		{
			System.out.println(format.toRedText("\nYou must enter a valid day in the form of a number.\n"));
			Thread.sleep(500);
			dayMenu();
		}
		catch(DayOutOfBoundsException e)
		{
			System.out.println(format.toRedText("\nYou must enter a valid day.\n"));
			Thread.sleep(500);
			dayMenu();
		}
	}

	public void testYear(String year) throws InterruptedException
	{
		try
		{
			if(!(isNumeric(year))) throw new NumberFormatException();
			else
			{
				if(tooOld(year)) throw new OldAgeException();
				else if(negativeAge(year)) throw new NegativeAgeException();
			}
			setYear(year);
		}
		catch(NumberFormatException e)
		{
			System.out.println(format.toRedText("\nYou must enter a valid year in the form of a number.\n"));
			Thread.sleep(500);
			yearMenu();
		}
		catch(OldAgeException e)
		{
			System.out.println(format.toRedText("\nLet's face it, you're really not that old.\n"));
			Thread.sleep(500);
			yearMenu();
		}
		catch(NegativeAgeException e)
		{
			System.out.println(format.toRedText("\nAre you a time traveler? You haven't even been born yet.\n"));
			Thread.sleep(500);
			yearMenu();
		}
	}

	public void monthMenu() throws InterruptedException
	{
		sc.reset();
		System.out.println("\n(1) January\n(2) February\n(3) March\n(4) April\n(5) May\n(6) June");
		System.out.println("(7) July\n(8) August\n(9) September\n(10) October\n(11) November\n(12) December");
		System.out.print("Enter the number of the month of your birth: ");
		testMonth(sc.next());
	}

	public void dayMenu() throws InterruptedException
	{
		sc.reset();
		System.out.println("\n(1-31) January\n(1-28) February\n(1-31) March\n(1-30) April");
		System.out.println("(1-31) May\n(1-30) June\n(1-31) July\n(1-31) August\n(1-30) September");
		System.out.println("(1-31) October\n(1-30) November\n(1-31) December");
		System.out.print("Enter the day of your birth: ");
		testDay(sc.next());
	}

	public void yearMenu() throws InterruptedException
	{
		sc.reset();
		System.out.print("Enter the year of your birth: ");
		testYear(sc.next());
	}

	public void monthNumToString(String month)
	{
		switch(month)
		{
			case "1": setMonth(getMonthWith31Days(0)); break;
			case "2": setMonth(getMonthWith28Days()); break;
			case "3": setMonth(getMonthWith31Days(1)); break;
			case "4": setMonth(getMonthWith30Days(0)); break;
			case "5": setMonth(getMonthWith31Days(2)); break;
			case "6": setMonth(getMonthWith30Days(1)); break;
			case "7": setMonth(getMonthWith31Days(3)); break;
			case "8": setMonth(getMonthWith31Days(4)); break;
			case "9": setMonth(getMonthWith30Days(2)); break;
			case "10": setMonth(getMonthWith31Days(5)); break;
			case "11": setMonth(getMonthWith30Days(3)); break;
			case "12": setMonth(getMonthWith31Days(6)); break;
			default: setMonth(null); break;
		}
	}

	public String monthStringToNum(String month)
	{
		switch(month)
		{
			case "January": return "1";
			case "February": return "2";
			case "March": return "3";
			case "April": return "4";
			case "May": return "5";
			case "June": return "6";
			case "July": return "7";
			case "August": return "8";
			case "September": return "9";
			case "October": return "10";
			case "November": return "11";
			case "December": return "12";
			default: return null;
		}
	}

	public boolean isNumeric(String s)
	{
		try
		{
			int i = Integer.parseInt(s);
		}
		catch(NumberFormatException e)
		{
			return false;
		}
		return true;
	}

	public boolean tooOld(String year)
	{
		return (Calendar.getInstance().get(Calendar.YEAR) - Integer.parseInt(year) > 122);
	}

	public boolean negativeAge(String year)
	{
		return (Calendar.getInstance().get(Calendar.YEAR) - Integer.parseInt(year) < 0);
	}

	public boolean isCurrentYear(String year)
	{
		return Integer.parseInt(year) == (Calendar.getInstance().get(Calendar.YEAR));
	}

	public boolean isCurrentMonthOrLess(String month)
	{
		return Integer.parseInt(month) <= ((Calendar.getInstance().get(Calendar.MONTH)) + 1);
	}

	public boolean isCurrentMonth(String month)
	{
		return Integer.parseInt(month) == ((Calendar.getInstance().get(Calendar.MONTH)) + 1);
	}

	public boolean isValidMonth(String month)
	{
		return (Integer.parseInt(month) >= 1 && Integer.parseInt(month) <= 12);
	}

	public boolean isCurrentDayOrLess(String day)
	{
		return Integer.parseInt(day) <= ((Calendar.getInstance().get(Calendar.DATE)));
	}

	public boolean isBetween31Days(String day)
	{
		return (Integer.parseInt(day) >= 1 && Integer.parseInt(day) <= 31);
	}

	public boolean isBetween30Days(String day)
	{
		return (Integer.parseInt(day) >= 1 && Integer.parseInt(day) <= 30);
	}

	public boolean isBetween28Days(String day)
	{
		return (Integer.parseInt(day) >= 1 && Integer.parseInt(day) <= 28);
	}
}
