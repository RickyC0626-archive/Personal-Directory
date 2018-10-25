/*  The DateOfBirth Class

    Description: Converts the date of birth inputted by the
    user as numbers to their String equivalent.
    + Tests if the month is valid
    + Tests if the day is valid for each month
    + Tests if it is a leap year
*/

import java.util.Scanner;

public class DateOfBirth
{
    private String month = "";
    private int day;
    private int year;

  public String getMonth()
  {
    return month;
  }

  public int getDay()
  {
      return day;
  }

  public int getYear()
  {
      return year;
  }

  public void setMonth(String month)
  {
      this.month = month;
	  testMonth();
  }

  public void testMonth()
  {
     switch(month)
     {
       case "1": month = "January"; break;
       case "2": month = "February"; break;
       case "3": month = "March"; break;
       case "4": month = "April"; break;
       case "5": month = "May"; break;
       case "6": month = "June"; break;
       case "7": month = "July"; break;
       case "8": month = "August"; break;
       case "9": month = "September"; break;
       case "10": month = "October"; break;
       case "11": month = "November"; break;
       case "12": month = "December"; break;
       default: System.out.println("That is not a valid month. Try again.\n");
                break;
     }
  }

  public int testDay()
  {
      return day;
  }

   public int testYear()
   {
       return year;
   }
}
