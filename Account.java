import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class Account
{
	private Scanner sc = new Scanner(System.in);
	private TextFormat format = new TextFormat();

	private String username = "";
	private String password = "";

	//Constructor for new account
	public Account() throws InterruptedException, Exception
	{
		createUsername();
		createPassword();
		format.loading();
		format.clearScreen();
		promptUser();
	}

	//Constructor for old account login
	public Account(String username, String password)
	{

	}

	public String getUsername()
	{
		return username;
	}

	public String getPassword()
	{
		return password;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	//Signup methods for new account---------------------------------------------------------------------------------------------------
	public void createUsername() throws InterruptedException, Exception
	{
		Scanner file_input = new Scanner(new File("existingUsernames.txt"));
		String user_input = "";

		try
		{
			sc.reset();
			System.out.print("Username: ");
			user_input = sc.next();

			while(file_input.hasNextLine())
			{
				String placeholder = file_input.nextLine();

				if(placeholder.equalsIgnoreCase(user_input)) throw new Exception();
			}
		}
		catch(Exception e)
		{
			System.out.println(format.toRedText("\nThat username already exists. Please choose another one.\n"));
			Thread.sleep(500);
			createUsername();
		}
		confirmUsername(user_input);
	}

	public void confirmUsername(String user_input) throws InterruptedException, Exception
	{
		String newUsername = "";

		try
		{
			sc.reset();
			System.out.print("Confirm username: ");
			newUsername = sc.next();

			if(!(newUsername.equals(user_input))) throw new Exception();
		}
		catch(Exception e)
		{
			System.out.println(format.toRedText("\nThe usernames do not match. Please try again.\n"));
			Thread.sleep(500);
			createUsername();
		}
		setUsername(newUsername);
	}

	public void createPassword() throws InterruptedException, Exception
	{
		String user_input = "";

		try
		{
			sc.reset();
			System.out.print("Password (6 or more characters): ");
			user_input = sc.next();

			if(user_input.length() < 6) throw new Exception();
		}
		catch(Exception e)
		{
			System.out.println(format.toRedText("\nThe password is too short. You must enter 6 or more characters.\n"));
			Thread.sleep(500);
			createPassword();
		}
		confirmPassword(user_input);
	}

	public void confirmPassword(String user_input) throws InterruptedException, Exception
	{
		String newPassword = "";

		try
		{
			sc.reset();
			System.out.print("Confirm password: ");
			newPassword = sc.next();

			if(!(newPassword.equals(user_input))) throw new Exception();
		}
		catch(Exception e)
		{
			System.out.println(format.toRedText("\nThe passwords do not match. Please try again.\n"));
			Thread.sleep(500);
			createPassword();
		}
		setPassword(newPassword);
	}

	public void promptUser() throws InterruptedException
	{
		String selection;

		try
		{
			sc.reset();
			System.out.println("GETTING STARTED\n======================================================\n");
			System.out.println("Welcome to the Personal Directory System \"" + getUsername() + "\"!");
			System.out.println("Which of the following is your current status?\n");
			System.out.println("[1] Undergraduate Student");
			System.out.println("[2] Graduate Student");
			System.out.println("[3] Advisor");
			System.out.print("Enter your selection: ");
			selection = sc.next();

			switch(selection)
			{
				case "1": format.loading(); Undergraduate newUndergrad = new Undergraduate(); break;
				case "2": format.loading(); Graduate newGrad = new Graduate(); break;
				case "3": format.loading(); Advisor newAdvisor = new Advisor(); break;
				default: throw new Exception();
			}
		}
		catch(Exception e)
		{
			format.wrongSelection();
			promptUser();
		}
	}
	//-----------------------------------------------------------------------------------------------------------------------------
}
