public class companyEmpWage{

	private final String company;
	private final int empRatePerHour;
	private final int totalWorkingDays;
	private final int maxHrs;
	private int totalEmpWage;


}
class EmpWageBuilder {
   //constants
   public static final int isFullTime=1;
   public static final int isPartTime=2;


	int numOfCompany = 0;
	private companyEmpWage[] companyEmpWageArray;

	public EmpWageBuilder() {

		companyEmpWageArray =new companyEmpWage[5];

}

  private void addCompanyEmpWage(String company,int empRatePerHour,int totalWorkingDays,int maxHrs) {


		compayEmpWageArray[numOfCompany] = new companyEmpWage(company,empRatePerHour,totalWorkingDays,maxHrs);
		numOfCompany++;
	}

	private void computeEmpWage(){
	for(int i=0;i<numOfCompany;i++) {
		companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpArray[i]));
		System.print.out.ln(companyEmpWageArray[i]);
		}
}

public void setTotalEmpWage(int totalEmpWage){

		this.totalEmpWage=totalEmpWage;
}

	public int computeEmpWage(companyEmpWage companyEmpWage){
   //variables
   int empHrs=0;
   int empWage=0;
   int day=0;
   int totalEmpHrs=0;

   //computation
   while(totalEmpHrs<maxHrs && day<totalWorkingDays) {
      day++;
      int empCheck = (int)Math.floor(Math.random()*10)%3;
      switch ( empCheck){
               case isFullTime : empHrs=8; break;
               case isPartTime : empHrs=4; break;
               default :         empHrs=0; break;
         }

         totalEmpHrs+=empHrs;
      }
       totalEmpWage=totalEmpHrs*empRatePerHour;

      System.out.println("Days : " +day+", Emp Hrs: "+empHrs);
   }

	public String toString(){

		return ("Total Emp Wage for Company : "+company+" is ="+totalEmpWage);
}
   public static void main(String[] args) {

         System.out.println(" Welcome to Employeee Wage Computation ");
			EmpWageBuilder empBuilder=new EmpWageBuilder();
			empBuilder.addCompanyEmpWage("Dmart",20,5,40);
			empBuilder.addCompanyEmpWage("Reliance",10,4,30);
			empBuilder.computeEmpWage();
      }
}
