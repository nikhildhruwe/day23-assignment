public class companyEmpWage{

   public final String company;
   public final int empRatePerHour;
   public final int totalWorkingDays;
   public final int maxHrs;
   public int totalEmpWage;


  public companyEmpWage(String company,int empRatePerHour,int totalWorkingDays,int maxHrs) {

      this.company=company;
      this.totalWorkingDays=totalWorkingDays;
      this.maxHrs=maxHrs;
      this.empRatePerHour=empRatePerHour;
		totalEmpWage=0;
   }

   public void setTotalEmpWage(int totalEmpWage){

      this.totalEmpWage=totalEmpWage;
   }

   public String toString(){

      return "Total Emp Wage for Company : "+company+" is ="+totalEmpWage;
   }

}
