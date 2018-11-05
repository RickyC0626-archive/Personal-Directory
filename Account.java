/*	The Account Class

	Description: Handles account creation and management

	Authors: Ricky Chon
*/

import java.io.IOException;
import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class Account
{
	private Scanner sc = new Scanner(System.in);
	private TextFormat format = new TextFormat();

	private static String username = "N/A";
	private static String password = "N/A";

	//Constructor for new account
	public Account() throws InterruptedException, Exception
	{
		System.out.println("CREATING AN ACCOUNT\n======================================================\n");
		createUsername();
		createPassword();
		format.loading();
	}

	//Constructor for old account login
	public Account(String username, String password)
	{
		this.username = username;
		this.password = password;
	}

	public static String getUsername()
	{
		return username;
	}

	public static String getPassword()
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
		Scanner file_input = new Scanner(new File("userAccounts.txt"));
		String user_input = "";

		try
		{
			sc.reset();
			System.out.print("Username: ");
			user_input = sc.next();

			while(file_input.hasNext())
			{
				for(int lineNumber = 1;; lineNumber++)
				{
					System.out.println("Line Number: " + lineNumber);
					String usernameToken = "[username]";
					String placeholder = file_input.next();
					System.out.println("Placeholder: " + placeholder);

					if((placeholder.equals(usernameToken)))
					{
						String realUsername = file_input.next();
						System.out.println("RealUsername: " + realUsername);

						if(user_input.equals(realUsername)) throw new Exception();
						else break;
					}
					else
					{
						String disposal = file_input.nextLine();
						System.out.println("Disposal: " + disposal);
					}
				}
			}
		}
		catch(IOException e)
		{
			System.out.println(format.toRedText("\nThere is something wrong with the file. Please check to see if the first term is [username].\n"));
			System.exit(0);
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
	//-----------------------------------------------------------------------------------------------------------------------------
}
