/*  The Person class

    Description: Contains information that every person has
    + Getter and setter methods

    Authors: Ricky Chon, Nick Climaco
*/

import java.lang.Integer;
import java.util.Calendar;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person
{
	protected Account account;

	private Scanner sc = new Scanner(System.in);
	private TextFormat format = new TextFormat();
	private DateOfBirth dob = new DateOfBirth();

    private String address = "N/A";
    private String birthday = "N/A";
	private String firstName = "N/A";
    private String lastName = "N/A";
    private String phoneNumber = "N/A";
    private String email = "N/A";

    public Person() throws InterruptedException, Exception
    {
		this.account = new Account();
		System.out.println("PERSONAL INFORMATION\n======================================================\n");
		firstNameMenu();
		lastNameMenu();
		emailMenu();
		phoneNumberMenu();
		birthdayMenu();
    }

	public Person(String username, String password)
	{
		this.account = new Account(username, password);
	}

    public String getAddress()
    {
        return address;
    }

    public String getBirthday()
    {
        return birthday;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getFullName()
    {
        return firstName + " " + lastName;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public String getEmail()
    {
        return email;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public void setBirthday(String birthday)
    {
        this.birthday = birthday;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

	public void addressMenu()
	{

	}

	public void birthdayMenu() throws InterruptedException
	{
		dob.yearMenu();
		dob.monthMenu();
		dob.dayMenu();
		setBirthday(dob.getMonth() + " " + dob.getDay() + ", " + dob.getYear());
	}

	public void firstNameMenu()
	{
		System.out.print("Enter your first name: ");
		setFirstName(sc.next());
	}

	public void lastNameMenu()
	{
		System.out.print("Enter your last name: ");
		setLastName(sc.next());
	}

	public void phoneNumberMenu() throws InterruptedException
	{
		String user_input = "";

		try
		{
			sc.reset();
			System.out.print("Enter your phone number (000-000-0000): ");
			user_input = sc.next();

			if(!(user_input.matches("\\d\\d\\d\\-\\d\\d\\d\\-\\d\\d\\d\\d"))) throw new Exception();
		}
		catch(Exception e)
		{
			System.out.println(format.toRedText("\nYou must enter your phone number in the above format. Try again.\n"));
			Thread.sleep(500);
			phoneNumberMenu();
		}
		setPhoneNumber(user_input);
	}

	public void emailMenu() throws InterruptedException
	{
		String user_input = "";

		try
		{
			sc.reset();
			System.out.print("Enter your email: ");
			user_input = sc.next();

			if(!(isValidEmailAddress(user_input))) throw new Exception();
		}
		catch(Exception e)
		{
			System.out.println(format.toRedText("\nYou must enter a valid email. Try again.\n"));
			Thread.sleep(500);
			emailMenu();
		}
		setEmail(user_input);
	}

	public boolean isValidEmailAddress(String email)
	{
    	String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
    	Pattern p = Pattern.compile(ePattern);
        Matcher m = p.matcher(email);

   		return m.matches();
    }
}
