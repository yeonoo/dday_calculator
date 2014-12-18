public class calculatorUsingPassTime {
	private int startYearForCalculate, startMonthForCalculate,
			startDateForCalculate, startTimeForCalculate;

	private calculatorUsingPassDate calculatorUsingPassDate;

	public calculatorUsingPassTime() {
		calculatorUsingPassDate = new calculatorUsingPassDate();
	}

	public void cal(int[] hoursOnOneDay, int inputtedStartYear,
			int inputtedStartMonth, int inputtedStartDate, int inputtedStartTime, int inputtedPassTime) {
		startYearForCalculate = inputtedStartYear;
		startMonthForCalculate = inputtedStartMonth;
		startDateForCalculate = inputtedStartDate;
		startTimeForCalculate = inputtedStartTime;

		if (inputtedPassTime == 0) {
			startYearForCalculate = startYearForCalculate;
			startMonthForCalculate = startMonthForCalculate;
			startDateForCalculate = startDateForCalculate;
			startTimeForCalculate = startTimeForCalculate;
		} else if (inputtedPassTime > 0) {
			if (inputtedPassTime < 24) {
				startTimeForCalculate = inputtedPassTime;
			} else if (inputtedPassTime >= 24) {
				int incresedPassDate = inputtedPassTime / 24;
				int incresedPassMonth = 1;
				int incresedPassYear = startYearForCalculate;
				calculatorUsingPassDate.cal(incresedPassYear,
						incresedPassMonth, startDateForCalculate,
						incresedPassDate);
				startYearForCalculate = calculatorUsingPassDate
						.getCalculatedYearUsingPassDate();
				startMonthForCalculate = calculatorUsingPassDate
						.getCalculatedMonthUsingPassDate();
				startDateForCalculate = calculatorUsingPassDate
						.getCalculatedDateUsingPassDate();
				startTimeForCalculate = inputtedPassTime % 24;
			}
		}
	}
	
	public int getCalculatedYearUsingPassTime() {
		return startYearForCalculate;
	}

	public int getCalculatedMonthUsingPassTime() {
		return startMonthForCalculate;
	}

	public int getCalculatedDateUsingPassTime() {
		return startDateForCalculate;
	}

	public int getCalculatedTimeUsingPassTime() {
		return startTimeForCalculate;
	}
}