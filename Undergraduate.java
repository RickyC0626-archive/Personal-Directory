/* The Undergraduate Class

   Description: Contains information about an undergraduate
   in the college's directory

   Authors: Ricky Chon, Nick Climaco, ZeJun Ren
*/

import java.util.Scanner;

public class Undergraduate extends Student
{
	private Scanner sc = new Scanner(System.in);
	private TextFormat format = new TextFormat();

    private double minCreditAmountToGraduate = 120;
    private String major1 = "N/A";
    private String major2 = "N/A";
	private String minor1 = "N/A";
    private String minor2 = "N/A";
    private String concentration = "N/A";

	public Undergraduate() throws InterruptedException
	{
		displayProfile();
		undergraduateMenu();
	}

	public String getMajor1()
	{
		return major1;
	}

	public String getMajor2()
	{
		return major2;
	}

	public String getMinor1()
	{
		return minor1;
	}

	public String getMinor2()
	{
		return minor2;
	}

	public String getConcentration()
	{
		return concentration;
	}

	public void setMajor1(String major1)
	{
		this.major1 = major1;
	}

	public void setMajor2(String major2)
	{
		this.major2 = major2;
	}

	public void setMinor1(String minor1)
	{
		this.minor1 = minor1;
	}

	public void setMinor2(String minor2)
	{
		this.minor2 = minor2;
	}

	public boolean isDoubleMajor()
	{
		return (!(major1.equals("")) && !(major2.equals("")));
	}

	public boolean isDoubleMinor()
	{
		return (!(minor1.equals("")) && !(minor2.equals("")));
	}

	public void displayProfile() throws InterruptedException
	{
		format.clearScreen();
		Thread.sleep(200);
		System.out.println("PROFILE\n======================================================\n");
		Thread.sleep(200);
		System.out.println("Email: " + getEmail());
		Thread.sleep(200);
		System.out.println("First Name: " + getFirstName());
		Thread.sleep(200);
		System.out.println("Last Name: " + getLastName());
		Thread.sleep(200);
		System.out.println("Age: " + getAge());
		Thread.sleep(200);
		System.out.println("Birthday: " + getBirthday());
		Thread.sleep(200);
		System.out.println("StudentID: " + getStudentID());
		Thread.sleep(200);
		System.out.println("Student Email: " + getStudentEmail());
		Thread.sleep(200);
		System.out.println("\n======================================================\n");
		Thread.sleep(1000);

	}

	public void undergraduateMenu() throws InterruptedException
	{
		String selection;

		try
		{
			sc.reset();
			System.out.println("What would you like to do?");
			Thread.sleep(200);
			System.out.println("[1] Edit Profile");
			Thread.sleep(200);
			System.out.println("[2] Find Users via First Name");
			Thread.sleep(200);
			System.out.println("[3] Find Users via Last Name");
			Thread.sleep(200);
			System.out.println("[4] Find Users via Member Type (Undergraduate, Graduate, Advisor");
			Thread.sleep(200);
			System.out.println("[5] Find Users via Advisor Name");
			Thread.sleep(200);
			System.out.println("[6] Quit the Application");
			Thread.sleep(200);
			System.out.print("Enter your selection: ");
			selection = sc.next();

			switch(selection)
			{
				case "1": format.loading(); editProfile(); break;
				case "2": format.loading(); searchFirstName(); break;
				case "3": format.loading(); searchLastName(); break;
				case "4": format.loading(); searchMemberType(); break;
				case "5": format.loading(); searchAdvisorName(); break;
				case "6": format.loading(); quit(); break;
				default: throw new Exception();
			}
		}
		catch(Exception e)
		{
			format.wrongSelection();
			undergraduateMenu();
		}
	}

	public void editProfile()
	{

	}

	public void searchFirstName()
	{

	}

	public void searchLastName()
	{

	}

	public void searchMemberType()
	{

	}

	public void searchAdvisorName()
	{

	}

	public void quit()
	{

	}
}
