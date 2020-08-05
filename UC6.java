public class UC6 
{
	public static void main(String[] args) 
	{
		final int IS_FULL_TIME = 1;
		final int IS_PART_TIME = 2;
		final int EMP_RATE_PER_HOUR = 20;
		final int WORKING_DAYS = 20;
		final int MAX_HOURS = 100;
		int empHrs = 0;
		int empWage = 0;
		int totalEmpWage = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		while (totalEmpHrs<=MAX_HOURS && totalWorkingDays<WORKING_DAYS) 
		{
			totalWorkingDays++;
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
			System.out.println("Employee Wage is = "+ empWage);
		}
		System.out.println("Total Employee Wage = " + totalEmpWage);
	}

}
