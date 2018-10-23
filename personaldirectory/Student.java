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
    private String studentEmail = "";
    private boolean isFailing = false;
    private boolean isPartTime = false;
    private int numberOfClasses;
    private double gpa;
    private double currentCreditAmount;
    private double totalCreditAmount;
    private double remainingCreditAmount;

    Student(String studentID, String academicStatus, String estimatedGraduationDate, String advisor, String studentEmail)
    {
        this.studentID = studentID;
        this.academicStatus = academicStatus;
        this.estimatedGraduationDate = estimatedGraduationDate;
        this.advisor = advisor;
        this.studentEmail = studentEmail;
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

    public void setAcademicStatus(String academicStatus)
    {
        this.academicStatus = academicStatus;
    }
}
