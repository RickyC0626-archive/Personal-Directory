/* The Undergraduate Class

   Description: Contains information about an undergraduate
   in the college's directory

   Authors: Ricky Chon, Nick Climaco
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

	public Undergraduate() throws InterruptedException, Exception
	{
		setAcademicStatus("Undergraduate");
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

	public void setConcentration(String concentration)
	{
		this.concentration = concentration;
	}

	public void displayProfile() throws InterruptedException
	{
		format.clearScreen();
		System.out.println("PROFILE\n======================================================\n");
		System.out.println("Username: " + Account.getUsername());
		System.out.println("Email: " + getEmail());
		System.out.println("Phone Number: " + getPhoneNumber() + "\n");
		System.out.println("Full Name: " + getFullName());
		System.out.println("Birthday: " + getBirthday() + "\n");
		System.out.println("Academic Status: " + getAcademicStatus());
		System.out.println("First Major: " + getMajor1());
		System.out.println("Second Major: " + getMajor2());
		System.out.println("First Minor: " + getMinor1());
		System.out.println("Second Minor: " + getMinor2());
		System.out.println("Concentration: " + getConcentration() + "\n");
		System.out.println("StudentID: " + getStudentID());
		System.out.println("Student Email: " + getStudentEmail() + "\n");
		System.out.println("Advisor: " + getAdvisor());
		System.out.println("\n======================================================\n");
	}

	public void undergraduateMenu() throws InterruptedException
	{
		String selection;

		try
		{
			sc.reset();
			System.out.println("What would you like to do?");
			System.out.println("[1] Edit Profile");
			System.out.println("[2] Find Users via First Name");
			System.out.println("[3] Find Users via Last Name");
			System.out.println("[4] Find Users via Member Type (Undergraduate, Graduate, Advisor)");
			System.out.println("[5] Find Users via Advisor Name");
			System.out.println("[6] Quit the Application");
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

	public void editProfile() throws InterruptedException
	{
		String selection;

		try
		{
			sc.reset();
			System.out.println("EDIT PROFILE\n======================================================\n");
			System.out.println("[1] Edit Username");
			System.out.println("[2] Edit Password");
			System.out.println("[3] Edit Birthday");
			System.out.println("[4] Edit First Name");
			System.out.println("[5] Edit Last Name");
			System.out.println("[6] Edit Phone Number");
			System.out.println("[7] Edit Email");
			System.out.println("[8] Edit First Major");
			System.out.println("[9] Edit Second Major");
			System.out.println("[10] Edit First Minor");
			System.out.println("[11] Edit Second Minor");
			System.out.println("[12] Edit Concentration");
			System.out.println("[X] Go Back");
			System.out.print("Enter your selection: ");
			selection = sc.next();

			switch(selection)
			{
				case "1": format.loading(); editUsername(); break;
				case "2": format.loading(); editPassword(); break;
				case "3": format.loading(); editBirthday(); break;
				case "4": format.loading(); editFirstName(); break;
				case "5": format.loading(); editLastName(); break;
				case "6": format.loading(); editPhoneNumber(); break;
				case "7": format.loading(); editEmail(); break;
				case "8": format.loading(); editFirstMajor(); break;
				case "9": format.loading(); editSecondMajor(); break;
				case "10": format.loading(); editFirstMinor(); break;
				case "11": format.loading(); editSecondMinor(); break;
				case "12": format.loading(); editConcentration(); break;
				case "X":
				case "x": format.loading(); undergraduateMenu(); break;
				default: throw new Exception();
			}
		}
		catch(Exception e)
		{
			format.wrongSelection();
			editProfile();
		}
		displayProfile();
		undergraduateMenu();
	}

	public void editUsername() throws InterruptedException, Exception
	{
		System.out.println("EDIT USERNAME\n======================================================\n");
		account.createUsername();
	}

	public void editPassword() throws InterruptedException, Exception
	{
		System.out.println("EDIT PASSWORD\n======================================================\n");
		account.createPassword();
	}

	public void editBirthday() throws InterruptedException
	{
		System.out.println("EDIT BIRTHDAY\n======================================================\n");
		birthdayMenu();
	}

	public void editFirstName() throws InterruptedException
	{
		System.out.println("EDIT FIRST NAME\n======================================================\n");
		firstNameMenu();
	}

	public void editLastName() throws InterruptedException
	{
		System.out.println("EDIT LAST NAME\n======================================================\n");
		lastNameMenu();
	}

	public void editPhoneNumber() throws InterruptedException
	{
		System.out.println("EDIT PHONE NUMBER\n======================================================\n");
		phoneNumberMenu();
	}

	public void editEmail() throws InterruptedException
	{
		System.out.println("EDIT EMAIL\n======================================================\n");
		emailMenu();
	}

	public void editFirstMajor()
	{
		String user_input;

		System.out.println("EDIT FIRST MAJOR\n======================================================\n");
		System.out.print("Enter your first major: ");
		user_input = sc.next();

		setMajor1(user_input);
	}

	public void editSecondMajor()
	{
		String user_input;

		System.out.println("EDIT SECOND MAJOR\n======================================================\n");
		System.out.print("Enter your second major: ");
		user_input = sc.next();

		setMajor2(user_input);
	}

	public void editFirstMinor()
	{
		String user_input;

		System.out.println("EDIT FIRST MINOR\n======================================================\n");
		System.out.print("Enter your first minor: ");
		user_input = sc.next();

		setMinor1(user_input);
	}

	public void editSecondMinor()
	{
		String user_input;

		System.out.println("EDIT SECOND MINOR\n======================================================\n");
		System.out.print("Enter your second minor: ");
		user_input = sc.next();

		setMinor2(user_input);
	}

	public void editConcentration()
	{
		String user_input;

		System.out.println("EDIT CONCENTRATION\n======================================================\n");
		System.out.print("Enter your concentration: ");
		user_input = sc.next();

		setConcentration(user_input);
	}

	public void searchFirstName()
	{
		System.out.println("SEARCH USER: FIRST NAME\n======================================================\n");
	}

	public void searchLastName()
	{
		System.out.println("SEARCH USER: LAST NAME\n======================================================\n");
	}

	public void searchMemberType()
	{
		System.out.println("SEARCH USER: MEMBER TYPE\n======================================================\n");
	}

	public void searchAdvisorName()
	{
		System.out.println("SEARCH USER: ADVISOR NAME\n======================================================\n");
	}

	public void quit()
	{

	}
}
