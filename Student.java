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

	private String studentID = "N/A";
    private String academicStatus = "N/A";
    private String estimatedGraduationDate = "N/A";
    private String advisor = "N/A";
    private String studentEmail = "N/A";

    public Student() throws InterruptedException, Exception
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

		placeholder = getFirstName() + "." + getLastName() + ".";

		for(int i = 0; i < 4; i++)
		{
			placeholder += token.charAt(random.nextInt(10));
		}
		placeholder += "@personal.directory.io";
		setStudentEmail(placeholder);
	}
}
