 class EmpWage {

   //constants
   public static final int isFullTime=1;
   public static final int isPartTime=2;
   public static final int empRatePerHour=20;
   public static final int totalWorkingDays=20;
   public static final int maxHrs=100;

   public static void main(String[] args) {

   System.out.println(" Welcome to Employeee Wage Computation ");

   //variables
   int empHrs=0;
   int empWage=0;
   int totalEmpWage=0;
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

      System.out.println("Total Emp Wage = "+totalEmpWage);
   }
}

