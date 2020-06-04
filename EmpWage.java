class EmpWage {

   public static void main(String[] args) {

   System.out.println(" Welcome to Employeee Wage Computation ");

   //constants
   int isFullTime=1;
   int empRatePerHour=20;

   //variables
   int empHrs=0;
   int empWage=0;
   double empCheck = Math.floor(Math.random()*10)%2;
   if( empCheck == isFullTime){
      System.out.println("Employee Present");
   empHrs=8;
      }
   else {
      System.out.println("Employee Absent");
      empHrs=0;
      }
      empWage = empHrs*empRatePerHour;
      System.out.println("Emp Wage = "+empWage);
   }
}
