public class calTime {
	private int startYearForCalculate, startYearForMonth,
			startDateForCalculate, startTimeForCalculate;

	private data data;
	private calDate calDate;

	public calTime() {
		data = new data();
		calDate = new calDate();
	}

	public void cal(int[] timeDataForCalculate, int inputtedStartYear,
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
				calDate.cal(incresedPassYear, incresedPassMonth,
						startDateForCalculate, incresedPassDate);
				startYearForCalculate = calDate
						.getCalculatedYearUsingPassDate();
				startYearForMonth = calDate.getCalculatedMonthUsingPassDate();
				startDateForCalculate = calDate
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