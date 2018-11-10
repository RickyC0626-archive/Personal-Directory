/* Project 1: The Personal Directory

   Description: The Personal Directory contains personal entries
   for the members that consists of undergraduate students, graduate students,
   and faculty/industry mentors/advisors to ease management and communication

   Authors: Ricky Chon, Nick Climaco, ZeJun Ren

   Objectives:
   + Finding personal address book entries
     - Finding entries using first name
     - Finding entries using last name
     - Finding entries using member type (graduate, undergraduate, academic
       mentor, industry mentor)
     - Finding student's entries using mentor's name (given that student has at
       least one mentor)
   + Pinging mentees from a mentor
   + Adding a personal address book entry
   + Editing a personal address book entry
   + Deleting a personal address book entry
   + Setting up quick messaging to members
   + Removing quick messaging setup
*/

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//This is the main class
public class PersonalDirectory
{
	private static Scanner sc = new Scanner(System.in);
	private static TextFormat format = new TextFormat();

    public static void main(String[] args) throws InterruptedException, Exception
    {
		mainMenu();
    }

	public static void mainMenu() throws InterruptedException, Exception
	{
		String selection;

		try
		{
			System.out.println("MAIN MENU\n======================================================\n");
			System.out.println("[1] Login");
			System.out.println("[2] Signup");
			System.out.print("Enter your selection: ");
			selection = sc.next();

			switch(selection)
			{
				case "1": format.loading(); login(); break;
				case "2": format.loading(); signup(); break;
				default: throw new MenuException();
			}
		}
		catch(MenuException e)
		{
			format.wrongSelection();
			mainMenu();
		}
	}

	//Login methods
	public static void login() throws InterruptedException, Exception
	{
		String username, password;

		sc.reset();
		System.out.println("LOGIN PAGE\n======================================================\n");
		System.out.print("Username: ");
		username = sc.next();
		System.out.print("Password: ");
		password = sc.next();

		checkCredentials(username, password);
	}

	public static void checkCredentials(String username, String password) throws InterruptedException, Exception
	{
		Scanner file_input = new Scanner(new File("userAccounts.txt"));
		int lineNumber = 0;

		try
		{
			while(file_input.hasNextLine())
			{
				lineNumber++;
				String usernameToken = file_input.next();
				if(!(usernameToken.equals("[Username]"))) throw new IOException();
				String realUsername = file_input.next();

				String passwordToken = file_input.next();
				if(!(passwordToken.equals("[Password]"))) throw new IOException();
				String realPassword = file_input.next();

				if(username.equals(realUsername) && password.equals(realPassword))
				{
					String placeholder = file_input.nextLine();
					String[] userinfo = placeholder.split(" ");
					String academicStatus = userinfo[14];

					if(academicStatus.equals("Undergraduate"))
					{
						format.loading();
						Undergraduate oldUndergrad = new Undergraduate(username, password, userinfo, lineNumber);
					}
					else if(academicStatus.equals("Graduate"))
					{
						format.loading();
						Graduate oldGraduate = new Graduate(username, password, userinfo, lineNumber);
					}
					else if(academicStatus.equals("Advisor"))
					{
						format.loading();
						Advisor oldAdvisor = new Advisor(username, password, userinfo, lineNumber);
					}
					else throw new IOException();
				}
				else
				{
					String disposalText = file_input.nextLine();
				}
			}
			throw new Exception();
		}
		catch(IOException e)
		{
			System.out.println(format.toRedText("\nThere is something wrong with the file. Please check to see if the tokens are placed correctly.\n"));
			System.exit(0);
		}
		catch(Exception e)
		{
			System.out.println(format.toRedText("\nUsername or password is incorrect. Please try again.\n"));
			Thread.sleep(500);
			format.clearScreen();
			login();
		}
	}

	//Signup methods
	public static void signup() throws InterruptedException, Exception
	{
		sc.reset();
		System.out.println("SIGNUP PAGE\n======================================================\n");

		String selection;

		try
		{
			sc.reset();
			System.out.println("Welcome to the Personal Directory System!");
			System.out.println("Which of the following is your current status?");
			System.out.println("!!! WARNING: You cannot change this !!!\n");
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
				default: throw new MenuException();
			}
		}
		catch(MenuException e)
		{
			format.wrongSelection();
			signup();
		}

	}
}
