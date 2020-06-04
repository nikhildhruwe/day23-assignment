class EmpWage {

   public static void main(String[] args) {

   System.out.println(" Welcome to Employeee Wage Computation ");

   //constants
   int isFullTime=1;
   int isPartTime=2;
   int empRatePerHour=20;

   //variables
   int empHrs=0;
   int empWage=0;
   //computation
   double empCheck = Math.floor(Math.random()*10)%3;
   if( empCheck == isFullTime){
      empHrs=8;
      }
   else if (empCheck == isPartTime ){
      empHrs=4;
      }
   else {
      System.out.println("Employee Absent");
      empHrs=0;
      }
      empWage = empHrs*empRatePerHour;
      System.out.println("Emp Wage = "+empWage);
   }
}
