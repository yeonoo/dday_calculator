public class calculatorUsingPassDate {
	private int startYearForCalculate, startMonthForCalculate,
			startDateForCalculate, dTime;

	private dataForCalculate dataForCalculate;

	public calculatorUsingPassDate() {
		dataForCalculate = new dataForCalculate();
	}

	public void cal(int inputtedStartYear, int inputtedStartMonth,
			int inputtedStartDate, int inputtedPassDate) {
		startYearForCalculate = inputtedStartYear;
		startMonthForCalculate = inputtedStartMonth;
		startDateForCalculate = inputtedStartDate;

		if (startDateForCalculate + inputtedPassDate <= dataForCalculate
				.getNumberOfDaysOnMonth(startYearForCalculate)[startMonthForCalculate]) {
			startDateForCalculate = startDateForCalculate + inputtedPassDate;
		}

		else if (startDateForCalculate + inputtedPassDate > dataForCalculate
				.getNumberOfDaysOnMonth(startYearForCalculate)[startMonthForCalculate]) {
			inputtedPassDate = inputtedPassDate
					- (dataForCalculate
							.getNumberOfDaysOnMonth(startYearForCalculate)[startMonthForCalculate] - startDateForCalculate);
			startMonthForCalculate++;

			int buf = 0;

			for (int i = startMonthForCalculate; i < 13; i++) {
				buf = buf
						+ dataForCalculate
								.getNumberOfDaysOnMonth(startYearForCalculate)[i];
			}

			if (inputtedPassDate <= buf) {
				while (inputtedPassDate > dataForCalculate
						.getNumberOfDaysOnMonth(startYearForCalculate)[startMonthForCalculate]) {
					inputtedPassDate = inputtedPassDate
							- (dataForCalculate
									.getNumberOfDaysOnMonth(startYearForCalculate)[startMonthForCalculate] - startDateForCalculate);
					startMonthForCalculate++;
				}
				startDateForCalculate = inputtedPassDate;
			} else if (inputtedPassDate > buf) {
				inputtedPassDate = inputtedPassDate - buf;
				startYearForCalculate++;
				startMonthForCalculate = 1;
				while (inputtedPassDate >= dataForCalculate
						.getNumberOfDaysOnYear(startYearForCalculate)) {
					inputtedPassDate = inputtedPassDate
							- dataForCalculate
									.getNumberOfDaysOnYear(startYearForCalculate);
					startYearForCalculate++;
				}
				while (inputtedPassDate > dataForCalculate
						.getNumberOfDaysOnMonth(startYearForCalculate)[startMonthForCalculate]) {
					inputtedPassDate = inputtedPassDate
							- (dataForCalculate
									.getNumberOfDaysOnMonth(startYearForCalculate)[startMonthForCalculate] - startDateForCalculate);
					startMonthForCalculate++;
				}
				startDateForCalculate = inputtedPassDate;
			}
		}
	}

	public int getCalculatedYearUsingPassDate() {
		return startYearForCalculate;
	};

	public int getCalculatedMonthUsingPassDate() {
		return startMonthForCalculate;
	};

	public int getCalculatedDateUsingPassDate() {
		return startDateForCalculate;
	};
}