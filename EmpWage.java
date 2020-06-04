class EmpWage {

   public static void main(String[] args) {

   System.out.println(" Welcome to Employee Wage Computation ");

   //constants
   int isFullTime=1;
      //computations
   double empCheck = Math.floor(Math.random()*10)%2;
   if( empCheck == isFullTime)
      System.out.println("Employee Present");
   else
      System.out.println("Employee Absent");

   }
}
