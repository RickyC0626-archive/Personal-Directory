/*	The Account Class

	Description: Handles account creation and management

	Authors: Ricky Chon
*/

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Account
{
	private Scanner sc = new Scanner(System.in);
	private TextFormat format = new TextFormat();

	private static String username = "N/A";
	private static String password = "N/A";
	private boolean isNewUser;

	//Constructor for new account
	public Account() throws InterruptedException, Exception
	{
		System.out.println("CREATING AN ACCOUNT\n======================================================\n");
		isNewUser(true);
		createUsername();
		createPassword();
		format.loading();
	}

	//Constructor for old account login
	public Account(String username, String password)
	{
		isNewUser(false);
		this.username = username;
		this.password = password;
	}

	public boolean isNewUser()
	{
		return isNewUser;
	}

	public void isNewUser(boolean b)
	{
		isNewUser = b;
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
				String usernameToken = file_input.next();
				if(!(usernameToken.equals("[Username]"))) throw new IOException();

				String realUsername = file_input.next();
				String disposalText = file_input.nextLine();
				if(user_input.equalsIgnoreCase(realUsername)) throw new Exception();
			}
			confirmUsername(user_input);
		}
		catch(IOException e)
		{
			System.out.println(format.toRedText("\nThere is something wrong with the file. Please check to see if the first term is [Username].\n"));
			System.exit(0);
		}
		catch(Exception e)
		{
			System.out.println(format.toRedText("\nThat username already exists. Please choose another one.\n"));
			Thread.sleep(500);
			createUsername();
		}
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
			confirmPassword(user_input);
		}
		catch(Exception e)
		{
			System.out.println(format.toRedText("\nThe password is too short. You must enter 6 or more characters.\n"));
			Thread.sleep(500);
			createPassword();
		}
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
