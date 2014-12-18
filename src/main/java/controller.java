public class controller {
	private int inputtedStartYear, inputtedStartMonth, inputtedStartDate,
			inputtedPassDate, inputtedPassTime;
	private int calculatedYearUsingPassdate, calculatedMonthUsingPassDate,
			calculatedDateUsingPassDate;
	private int calculatedYearUsingPassTime, calculatedMonthUsingPassTime,
			calculatedDateUsingPassTime, calculatedTimeUsingPassTime;
	private int numberOfDaysOnYear;
	private int[] numberOfDaysOnMonth, hourOnOneDay;

	private input input;
	private data data;
	private calDate calDate;
	private calTime calTime;
	private output output;

	public controller() {
		input = new input();
		data = new data();
		calDate = new calDate();
		calTime = new calTime();
		output = new output();
	}

	public void ctr() {
		input.inputDataWhatUserWants();

		inputtedStartYear = input.getInputtedStartYear();
		inputtedStartMonth = input.getInputtedStartMonth();
		inputtedStartDate = input.getInputtedStartDate();
		inputtedPassDate = input.getInputtedPassDate();
		inputtedPassTime = input.getInputtedPassTime();

		hourOnOneDay = data.gethourOnOneDay();

		calDate.cal(inputtedStartYear, inputtedStartMonth, inputtedStartDate,
				inputtedPassDate);
		calculatedYearUsingPassdate = calDate.getCalculatedYearUsingPassDate();
		calculatedMonthUsingPassDate = calDate
				.getCalculatedMonthUsingPassDate();
		calculatedDateUsingPassDate = calDate.getCalculatedDateUsingPassDate();

		calTime.cal(hourOnOneDay, inputtedStartYear, inputtedStartMonth,
				inputtedStartDate, inputtedPassTime);
		calculatedYearUsingPassTime = calTime.getCalculatedYearUsingPassTime();
		calculatedMonthUsingPassTime = calTime
				.getCalculatedMonthUsingPassTime();
		calculatedDateUsingPassTime = calTime.getCalculatedDateUsingPassTime();
		calculatedTimeUsingPassTime = calTime.getCalculatedTimeUsingPassTime();

		output.print(inputtedStartYear, inputtedStartMonth, inputtedStartDate,
				inputtedPassDate, inputtedPassTime,
				calculatedYearUsingPassdate, calculatedMonthUsingPassDate,
				calculatedDateUsingPassDate, calculatedYearUsingPassTime,
				calculatedMonthUsingPassTime, calculatedDateUsingPassTime,
				calculatedTimeUsingPassTime);
	}

	public static void main(String[] args) {
		controller start = new controller();
		start.ctr();
	}
}