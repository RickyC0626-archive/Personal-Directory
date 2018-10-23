/*  The Person class

    Description: Contains information that every person has
    + Getter and setter methods

    Authors: Ricky Chon, Nick Climaco
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
    private String phoneNumber = "";
    private String email = "";
    private int age;
    private int personalID;

    Person(String address, String dob, String ethnicity, String gender, String firstName, String lastName,
           String maritalStatus, String phoneNumber, String email, int age, int personalID)
    {
        this.address = address;
        this.dob = dob;
        this.ethnicity = ethnicity;
        this.gender = gender;
        this.firstName = firstName;
        this.lastName = lastName;
        this.maritalStatus = maritalStatus;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.age = age;
        this.personalID = personalID;
    }

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

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public String getEmail()
    {
        return email;
    }

    public int getAge()
    {
        return age;
    }

    public int getPersonalID()
    {
        return personalID;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public void setDOB(String dob)
    {
        this.dob = dob;
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

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email)
    {
        this.email = email;
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
