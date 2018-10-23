/* The UserInterface Class

   Description: User friendly interface for easy movement through the directory

   Authors: Ricky Chon

   Objectives:
   + Main menu
     - Login page
     - Signup page
   + Gives user choices for each action
*/

import java.util.Scanner;

public class UserInterface
{
    private int user_input;

    public void mainMenu()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("THE PERSONAL DIRECTORY");
        System.out.println("--------------------------------------");
        System.out.println("(1) Login");
        System.out.println("(2) Signup");
        System.out.print("\nType the number of your selection and press Enter: ");

        user_input = sc.nextInt();
    }
}
