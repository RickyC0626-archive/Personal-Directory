/*  The DateOfBirth Class

    Description: Converts the date of birth inputted by the
    user as numbers to their String equivalent.
    + Tests if the month is valid
    + Tests if the day is valid for each month
    + Tests if the year is valid for age

	The class is designed to receive input for year first,
	followed by month and day. This is to ensure that
	the date of birth is not ahead of the current date
*/

import java.lang.Integer;
import java.lang.NumberFormatException;
import java.util.Calendar;
import java.util.Scanner;

public class DateOfBirth
{
	private Scanner sc = new Scanner(System.in);

	private String[] monthWith31Days = {"January", "March", "May", "July", "August", "October", "December"};
	private String[] monthWith30Days = {"April", "June", "September", "November"};
	private String monthWith28Days = "February";

    private String month = "";
    private String day;
    private String year;

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

  	public void setMonth()
  	{
		try
		{
			monthMenu();

			if(isCurrentYear(year))
			{
				switch(month)
				{
					case "1":
					if(isCurrentMonthOrLess(month))
					{
						month = monthWith31Days[0];
						break;
					}
					else throw new MonthOutOfBoundsException();

					case "2":
					if(isCurrentMonthOrLess(month))
					{
						month = monthWith28Days;
						break;
					}
					else throw new MonthOutOfBoundsException();

					case "3":
					if(isCurrentMonthOrLess(month))
					{
						month = monthWith31Days[1];
						break;
					}
					else throw new MonthOutOfBoundsException();

					case "4":
					if(isCurrentMonthOrLess(month))
					{
						month = monthWith30Days[0];
						break;
					}
					else throw new MonthOutOfBoundsException();

					case "5":
					if(isCurrentMonthOrLess(month))
					{
						month = monthWith31Days[2];
						break;
					}
					else throw new MonthOutOfBoundsException();

					case "6":
					if(isCurrentMonthOrLess(month))
					{
						month = monthWith30Days[1];
						break;
					}
					else throw new MonthOutOfBoundsException();

					case "7":
					if(isCurrentMonthOrLess(month))
					{
						month = monthWith31Days[3];
						break;
					}
					else throw new MonthOutOfBoundsException();

					case "8":
					if(isCurrentMonthOrLess(month))
					{
						month = monthWith31Days[4];
						break;
					}
					else throw new MonthOutOfBoundsException();

					case "9":
					if(isCurrentMonthOrLess(month))
					{
						month = monthWith30Days[2];
						break;
					}
					else throw new MonthOutOfBoundsException();

					case "10":
					if(isCurrentMonthOrLess(month))
					{
						month = monthWith31Days[5];
						break;
					}
					else throw new MonthOutOfBoundsException();

					case "11":
					if(isCurrentMonthOrLess(month))
					{
						month = monthWith30Days[3];
						break;
					}
					else throw new MonthOutOfBoundsException();

					case "12":
					if(isCurrentMonthOrLess(month))
					{
						month = monthWith31Days[6];
						break;
					}
					else throw new MonthOutOfBoundsException();
				}
			}
			else
			{
				switch(month)
	     		{
					case "1": month = monthWith31Days[0]; break;
	       			case "2": month = monthWith28Days; break;
	       			case "3": month = monthWith31Days[1]; break;
	       			case "4": month = monthWith30Days[0]; break;
	      			case "5": month = monthWith31Days[2]; break;
	      			case "6": month = monthWith30Days[1]; break;
	       			case "7": month = monthWith31Days[3]; break;
	       			case "8": month = monthWith31Days[4]; break;
					case "9": month = monthWith30Days[2]; break;
	 				case "10": month = monthWith31Days[5]; break;
	       			case "11": month = monthWith30Days[3]; break;
	       			case "12": month = monthWith31Days[6]; break;
		       		default: throw new IllegalInputException();
				 }
			}
		}
		catch(IllegalInputException e)
		{
			System.out.println("\nYou must enter a valid number listed above.\n");
			setMonth();
		}
		catch(MonthOutOfBoundsException e)
		{
			System.out.println("\nYou must enter a value that is less than or equal to the current month.\n");
			setMonth();
		}
  	}

	public boolean isCurrentMonthOrLess(String month)
	{
		return Integer.parseInt(month) <= ((Calendar.getInstance().get(Calendar.MONTH)) + 1);
	}

	public boolean isCurrentYear(String year)
	{
		return Integer.parseInt(year) == (Calendar.getInstance().get(Calendar.YEAR));
	}

	public void setDay()
	{
		try
		{
			dayMenu();

			for(String month : monthWith31Days)
			{
				if(this.month.equals(month)) if(!(Integer.parseInt(day) >= 1 && Integer.parseInt(day) <= 31)) throw new IllegalInputException();
			}

			for(String month : monthWith30Days)
			{
				if(this.month.equals(month)) if(!(Integer.parseInt(day) >= 1 && Integer.parseInt(day) <= 30)) throw new IllegalInputException();
			}

			if(this.month.equals(monthWith28Days)) if(!(Integer.parseInt(day) >= 1 && Integer.parseInt(day) <= 28)) throw new IllegalInputException();
		}
		catch(IllegalInputException e)
		{
			System.out.println("\nYou must enter a valid day.\n");
			setDay();
		}
		catch(NumberFormatException e)
		{
			System.out.println("\nYou must enter a valid day in the form of a number.\n");
			setDay();
		}
	}

	public void setYear()
	{
		try
		{
			yearMenu();

			if(Calendar.getInstance().get(Calendar.YEAR) - Integer.parseInt(year) > 122) throw new OldAgeException();
			else if(Calendar.getInstance().get(Calendar.YEAR) - Integer.parseInt(year) < 0) throw new NegativeAgeException();
		}
		catch(NumberFormatException e)
		{
			System.out.println("\nYou must enter a valid year in the form of a number.\n");
			setYear();
		}
		catch(OldAgeException e)
		{
			System.out.println("\nLet's face it, you're really not that old.\n");
			setYear();
		}
		catch(NegativeAgeException e)
		{
			System.out.println("\nYou have not been born yet.\n");
			setYear();
		}
	}

	public void monthMenu()
	{
		System.out.println("\n(1) January\n(2) February\n(3) March\n(4) April\n(5) May\n(6) June");
		System.out.println("(7) July\n(8) August\n(9) September\n(10) October\n(11) November\n(12) December");
		System.out.print("Enter the number of the month of your birth: ");
		month = sc.next();
	}

	public void dayMenu()
	{
		System.out.println("\n(1-31) January\n(1-28) February\n(1-31) March\n(1-30) April");
		System.out.println("(1-31) May\n(1-30) June\n(1-31) July\n(1-31) August\n(1-30) September");
		System.out.println("(1-31) October\n(1-30) November\n(1-31) December");
		System.out.print("Enter the day of your birth: ");
		day = sc.next();
	}

	public void yearMenu()
	{
		System.out.print("Enter the year of your birth: ");
		year = sc.next();
	}
}
