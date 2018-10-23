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
        super();
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
        if(gpa < 2.0) return true;
        else if(gpa > 2.0) return false;

        return null;
    }

    public void checkPartTime(boolean isPartTime)
    {
        if(currentCreditAmount < 12) return true;
        else if(currentCreditAmount > 12) return false;

        return null;
    }
}
