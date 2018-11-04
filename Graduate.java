/* The Graduate Class

   Description: Contains information about a graduate student
   in the college's directory

   Authors: Ricky Chon, Nick Climaco, ZeJun Ren
*/

public class Graduate extends Student
{
    public String degree = "";
    public String fieldOfStudy = "";

	public Graduate() throws InterruptedException
	{

	}

	public String getDegree() {
		return degree;
	}
	public String getFieldOfStudy() {
		return fieldOfStudy;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public void setFieldOfStudy(String fieldOfStudy) {
		this.fieldOfStudy = fieldOfStudy;
	}
}
