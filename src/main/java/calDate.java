public class calDate {
	private int startYearForCalculate, startMonthForCalculate,
			startDateForCalculate, dTime;

	private data data;

	public calDate() {
		data = new data();
	}

	public void cal(int inputtedStartYear, int inputtedStartMonth,
			int inputtedStartDate, int inputtedPassDate) {
		startYearForCalculate = inputtedStartYear;
		startMonthForCalculate = inputtedStartMonth;
		startDateForCalculate = inputtedStartDate;

		if (startDateForCalculate + inputtedPassDate <= data
				.getNumberOfDaysOnMonth(startYearForCalculate)[startMonthForCalculate]) {
			startDateForCalculate = startDateForCalculate + inputtedPassDate;
		}

		else if (startDateForCalculate + inputtedPassDate > data
				.getNumberOfDaysOnMonth(startYearForCalculate)[startMonthForCalculate]) {
			inputtedPassDate = inputtedPassDate
					- (data.getNumberOfDaysOnMonth(startYearForCalculate)[startMonthForCalculate] - startDateForCalculate);
			startMonthForCalculate++;

			int buf = 0;

			for (int i = startMonthForCalculate; i < 13; i++) {
				buf = buf
						+ data.getNumberOfDaysOnMonth(startYearForCalculate)[i];
			}

			if (inputtedPassDate <= buf) {
				while (inputtedPassDate > data
						.getNumberOfDaysOnMonth(startYearForCalculate)[startMonthForCalculate]) {
					inputtedPassDate = inputtedPassDate
							- (data.getNumberOfDaysOnMonth(startYearForCalculate)[startMonthForCalculate] - startDateForCalculate);
					startMonthForCalculate++;
				}
				startDateForCalculate = inputtedPassDate;
			} else if (inputtedPassDate > buf) {
				inputtedPassDate = inputtedPassDate - buf;
				startYearForCalculate++;
				startMonthForCalculate = 1;
				while (inputtedPassDate >= data
						.getNumberOfDaysOnYear(startYearForCalculate)) {
					inputtedPassDate = inputtedPassDate
							- data.getNumberOfDaysOnYear(startYearForCalculate);
					startYearForCalculate++;
				}
				while (inputtedPassDate > data
						.getNumberOfDaysOnMonth(startYearForCalculate)[startMonthForCalculate]) {
					inputtedPassDate = inputtedPassDate
							- (data.getNumberOfDaysOnMonth(startYearForCalculate)[startMonthForCalculate] - startDateForCalculate);
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