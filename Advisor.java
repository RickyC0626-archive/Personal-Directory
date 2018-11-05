/* The Advisor Class

   Description: Contains information about an advisor
   in the college's directory

   Authors: Ricky Chon, Nick Climaco, ZeJun Ren
*/

public class Advisor extends Person
{
  	private String department;
	private String facultyStatus;
  	private String facultyEmail;
  	private String officeHoursStart;
  	private String officeHoursEnd;
	private int yearsAsAdvisor;

  	public Advisor() throws InterruptedException, Exception
	{

  	}

  	public String getDepartment()
	{
    	return department;
  	}

	public String getFacultyStatus()
	{
		return facultyStatus;
	}

  	public String getFacultyEmail()
  	{
	  	return facultyEmail;
  	}

  	public String getOfficeHoursStart()
	{
    	return officeHoursStart;
  	}

  	public String getOfficeHoursEnd()
	{
    	return officeHoursEnd;
  	}

	public int getYearsAsAdvisor()
	{
		return yearsAsAdvisor;
	}

  	public void setDepartment(String department)
	{
    	this.department = department;
  	}

	public void setFacultyStatus(String facultyStatus)
	{
		this.facultyStatus = facultyStatus;
	}

	public void setFacultyEmail(String facultyEmail)
	{
		this.facultyEmail = facultyEmail;
	}

  	public void setYearsAsAdvisor(int yearsAsAdvisor)
	{
    	this.yearsAsAdvisor = yearsAsAdvisor;
  	}

  	public void setOfficeHoursStart(String officeHoursStart)
	{
    	this.officeHoursStart = officeHoursStart;
  	}

  	public void setOfficeHoursEnd(String officeHoursEnd)
	{
    	this.officeHoursEnd = officeHoursEnd;
  	}
}
