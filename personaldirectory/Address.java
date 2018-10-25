/* The Address class

   Description: The address class will ensure that a person's address is
   in the correct format, and tells the person if any essential information
   is not filled out

   Authors: Ricky Chon

   Objectives:
   */
import java.util.HashMap;
public class Address  {
  private int stNum = 0;
  private String stName = "";
  private String city = "";
  private String state = "";
  private int zipCode = 0;

  public int getStNum()  {
    return strNum;
  }
  public String getStName()  {
    return strName;
  }
  public String getCity()  {
    return city;
  }
  public String getState()  {
    HashMap<String, String> states = new HashMap<String, String>();
    states.put("Alabama","AL");
    states.put("Alaska","AK");
    states.put("American Samoa","AS");
    states.put("Arizona","AZ");
    states.put("Arkansas","AR");
    states.put("Armed Forces (AE)","AE");
    states.put("Armed Forces Americas","AA");
    states.put("Armed Forces Pacific","AP");
    states.put("California","CA");
    states.put("Colorado","CO");
    states.put("Connecticut","CT");
    states.put("Delaware","DE");
    states.put("District Of Columbia","DC");
    states.put("Florida","FL");
    states.put("Georgia","GA");
    states.put("Guam","GU");
    states.put("Hawaii","HI");
    states.put("Idaho","ID");
    states.put("Illinois","IL");
    states.put("Indiana","IN");
    states.put("Iowa","IA");
    states.put("Kansas","KS");
    states.put("Kentucky","KY");
    states.put("Louisiana","LA");
    states.put("Maine","ME");
    states.put("Maryland","MD");
    states.put("Massachusetts","MA");
    states.put("Michigan","MI");
    states.put("Minnesota","MN");
    states.put("Mississippi","MS");
    states.put("Missouri","MO");
    states.put("Montana","MT");
    states.put("Nebraska","NE");
    states.put("Nevada","NV");
    states.put("New Hampshire","NH");
    states.put("New Jersey","NJ");
    states.put("New Mexico","NM");
    states.put("New York","NY");
    states.put("North Carolina","NC");
    states.put("North Dakota","ND");
    states.put("Ohio","OH");
    states.put("Oklahoma","OK");
    states.put("Oregon","OR");
    states.put("Pennsylvania","PA");
    states.put("Puerto Rico","PR");
    states.put("Rhode Island","RI");
    states.put("South Carolina","SC");
    states.put("South Dakota","SD");
    states.put("Tennessee","TN");
    states.put("Texas","TX");
    states.put("Utah","UT");
    states.put("Vermont","VT");
    states.put("Virgin Islands","VI");
    states.put("Virginia","VA");
    states.put("Washington","WA");
    states.put("West Virginia","WV");
    states.put("Wisconsin","WI");
    states.put("Wyoming","WY");
    if (state.length() == 2)
      return state.toUpperCase();
        else
          return states.get(state); //bug: input is case sensitive. find a way to remove case sensitivity
  }
  public int getZipCode() {
    return zipCode;
  }
  public void setStNum(int strNum)  {
    this.strNum = strNum;
  }
  public void setStName(String strName)  {
    this.strName = strName;
  }
  public void setCity(String city)  {
    this.city = city;
  }
  public void setState(String state) {
    this.state = state;
  }
  public void setZipCode(int zipCode) {
    this.zipCode = zipCode;
  }
  public String toString() {
    return strNum + " " + strName + " " + city + ", " + state + " " + zipCode;
  }
}
