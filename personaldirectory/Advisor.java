/* The Advisor Class

   Description: Contains information about an advisor
   in the college's directory

   Authors: Ricky Chon, Nick Climaco, ZeJun Ren
*/

public class Advisor extends Person {
  private String department;
  private boolean isAcademicAdvisor;
  private boolean isIndustryAdvisor;
  private int yearsAsAdvisor;
  private Student[] students;
  private String officeHoursStart;
  private String officeHoursEnd;

  public Advisor(String department, boolean isAcademicAdvisor, boolean isIndustryAdvisor, int yearsAsAdvisor) {
    super();
    this.department = department;
    this.isAcademicAdvisor = isAcademicAdvisor;
    this.isIndustryAdvisor = isIndustryAdvisor;
    this.yearsAsAdvisor = yearsAsAdvisor;
  }
  public String getDepartment() {
    return department;
  }
  public boolean getIsAcademicAdvisor() {
    return isAcademicAdvisor;
  }
  public boolean getIsIndustryAdvisor() {
    return isIndustryAdvisor;
  }
  public int getYearAsAdvisor() {
    return yearsAsAdvisor;
  }
  public void setDepartment(String department) {
    this.department = department;
  }
  public void setIsAcademicAdvisor(boolean isAcademicAdvisor) {
    this.isAcademicAdvisor = isAcademicAdvisor;
  }
  public void setIsIndustryAdvisor(boolean isIndustryAdvisor) {
    this.isIndustryAdvisor = isIndustryAdvisor;
  }
  public void setYearAsAdvisor(int yearsAsAdvisor) {
    this.yearsAsAdvisor = yearsAsAdvisor;
  }
}
