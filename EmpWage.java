class EmpWage {
   //constants
   public static final int isFullTime=1;
   public static final int isPartTime=2;

	private final String company;
	private final int empRatePerHour;
	private final int totalWorkingDays;
	private final int maxHrs;
	private int totalEmpWage;

   public EmpWage(String company,int empRatePerHour,int totalWorkingDays,int maxHrs) {

		this.company=company;
		this.totalWorkingDays=totalWorkingDays;
		this.maxHrs=maxHrs;
		this.empRatePerHour=empRatePerHour;
	}

	public void computeEmpWage(){
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
			EmpWage bigBazar=new EmpWage("bigBazar",20,5,40);
			EmpWage dMart=new EmpWage("D-Mart",15,5,30);
			bigBazar.computeEmpWage();
			System.out.println(bigBazar);
			dMart.computeEmpWage();
			System.out.println(dMart);
      }
}
