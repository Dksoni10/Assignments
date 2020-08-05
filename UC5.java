public class UC5 
{
	public static void main(String[] args) 
	{
		final int IS_FULL_TIME = 1;
		final int IS_PART_TIME = 2;
		final int EMP_RATE_PER_HOUR = 20;
		final int WORKING_DAYS = 20;
		int empHrs = 0;
		int empWage = 0;
		int totalEmpWage = 0;
		for (int day = 0; day <= WORKING_DAYS; day++) 
		{
			double empCheck = Math.floor(Math.random() * 10) % 3;
			switch ((int) empCheck) {
			case IS_PART_TIME:
				empHrs = 4;
				break;
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			empWage = empHrs * EMP_RATE_PER_HOUR;
			totalEmpWage += empWage;
			System.out.println("Employee Wage on day= " + day + " is : " + empWage);
		}
		System.out.println("Employee Wage = " + totalEmpWage);
	}
}
