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
    private String firstname = "";
    private String lastname = "";
    private String maritalstatus = "";
    private int age;
    private int id;

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
        return firstname;
    }

    public String getLastName()
    {
        return lastname;
    }

    public String getFullName()
    {
        return firstname + " " + lastname;
    }

    public String getMaritalStatus()
    {
        return maritalstatus;
    }

    public int getAge()
    {
        return age;
    }

    public int getID()
    {
        return id;
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

    public void setFirstName(String firstname)
    {
        this.firstname = firstname;
    }

    public void setLastName(String lastname)
    {
        this.lastname = lastname;
    }

    public void setMaritalStatus(String maritalstatus)
    {
        this.maritalstatus = maritalstatus;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setID(int id)
    {
        this.id = id;
    }
}
