public interface EmpWageInterface
{

 	public void addCompanyEmpWage(String company,int empRatePerHour,int totalWorkingDays,int maxHrs);
	public void computeEmpWage();
	public int getTotalWage(String company);
}
