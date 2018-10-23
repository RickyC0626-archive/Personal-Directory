/* The Student Class

   Description: Contains information about a student in the
   education system's directory

   Authors: Ricky Chon
*/

public class Student extends Person
{
    private String studentID = "";
    private String academicStatus = "";
    private String estimatedGraduationDate = "";
    private String advisor = "";
    private boolean isFailing = false;
    private double gpa;
    private int numberOfClasses;
    private int currentCreditAmount;
    private int totalCreditAmount;

    public Student()
    {

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

    public boolean getFailing()
    {
        return gpa < 2.0;
    }

    public int getNumberOfClasses()
    {
        return numberOfClasses;
    }

    public int getCurrentCreditAmount()
    {
        return currentCreditAmount;
    }

    public int getTotalCreditAmount()
    {
        return totalCreditAmount;
    }

    public void setStudentID(String studentID)
    {
        this.studentID = studentID;
    }
}
