public class calculatorUsingPassDate {
	private int startYearForCalculate, startMonthForCalculate,
			startDateForCalculate, passDateForCalculate;

	private dataForCalculate dataForCalculate;

	public calculatorUsingPassDate() {
		dataForCalculate = new dataForCalculate();
	}

	public void cal(int inputtedStartYear, int inputtedStartMonth,
			int inputtedStartDate, int inputtedPassDate) {
		startYearForCalculate = inputtedStartYear;
		startMonthForCalculate = inputtedStartMonth;
		startDateForCalculate = inputtedStartDate;
		passDateForCalculate = inputtedPassDate;

		while (passDateForCalculate > dataForCalculate.getNumberOfDaysOnYear(startYearForCalculate)) {
			passDateForCalculate = passDateForCalculate - dataForCalculate.getNumberOfDaysOnYear(startYearForCalculate);
			startYearForCalculate++;
		}
		
		while (passDateForCalculate > dataForCalculate.getNumberOfDaysOnMonth(startYearForCalculate)[startMonthForCalculate]) {
			passDateForCalculate = passDateForCalculate - dataForCalculate.getNumberOfDaysOnMonth(startYearForCalculate)[startMonthForCalculate];
			startMonthForCalculate++;
		}
	}

	public int getCalculatedYearUsingPassDate() {
		return startYearForCalculate;
	};

	public int getCalculatedMonthUsingPassDate() {
		return startMonthForCalculate;
	};

	public int getCalculatedDateUsingPassDate() {
		return passDateForCalculate;
	};
}