public class calculatorUsingPassTime {
	private int startYearForCalculate, startMonthForCalculate,
			startDateForCalculate, startTimeForCalculate;

	private calculatorUsingPassDate calculatorUsingPassDate;
	private dataForCalculate dataForCalculate;

	public calculatorUsingPassTime() {
		calculatorUsingPassDate = new calculatorUsingPassDate();
		dataForCalculate = new dataForCalculate();
	}

	public void cal(int[] hoursOnOneDay, int inputtedStartYear,
			int inputtedStartMonth, int inputtedStartDate, int inputtedStartTime, int inputtedPassTime) {
		startYearForCalculate = inputtedStartYear;
		startMonthForCalculate = inputtedStartMonth;
		startDateForCalculate = inputtedStartDate;
		startTimeForCalculate = inputtedStartTime;
		
		int increasedPassDate = 0;

		if (inputtedPassTime > 0) {
			if (startTimeForCalculate + inputtedPassTime < 24) {
				startTimeForCalculate = startTimeForCalculate + inputtedPassTime;
			} else if (startTimeForCalculate + inputtedPassTime >= 24) {
				increasedPassDate = (startTimeForCalculate + inputtedPassTime) / 24;
				startTimeForCalculate = (startTimeForCalculate + inputtedPassTime) % 24;
				
				calculatorUsingPassDate.cal(startYearForCalculate, startMonthForCalculate, startDateForCalculate, increasedPassDate);
				
				startYearForCalculate = calculatorUsingPassDate.getCalculatedYearUsingPassDate();
				startMonthForCalculate = calculatorUsingPassDate.getCalculatedMonthUsingPassDate();
				startDateForCalculate = calculatorUsingPassDate.getCalculatedDateUsingPassDate();
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