/* The Graduate Class

   Description: Contains information about a graduate student
   in the college's directory

   Authors: Ricky Chon, Nick Climaco
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
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
	}

	public Graduate(String username, String password, String[] userinfo, int fileLineNumber) throws InterruptedException, Exception
	{
		super(username, password, userinfo, fileLineNumber);
		this.degree = userinfo[22];
		this.fieldOfStudy = userinfo[24];
		displayProfile();
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

	public void displayProfile() throws InterruptedException, Exception
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
		System.out.println("Field of Study: " + getFieldOfStudy() + "\n");
		System.out.println("StudentID: " + getStudentID());
		System.out.println("Student Email: " + getStudentEmail() + "\n");
		System.out.println("Advisor: " + getAdvisor());
		System.out.println("\n======================================================");

		graduateMenu();
	}

	public void graduateMenu() throws InterruptedException, Exception
	{
		String selection;

		try
		{
			sc.reset();
			System.out.println("\nWhat would you like to do?");
			System.out.println("[1] Edit Profile");
			System.out.println("[2] Search User");
			System.out.println("[3] Message Menu");
			System.out.println("[X] Quit the Application");
			System.out.print("Enter your selection: ");
			selection = sc.next();

			switch(selection)
			{
				case "1": format.loading(); editProfile(); break;
				case "2": format.loading(); searchMenu(); break;
				case "3": format.loading(); messageMenu(); break;
				case "X": format.loading(); quit(); break;
				case "x": format.loading(); quit(); break;
				default: throw new MenuException();
			}
		}
		catch(MenuException e)
		{
			format.wrongSelection();
			displayProfile();
		}
	}

	public void editProfile() throws InterruptedException, Exception
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
				case "x": format.loading(); displayProfile(); break;
				default: throw new MenuException();
			}
		}
		catch(MenuException e)
		{
			format.wrongSelection();
			editProfile();
		}
		displayProfile();
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

	public void editDegree() throws InterruptedException, Exception
	{
		String user_input;

		System.out.println("EDIT DEGREE\n======================================================\n");
		System.out.print("Enter your degree: ");
		user_input = sc.next();

		setDegree(user_input);
		displayProfile();
	}

	public void editFieldOfStudy() throws InterruptedException, Exception
	{
		String user_input;

		System.out.println("EDIT FIELD OF STUDY\n======================================================\n");
		System.out.print("Enter your field of study: ");
		user_input = sc.next();

		setFieldOfStudy(user_input);
		displayProfile();
	}

	public void searchMenu() throws InterruptedException, Exception
	{
		System.out.println("SEARCH MENU\n======================================================\n");

		String selection;

		try
		{
			sc.reset();
			System.out.println("[1] First Name");
			System.out.println("[2] Last Name");
			System.out.println("[3] Member Type");
			System.out.println("[4] Advisor");
			System.out.println("[X] Go back");
			System.out.print("Enter your selection: ");
			selection = sc.next();

			switch(selection)
			{
				case "1": format.loading(); searchFirstName(); break;
				case "2": format.loading(); searchLastName(); break;
				case "3": format.loading(); searchMemberType(); break;
				case "4": format.loading(); searchAdvisorName(); break;
				case "X":
				case "x": format.loading(); displayProfile(); break;
				default: throw new MenuException();
			}
		}
		catch(MenuException e)
		{
			format.wrongSelection();
			searchMenu();
		}
	}

	public void searchFirstName() throws InterruptedException, Exception
	{
		System.out.println("SEARCH USER: FIRST NAME\n======================================================\n");

		Scanner file_input = new Scanner(new File("userAccounts.txt"));
		ArrayList<String> userFullName = new ArrayList<String>();
		ArrayList<String> userAcademicStatus = new ArrayList<String>();
		ArrayList<String> userID = new ArrayList<String>();
		ArrayList<String> userAdvisor = new ArrayList<String>();
		String user_input = "";

		try
		{
			sc.reset();
			System.out.print("Enter the first name of the user you want to search: ");
			user_input = sc.next();

			while(file_input.hasNext())
			{
				String placeholder = file_input.nextLine();
				String[] userinfo = placeholder.split(" ");
				String firstName = userinfo[5];

				if(user_input.equalsIgnoreCase(firstName))
				{
					String lastName = userinfo[7];
					userFullName.add(firstName + " " + lastName);
					String academicStatus = userinfo[17];
					userAcademicStatus.add(academicStatus);
					String identification = userinfo[19];
					userID.add(identification);
					String advisor = userinfo[23];
					userAdvisor.add(advisor);
				}
			}
			if(userFullName.isEmpty()) throw new SearchException();

			System.out.print("\n");

			for(int i = 0; i <= userFullName.size(); i++)
			{
				System.out.print(userFullName.get(i) + " | Academic Status: " + userAcademicStatus.get(i) + " | ID: " + userID.get(i));

				if(userAcademicStatus.get(i).equalsIgnoreCase("Advisor"))
				System.out.println(" | Department: " + userAdvisor.get(i));
				else if(userAcademicStatus.get(i).equalsIgnoreCase("Undergraduate") || userAcademicStatus.get(i).equalsIgnoreCase("Graduate"))
				System.out.println(" | Advisor: " + userAdvisor.get(i));
			}
			Thread.sleep(1500);
			graduateMenu();
		}
		catch(SearchException e)
		{
			System.out.println(format.toRedText("\nThere are no users with that name in the directory.\n"));
			Thread.sleep(1500);
			format.clearScreen();
			displayProfile();
		}
	}

	public void searchLastName() throws InterruptedException, Exception
	{
		System.out.println("SEARCH USER: LAST NAME\n======================================================\n");

		Scanner file_input = new Scanner(new File("userAccounts.txt"));
		ArrayList<String> userFullName = new ArrayList<String>();
		ArrayList<String> userAcademicStatus = new ArrayList<String>();
		ArrayList<String> userID = new ArrayList<String>();
		ArrayList<String> userAdvisor = new ArrayList<String>();
		String user_input = "";

		try
		{
			sc.reset();
			System.out.print("Enter the last name of the user you want to search: ");
			user_input = sc.next();

			while(file_input.hasNext())
			{
				String placeholder = file_input.nextLine();
				String[] userinfo = placeholder.split(" ");
				String lastName = userinfo[7];

				if(user_input.equalsIgnoreCase(lastName))
				{
					String firstName = userinfo[5];
					userFullName.add(lastName + ", " + firstName);
					String academicStatus = userinfo[17];
					userAcademicStatus.add(academicStatus);
					String identification = userinfo[19];
					userID.add(identification);
					String advisor = userinfo[23];
					userAdvisor.add(advisor);
				}
			}
			if(userFullName.isEmpty()) throw new SearchException();

			System.out.print("\n");

			for(int i = 0; i <= userFullName.size(); i++)
			{
				System.out.print(userFullName.get(i) + " | Academic Status: " + userAcademicStatus.get(i) + " | ID: " + userID.get(i));

				if(userAcademicStatus.get(i).equalsIgnoreCase("Advisor"))
				System.out.println(" | Department: " + userAdvisor.get(i));
				else if(userAcademicStatus.get(i).equalsIgnoreCase("Undergraduate") || userAcademicStatus.get(i).equalsIgnoreCase("Graduate"))
				System.out.println(" | Advisor: " + userAdvisor.get(i));
			}
			Thread.sleep(1500);
			graduateMenu();
		}
		catch(SearchException e)
		{
			System.out.println(format.toRedText("\nThere are no users with that name in the directory.\n"));
			Thread.sleep(1500);
			format.clearScreen();
			displayProfile();
		}
	}

	public void searchMemberType() throws InterruptedException, Exception
	{
		System.out.println("SEARCH USER: MEMBER TYPE\n======================================================\n");

		Scanner file_input = new Scanner(new File("userAccounts.txt"));
		ArrayList<String> userFullName = new ArrayList<String>();
		ArrayList<String> userAcademicStatus = new ArrayList<String>();
		ArrayList<String> userID = new ArrayList<String>();
		ArrayList<String> userAdvisor = new ArrayList<String>();
		String user_input = "";

		try
		{
			sc.reset();
			System.out.print("Enter the member type of the user you want to search: ");
			user_input = sc.next();

			while(file_input.hasNext())
			{
				String placeholder = file_input.nextLine();
				String[] userinfo = placeholder.split(" ");
				String academicStatus = userinfo[17];

				if(user_input.equalsIgnoreCase(academicStatus))
				{
					userAcademicStatus.add(academicStatus);
					String firstName = userinfo[5];
					String lastName = userinfo[7];
					userFullName.add(firstName + " " + lastName);
					String identification = userinfo[19];
					userID.add(identification);
					String advisor = userinfo[23];
					userAdvisor.add(advisor);
				}
			}
			if(userAcademicStatus.isEmpty()) throw new SearchException();

			System.out.print("\n");

			for(int i = 0; i <= userAcademicStatus.size(); i++)
			{
				System.out.print(userAcademicStatus.get(i) + " | Full Name: " + userFullName.get(i) + " | ID: " + userID.get(i));

				if(userAcademicStatus.get(i).equalsIgnoreCase("Advisor"))
				System.out.println(" | Department: " + userAdvisor.get(i));
				else if(userAcademicStatus.get(i).equalsIgnoreCase("Undergraduate") || userAcademicStatus.get(i).equalsIgnoreCase("Graduate"))
				System.out.println(" | Advisor: " + userAdvisor.get(i));
			}
			Thread.sleep(1500);
			graduateMenu();
		}
		catch(SearchException e)
		{
			System.out.println(format.toRedText("\nThere are no users with that name in the directory.\n"));
			Thread.sleep(1500);
			format.clearScreen();
			displayProfile();
		}
	}

	public void searchAdvisorName() throws InterruptedException, Exception
	{
		System.out.println("SEARCH USER: ADVISOR NAME\n======================================================\n");

		Scanner file_input = new Scanner(new File("userAccounts.txt"));
		ArrayList<String> userFullName = new ArrayList<String>();
		ArrayList<String> userAcademicStatus = new ArrayList<String>();
		ArrayList<String> userID = new ArrayList<String>();
		ArrayList<String> userAdvisor = new ArrayList<String>();
		String user_input = "";

		try
		{
			sc.reset();
			System.out.print("Enter the advisor of the user you want to search: ");
			user_input = sc.next();

			while(file_input.hasNext())
			{
				String placeholder = file_input.nextLine();
				String[] userinfo = placeholder.split(" ");
				String advisor = userinfo[23];

				if(user_input.equalsIgnoreCase(advisor))
				{
					userAdvisor.add(advisor);
					String firstName = userinfo[5];
					String lastName = userinfo[7];
					userFullName.add(firstName + " " + lastName);
					String academicStatus = userinfo[17];
					userAcademicStatus.add(academicStatus);
					String identification = userinfo[19];
					userID.add(identification);
				}
			}
			if(userAdvisor.isEmpty()) throw new SearchException();

			System.out.print("\n");

			for(int i = 0; i <= userAdvisor.size(); i++)
			{
				if(userAcademicStatus.get(i).equalsIgnoreCase("Undergraduate") || userAcademicStatus.get(i).equalsIgnoreCase("Graduate"))
				System.out.print(userAdvisor.get(i));

				System.out.println(" | Full Name: " + userFullName.get(i) + " | Academic Status: " + userAcademicStatus.get(i) + " | ID: " + userID.get(i));
			}
			Thread.sleep(1500);
			graduateMenu();
		}
		catch(SearchException e)
		{
			System.out.println(format.toRedText("\nThere are no users with that name in the directory.\n"));
			Thread.sleep(1500);
			format.clearScreen();
			displayProfile();
		}
	}

	public void messageMenu() throws InterruptedException, Exception
	{
		System.out.println("MESSAGE MENU\n======================================================\n");

		String selection;

		try
		{
			sc.reset();
			System.out.println("[1] Message User");
			System.out.println("[2] View New Messages");
			System.out.println("[3] View Read Messages");
			System.out.println("[4] View Sent Messages");
			System.out.println("[X] Go back");
			System.out.print("Enter your selection: ");
			selection = sc.next();

			switch(selection)
			{
				case "1": format.loading(); messageUser(); break;
				case "2": format.loading(); viewNewMessages(); break;
				case "3": format.loading(); viewReadMessages(); break;
				case "4": format.loading(); viewSentMessages(); break;
				case "X":
				case "x": format.loading(); displayProfile(); break;
				default: throw new MenuException();
			}
		}
		catch(MenuException e)
		{
			format.wrongSelection();
			messageMenu();
		}
	}

	public void messageUser() throws InterruptedException, Exception
	{
		System.out.println("MESSAGE USER\n======================================================\n");

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new FileWriter("userMessages.txt", true));
		Scanner file_input = new Scanner(new File("userAccounts.txt"));
		ArrayList<String> userFullName = new ArrayList<String>();
		ArrayList<String> userAcademicStatus = new ArrayList<String>();
		ArrayList<String> userID = new ArrayList<String>();
		ArrayList<String> userAdvisor = new ArrayList<String>();
		String user_input = "";

		try
		{
			sc.reset();
			System.out.print("Enter the ID of the user you want to send a message to: ");
			user_input = sc.next();

			while(file_input.hasNext())
			{
				String placeholder = file_input.nextLine();
				String[] userinfo = placeholder.split(" ");
				String identification = userinfo[19];

				if(user_input.equalsIgnoreCase(identification))
				{
					userID.add(identification);
					String firstName = userinfo[5];
					String lastName = userinfo[7];
					userFullName.add(firstName + " " + lastName);
					String academicStatus = userinfo[17];
					userAcademicStatus.add(academicStatus);
					String advisor = userinfo[23];
					userAdvisor.add(advisor);

					System.out.print("Enter your message: ");
					String message = input.readLine();

					pw.print("[SenderID] " + getStudentID());
					pw.println(" [ReceiverID] " + userID.get(0) + " [isRead] false");
					pw.println("[Message] " + message);
					pw.close();
				}
			}
			if(userID.isEmpty()) throw new MessageException();

			System.out.println("\nYour message has been sent to:");
			System.out.print(userFullName.get(0) + " | ID: " + userID.get(0) + " | Academic Status: " + userAcademicStatus.get(0));

			if(userAcademicStatus.get(0).equalsIgnoreCase("Advisor"))
			System.out.println(" | Department: " + userAdvisor.get(0));
			else if(userAcademicStatus.get(0).equalsIgnoreCase("Undergraduate") || userAcademicStatus.get(0).equalsIgnoreCase("Graduate"))
			System.out.println(" | Advisor: " + userAdvisor.get(0));

			Thread.sleep(1500);
			graduateMenu();
		}
		catch(MessageException e)
		{
			System.out.println(format.toRedText("\nThere are no users with that ID in the directory.\n"));
			Thread.sleep(1500);
			format.clearScreen();
			displayProfile();
		}
	}

	public void viewNewMessages() throws InterruptedException, Exception
	{
		System.out.println("VIEW NEW MESSAGES\n======================================================\n");

		Scanner user_messages = new Scanner(new File("userMessages.txt"));
		ArrayList<String> userFullName = new ArrayList<String>();
		ArrayList<String> userAcademicStatus = new ArrayList<String>();
		ArrayList<String> userAdvisor = new ArrayList<String>();
		ArrayList<String> senderID = new ArrayList<String>();
		ArrayList<String> messages = new ArrayList<String>();
		ArrayList<Integer> lineNumberArray = new ArrayList<Integer>();
		String receiver = "";
		int lineNumber = 1;

		try
		{
			while(user_messages.hasNextLine())
			{
				if(lineNumber % 2 != 0)
				{
					String userinfo_placeholder = user_messages.nextLine();
					String message = user_messages.nextLine();
					String[] message_userinfo = userinfo_placeholder.split(" ");
					receiver = message_userinfo[3];

					if(receiver.equals(getStudentID()) && message_userinfo[5].equalsIgnoreCase("false"))
					{
						messages.add(message);
						String sender = message_userinfo[1];
						lineNumberArray.add(lineNumber);

						Scanner user_accounts = new Scanner(new File("userAccounts.txt"));
						while(user_accounts.hasNextLine())
						{
							String account_placeholder = user_accounts.nextLine();
							String[] account_userinfo = account_placeholder.split(" ");
							String identification = account_userinfo[19];

							if(sender.equals(identification))
							{
								senderID.add(identification);
								String firstName = account_userinfo[5];
								String lastName = account_userinfo[7];
								userFullName.add(firstName + " " + lastName);
								String academicStatus = account_userinfo[17];
								userAcademicStatus.add(academicStatus);
								String advisor = account_userinfo[23];
								userAdvisor.add(advisor);
							}
						}
					}
				}
				lineNumber += 2;
			}
			for(int i = 0; i < messages.size(); i++)
			{
				System.out.print("New message from: ");
				System.out.print(userFullName.get(i) + " | Academic Status: " + userAcademicStatus.get(i) + " | ID: " + senderID.get(i));

				if(userAcademicStatus.get(i).equalsIgnoreCase("Undergraduate") || userAcademicStatus.get(i).equalsIgnoreCase("Graduate"))
				System.out.println(" | Advisor: " + userAdvisor.get(i));
				else if(userAcademicStatus.get(i).equalsIgnoreCase("Advisor"))
				System.out.println(" | Department: " + userAdvisor.get(i));
				System.out.println(format.toYellowText(messages.get(i) + "\n"));

				replaceTextMessages(lineNumberArray.get(i), "[SenderID] " + senderID.get(i) +
									" [ReceiverID] " + getStudentID() + " [isRead] true");
			}
			if(messages.isEmpty()) throw new MessageException();

			Thread.sleep(1500);
			graduateMenu();
		}
		catch(MessageException e)
		{
			System.out.println(format.toRedText("You have no new messages.\n"));
			Thread.sleep(1500);
			format.clearScreen();
			displayProfile();
		}
	}

	public void viewReadMessages() throws InterruptedException, Exception
	{
		System.out.println("VIEW READ MESSAGES\n======================================================\n");

		Scanner user_messages = new Scanner(new File("userMessages.txt"));
		ArrayList<String> userFullName = new ArrayList<String>();
		ArrayList<String> userAcademicStatus = new ArrayList<String>();
		ArrayList<String> userAdvisor = new ArrayList<String>();
		ArrayList<String> senderID = new ArrayList<String>();
		ArrayList<String> messages = new ArrayList<String>();
		String receiver = "";
		int lineNumber = 1;

		try
		{
			while(user_messages.hasNextLine())
			{
				if(lineNumber % 2 != 0)
				{
					String userinfo_placeholder = user_messages.nextLine();
					String message = user_messages.nextLine();
					String[] message_userinfo = userinfo_placeholder.split(" ");
					receiver = message_userinfo[3];

					if(receiver.equals(getStudentID()) && message_userinfo[5].equalsIgnoreCase("true"))
					{
						messages.add(message);
						String sender = message_userinfo[1];

						Scanner user_accounts = new Scanner(new File("userAccounts.txt"));
						while(user_accounts.hasNextLine())
						{
							String account_placeholder = user_accounts.nextLine();
							String[] account_userinfo = account_placeholder.split(" ");
							String identification = account_userinfo[19];

							if(sender.equals(identification))
							{
								senderID.add(identification);
								String firstName = account_userinfo[5];
								String lastName = account_userinfo[7];
								userFullName.add(firstName + " " + lastName);
								String academicStatus = account_userinfo[17];
								userAcademicStatus.add(academicStatus);
								String advisor = account_userinfo[23];
								userAdvisor.add(advisor);
							}
						}
					}
				}
				lineNumber += 2;
			}
			for(int i = 0; i < messages.size(); i++)
			{
				System.out.print("[Message Read] from: ");
				System.out.print(userFullName.get(i) + " | Academic Status: " + userAcademicStatus.get(i) + " | ID: " + senderID.get(i));

				if(userAcademicStatus.get(i).equalsIgnoreCase("Undergraduate") || userAcademicStatus.get(i).equalsIgnoreCase("Graduate"))
				System.out.println(" | Advisor: " + userAdvisor.get(i));
				else if(userAcademicStatus.get(i).equalsIgnoreCase("Advisor"))
				System.out.println(" | Department: " + userAdvisor.get(i));
				System.out.println(format.toCyanText(messages.get(i) + "\n"));
			}
			if(messages.isEmpty()) throw new MessageException();

			Thread.sleep(1500);
			graduateMenu();
		}
		catch(MessageException e)
		{
			System.out.println(format.toRedText("You have no read messages.\n"));
			Thread.sleep(1500);
			format.clearScreen();
			displayProfile();
		}
	}

	public void viewSentMessages() throws InterruptedException, Exception
	{
		System.out.println("VIEW SENT MESSAGES\n======================================================\n");

		ArrayList<String> userFullName = new ArrayList<String>();
		ArrayList<String> userAcademicStatus = new ArrayList<String>();
		ArrayList<String> userAdvisor = new ArrayList<String>();
		ArrayList<String> receiver_id = new ArrayList<String>();
		ArrayList<String> messages = new ArrayList<String>();
		int lineNumber = 1;

		try(Scanner user_messages = new Scanner(new File("userMessages.txt"));)
		{
			while(user_messages.hasNextLine())
			{
				if(lineNumber % 2 != 0)
				{
					String userinfo_placeholder = user_messages.nextLine();
					String message = user_messages.nextLine();
					String[] message_userinfo = userinfo_placeholder.split(" ");
					String sender = message_userinfo[1];

					if(sender.equals(getStudentID()))
					{
						messages.add(message);
						String receiver = message_userinfo[3];

						Scanner user_accounts = new Scanner(new File("userAccounts.txt"));
						while(user_accounts.hasNextLine())
						{
							String account_placeholder = user_accounts.nextLine();
							String[] account_userinfo = account_placeholder.split(" ");
							String identification = account_userinfo[19];

							if(receiver.equals(identification))
							{
								receiver_id.add(identification);
								String firstName = account_userinfo[5];
								String lastName = account_userinfo[7];
								userFullName.add(firstName + " " + lastName);
								String academicStatus = account_userinfo[17];
								userAcademicStatus.add(academicStatus);
								String advisor = account_userinfo[23];
								userAdvisor.add(advisor);
							}
						}
					}
				}
				lineNumber += 2;
			}
			for(int i = 0; i < messages.size(); i++)
			{
				System.out.print("Message sent to: ");
				System.out.print(userFullName.get(i) + " | Academic Status: " + userAcademicStatus.get(i) + " | ID: " + receiver_id.get(i));

				if(userAcademicStatus.get(i).equalsIgnoreCase("Undergraduate") || userAcademicStatus.get(i).equalsIgnoreCase("Graduate"))
				System.out.println(" | Advisor: " + userAdvisor.get(i));
				else if(userAcademicStatus.get(i).equalsIgnoreCase("Advisor"))
				System.out.println(" | Department: " + userAdvisor.get(i));
				System.out.println(format.toGreenText(messages.get(i) + "\n"));
			}
			if(messages.isEmpty()) throw new MessageException();

			Thread.sleep(1500);
			graduateMenu();
		}
		catch(MessageException e)
		{
			System.out.println(format.toRedText("You have no sent messages.\n"));
			Thread.sleep(1500);
			format.clearScreen();
			displayProfile();
		}
	}

	public void quit() throws Exception
	{
		PrintWriter pw = new PrintWriter(new FileWriter("userAccounts.txt", true));

		if(account.isNewUser())
		{
			pw.print("[Username] " + account.getUsername());
			pw.print(" [Password] " + account.getPassword());
			pw.print(" [FirstName] " + getFirstName());
			pw.print(" [LastName] " + getLastName());
			pw.print(" [Birthday] " + getBirthday());
			pw.print(" [PhoneNumber] " + getPhoneNumber());
			pw.print(" [Email] " + getEmail());
			pw.print(" [AcademicStatus] " + getAcademicStatus());
			pw.print(" [StudentID] " + getStudentID());
			pw.print(" [StudentEmail] " + getStudentEmail());
			pw.print(" [Advisor] " + getAdvisor());
			pw.print(" [Degree] " + getDegree());
			pw.println(" [FieldOfStudy] " + getFieldOfStudy());
			pw.close();
		}
		else if(!(account.isNewUser()))
		{
			replaceTextAccounts(fileLineNumber, "[Username] " + account.getUsername() +
									" [Password] " + account.getPassword() +
									" [FirstName] " + getFirstName() +
									" [Lastname] " + getLastName() +
									" [Birthday] " + getBirthday() +
									" [PhoneNumber] " + getPhoneNumber() +
									" [Email] " + getEmail() +
									" [AcademicStatus] " + getAcademicStatus() +
									" [StudentID] " + getStudentID() +
									" [StudentEmail] " + getStudentEmail() +
									" [Advisor] " + getAdvisor() +
									" [Degree] " + getDegree() +
									" [FieldOfStudy] " + getFieldOfStudy());
		}
		System.exit(0);
	}
}
