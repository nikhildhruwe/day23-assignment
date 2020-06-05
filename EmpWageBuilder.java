import java.util.*;

public class EmpWageBuilder implements EmpWageInterface {
   //constants
   public static final int isFullTime=1;
   public static final int isPartTime=2;

	int numOfCompany;
	private ArrayList<companyEmpWage> empWageList;

	public EmpWageBuilder() {

		empWageList =new ArrayList<>();

	}

  public void addCompanyEmpWage(String company,int empRatePerHour,int totalWorkingDays,int maxHrs) {


		companyEmpWage companyEmployeeWage = new companyEmpWage(company,empRatePerHour,totalWorkingDays,maxHrs);
	empWageList.add(companyEmployeeWage);
	}

	public void computeEmpWage(){
	for(int i=0;i<numOfCompany;i++)
		{
		companyEmpWage companyEmployeeWage=empWageList.get(i);
		companyEmployeeWage.setTotalEmpWage(this.computeEmpWage(companyEmployeeWage));
}
		System.out.println(empWageList);

}

	public int computeEmpWage(companyEmpWage companyEmpWage){
   //variables
   int empHrs=0;
   int empWage=0;
   int day=0;
   int totalEmpHrs=0;
   //computation
   while(totalEmpHrs<companyEmpWage.maxHrs && day<companyEmpWage.totalWorkingDays) {
      day++;
      int empCheck = (int)Math.floor(Math.random()*10)%3;
      switch ( empCheck){
               case isFullTime : empHrs=8; break;
               case isPartTime : empHrs=4; break;
               default :         empHrs=0; break;
         }

         totalEmpHrs+=empHrs;
      }

      System.out.println("Days : " +day+", Emp Hrs: "+empHrs);
		return totalEmpHrs*companyEmpWage.empRatePerHour;
   }

   public static void main(String[] args) {

         System.out.println(" Welcome to Employeee Wage Computation ");
			EmpWageInterface empBuilder=new EmpWageBuilder();
			empBuilder.addCompanyEmpWage("Dmart",20,5,40);
			empBuilder.addCompanyEmpWage("Reliance",10,4,30);
			empBuilder.computeEmpWage();
      }
}
