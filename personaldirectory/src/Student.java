/* The Student Class

   Description: Contains information about a student in the
   education system's directory

   Authors: Ricky Chon
*/

import java.util.Random;

public class Student extends Person
{
	private Random random = new Random();

	private final String token = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private final int tokenLength = token.length();

	private String studentID = "N/A";
    private String advisor = "N/A";
    private String studentEmail = "N/A";

    public Student() throws InterruptedException, Exception
	{
		createStudentID();
		createStudentEmail();
	}

	public Student(String username, String password, String[] userinfo, int fileLineNumber) throws InterruptedException, Exception
	{
		super(username, password, userinfo, fileLineNumber);
		this.studentID = userinfo[16];
		this.studentEmail = userinfo[18];
		this.advisor = userinfo[20];
	}

    public String getStudentID()
    {
        return studentID;
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

		placeholder = getFirstName() + getLastName() + ".";

		for(int i = 0; i < 4; i++)
		{
			placeholder += token.charAt(random.nextInt(10));
		}
		placeholder += "@personaldirectory.io";
		setStudentEmail(placeholder);
	}
}
