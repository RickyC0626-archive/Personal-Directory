public class DateOfBirth
{
  private String month = "";
  private int day;
  private int year;

  public String testMonth(String month)
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
       default: System.out.println("That is not a valid month. Try again.");
                return null;
                break;
     }
     return month;
  }

  public int testDay(int day)
  {

  }

   public int testYear(int year)
   {
      int currentYear = Date.getCurrentDate();
   }
}
