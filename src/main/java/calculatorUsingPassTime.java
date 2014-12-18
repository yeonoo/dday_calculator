public class calculatorUsingPassTime {
	private int startYearForCalculate, startYearForMonth,
			startDateForCalculate, startTimeForCalculate;

	private dataForCalculate dataForCalculate;
	private calculatorUsingPassDate calculatorUsingPassDate;

	public calculatorUsingPassTime() {
		dataForCalculate = new dataForCalculate();
		calculatorUsingPassDate = new calculatorUsingPassDate();
	}

	public void cal(int[] hoursOnOneDay, int inputtedStartYear,
			int inputtedStartMonth, int inputtedStartDate, int inputtedPassTime) {
		startYearForCalculate = inputtedStartYear;
		startYearForMonth = inputtedStartMonth;
		startDateForCalculate = inputtedStartDate;
		startTimeForCalculate = 0;

		if (inputtedPassTime == 0) {
			startYearForCalculate = startYearForCalculate;
			startYearForMonth = startYearForMonth;
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
				startYearForMonth = calculatorUsingPassDate
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
		return startYearForMonth;
	}

	public int getCalculatedDateUsingPassTime() {
		return startDateForCalculate;
	}

	public int getCalculatedTimeUsingPassTime() {
		return startTimeForCalculate;
	}
}