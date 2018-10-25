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

import java.util.Scanner;

//This is the main class
public class PersonalDirectory
{
	private static DateOfBirth dob = new DateOfBirth();

    public static void main(String[] args) throws IllegalInputException
    {
		System.out.println("Driver for DateOfBirth\n");
		dob.setYear();
		dob.setMonth();
		dob.setDay();
		System.out.println("\nYou were born on " + dob.getMonth() + " " + dob.getDay() + ", " + dob.getYear());

    }
}
