/* The Graduate Class

   Description: Contains information about a graduate student
   in the college's directory

   Authors: Ricky Chon, Nick Climaco
*/

import java.util.Scanner;

public class Graduate extends Student
{
	private Scanner sc = new Scanner(System.in);
	private TextFormat format = new TextFormat();

    public String degree = "N/A";
    public String fieldOfStudy = "N/A";

	public Graduate() throws InterruptedException, Exception
	{
		setAcademicStatus("Graduate");
		displayProfile();
		graduateMenu();
	}

	public String getDegree()
	{
		return degree;
	}

	public String getFieldOfStudy()
	{
		return fieldOfStudy;
	}

	public void setDegree(String degree)
	{
		this.degree = degree;
	}

	public void setFieldOfStudy(String fieldOfStudy)
	{
		this.fieldOfStudy = fieldOfStudy;
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
		System.out.println("Degree: " + getDegree());
		System.out.println("Field of Study: " + "\n");
		System.out.println("StudentID: " + getStudentID());
		System.out.println("Student Email: " + getStudentEmail() + "\n");
		System.out.println("Advisor: " + getAdvisor());
		System.out.println("\n======================================================\n");
	}

	public void graduateMenu() throws InterruptedException
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
			graduateMenu();
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
			System.out.println("[8] Edit Degree");
			System.out.println("[9] Edit Field of Study");
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
				case "8": format.loading(); editDegree(); break;
				case "9": format.loading(); editFieldOfStudy(); break;
				case "X":
				case "x": format.loading(); graduateMenu(); break;
				default: throw new Exception();
			}
		}
		catch(Exception e)
		{
			format.wrongSelection();
			editProfile();
		}
		displayProfile();
		graduateMenu();
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

	public void editDegree()
	{
		String user_input;

		System.out.println("EDIT DEGREE\n======================================================\n");
		System.out.print("Enter your degree: ");
		user_input = sc.next();

		setDegree(user_input);
	}

	public void editFieldOfStudy()
	{
		String user_input;

		System.out.println("EDIT FIELD OF STUDY\n======================================================\n");
		System.out.print("Enter your field of study: ");
		user_input = sc.next();

		setFieldOfStudy(user_input);
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
