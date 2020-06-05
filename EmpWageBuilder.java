import java.util.*;

public class EmpWageBuilder implements EmpWageInterface {
   //constants
   public static final int isFullTime=1;
   public static final int isPartTime=2;
//	int totalEmpWage;
	private	int numOfCompany=0;
	private LinkedList<companyEmpWage> empWageList;
	private Map<String, companyEmpWage> companyMap;

	public EmpWageBuilder() {

		empWageList =new LinkedList<companyEmpWage>();
		companyMap=new HashMap<String,companyEmpWage>();

	}

  public void addCompanyEmpWage(String company,int empRatePerHour,int totalWorkingDays,int maxHrs) {


		companyEmpWage companyEmployeeWage = new companyEmpWage(company,empRatePerHour,totalWorkingDays,maxHrs);
		empWageList.add(companyEmployeeWage);
		companyMap.put(company,companyEmployeeWage);
	}

	public void computeEmpWage(){
	for(int i=0;i<empWageList.size();i++)
		{
		companyEmpWage companyEmpWage=empWageList.get(i);
		companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
//		System.out.println(companyMap.get(companyEmpWage.COMPANY));
		System.out.println(companyEmpWage);
}
}

	public int getTotalWage(String company){

	return companyMap.get(company).totalEmpWage;
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
			System.out.println("Monthly Employee wage of Dmart is Rs. "+empBuilder.getTotalWage("Dmart"));
			System.out.println("Monthly Employee wage of Relience Fresh is Rs. "+empBuilder.getTotalWage("Reliance"));
     }
}
