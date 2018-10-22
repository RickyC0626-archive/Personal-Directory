/*  The Person class

    Description: Contains information about a person

    Authors: Ricky Chon

    Objectives:
    + Gets and sets a person's personal information
*/

public class Person
{
    private String address = "";
    private String dob = "";
    private String ethnicity = "";
    private String gender = "";
    private String firstName = "";
    private String lastName = "";
    private String maritalStatus = "";
    private int age;
    private int personalID;

    public String getAddress()
    {
        return address;
    }

    public String getDOB()
    {
        return dob;
    }

    public String getEthnicity()
    {
        return ethnicity;
    }

    public String getGender()
    {
        return gender;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getFullName()
    {
        return firstName + " " + lastName;
    }

    public String getMaritalStatus()
    {
        return maritalStatus;
    }

    public int getAge()
    {
        return age;
    }

    public int getPersonalID()
    {
        return personalID;
    }

    public void setAddress()
    {

    }

    public void setDOB(String month, int day, int year)
    {
        dateOfBirth = month + " " + day + ", " + year;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public void setMaritalStatus(String maritalStatus)
    {
        this.maritalStatus = maritalStatus;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setPersonalID(int personalID)
    {
        this.personalID = personalID;
    }
}