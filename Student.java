/* The Student Class

   Description: Contains information about a student in the
   education system's directory

   Authors: Ricky Chon
*/

import java.util.Random;
import java.util.Scanner;

public class Student extends Person
{
	private Random random = new Random();

	private final String token = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private final int tokenLength = token.length();

	private String studentID = "";
    private String academicStatus = "";
    private String estimatedGraduationDate = "";
    private String advisor = "";
    private String studentEmail = "";
    private boolean isFailing = false;
    private boolean isPartTime = false;
    private int numberOfClasses;
    private double gpa;
    private double currentCreditAmount;
    private double totalCreditAmount;
    private double remainingCreditAmount;

    public Student() throws InterruptedException
	{
		createStudentID();
		createStudentEmail();
	}

    public String getStudentID()
    {
        return studentID;
    }

    public String getAcademicStatus()
    {
        return academicStatus;
    }

    public String getEstimatedGraduationDate()
    {
        return estimatedGraduationDate;
    }

    public String getAdvisor()
    {
        return advisor;
    }

    public String getStudentEmail()
    {
        return studentEmail;
    }

    public int getNumberOfClasses()
    {
        return numberOfClasses;
    }

    public double getGPA()
    {
        return gpa;
    }

    public double getCurrentCreditAmount()
    {
        return currentCreditAmount;
    }

    public double getTotalCreditAmount()
    {
        return totalCreditAmount;
    }

    public double getRemainingCreditAmount()
    {
        return remainingCreditAmount;
    }

    public void setStudentID(String studentID)
    {
        this.studentID = studentID;
    }

    public void setAcademicStatus(String academicStatus)
    {
        this.academicStatus = academicStatus;
    }

    public void setEstimatedGraduationDate(String estimatedGraduationDate)
    {
        this.estimatedGraduationDate = estimatedGraduationDate;
    }

    public void setAdvisor(String advisor)
    {
        this.advisor = advisor;
    }

    public void setStudentEmail(String studentEmail)
    {
        this.studentEmail = studentEmail;
    }

    public void setNumberOfClasses(int numberOfClasses)
    {
        this.numberOfClasses = numberOfClasses;
    }

    public void setGPA(double gpa)
    {
        this.gpa = gpa;
    }

    public void setCurrentCreditAmount(double currentCreditAmount)
    {
        this.currentCreditAmount = currentCreditAmount;
    }

    public void setTotalCreditAmount(double totalCreditAmount)
    {
        this.totalCreditAmount = totalCreditAmount;
    }

    public void setRemainingCreditAmount(double remainingCreditAmount)
    {
        this.remainingCreditAmount = remainingCreditAmount;
    }

    public void checkFailing(boolean isFailing)
    {
        if(gpa < 2.0) isFailing = true;
        else if(gpa > 2.0) isFailing = false;
    }

    public void checkPartTime(boolean isPartTime)
    {
        if(currentCreditAmount < 12) isPartTime = true;
        else if(currentCreditAmount >= 12) isPartTime = false;
    }

	public void createStudentID()
	{
		String placeholder = "";

		for(int i = 0; i < 10; i++)
		{
			placeholder += token.charAt(random.nextInt(tokenLength));
		}
		setStudentID(placeholder);
	}

	public void createStudentEmail()
	{
		String placeholder = "";

		placeholder = getFirstName() + "." + getLastName();

		for(int i = 0; i < 2; i++)
		{
			placeholder += token.charAt(random.nextInt(tokenLength));
		}
		placeholder += "@personal.directory.io";
		setStudentEmail(placeholder);
	}
}
