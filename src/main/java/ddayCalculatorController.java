public class ddayCalculatorController {
	private int inputtedStartYear, inputtedStartMonth, inputtedStartDate,
			inputtedPassDate, inputtedPassTime;
	private int calculatedYearUsingPassdate, calculatedMonthUsingPassDate,
			calculatedDateUsingPassDate;
	private int calculatedYearUsingPassTime, calculatedMonthUsingPassTime,
			calculatedDateUsingPassTime, calculatedTimeUsingPassTime;
	private int[] hourOnOneDay;

	private setDataForCalculate setDataForCalculate;
	private dataForCalculate dataForCalculate;
	private calculatorUsingPassDate calculatorUsingPassDate;
	private calculatorUsingPassTime calculatorUsingPassTime;
	private showCalculatedResult showCalculatedResult;

	public ddayCalculatorController() {
		setDataForCalculate = new setDataForCalculate();
		dataForCalculate = new dataForCalculate();
		calculatorUsingPassDate = new calculatorUsingPassDate();
		calculatorUsingPassTime = new calculatorUsingPassTime();
		showCalculatedResult = new showCalculatedResult();
	}

	public void ctr() {
		setDataForCalculate.inputDataWhatUserWants();

		inputtedStartYear = setDataForCalculate.getInputtedStartYear();
		inputtedStartMonth = setDataForCalculate.getInputtedStartMonth();
		inputtedStartDate = setDataForCalculate.getInputtedStartDate();
		inputtedPassDate = setDataForCalculate.getInputtedPassDate();
		inputtedPassTime = setDataForCalculate.getInputtedPassTime();

		hourOnOneDay = dataForCalculate.gethourOnOneDay();

		calculatorUsingPassDate.cal(inputtedStartYear, inputtedStartMonth,
				inputtedStartDate, inputtedPassDate);
		calculatedYearUsingPassdate = calculatorUsingPassDate
				.getCalculatedYearUsingPassDate();
		calculatedMonthUsingPassDate = calculatorUsingPassDate
				.getCalculatedMonthUsingPassDate();
		calculatedDateUsingPassDate = calculatorUsingPassDate
				.getCalculatedDateUsingPassDate();

		calculatorUsingPassTime.cal(hourOnOneDay, inputtedStartYear,
				inputtedStartMonth, inputtedStartDate, inputtedPassTime);
		calculatedYearUsingPassTime = calculatorUsingPassTime
				.getCalculatedYearUsingPassTime();
		calculatedMonthUsingPassTime = calculatorUsingPassTime
				.getCalculatedMonthUsingPassTime();
		calculatedDateUsingPassTime = calculatorUsingPassTime
				.getCalculatedDateUsingPassTime();
		calculatedTimeUsingPassTime = calculatorUsingPassTime
				.getCalculatedTimeUsingPassTime();

		showCalculatedResult.print(inputtedStartYear, inputtedStartMonth,
				inputtedStartDate, inputtedPassDate, inputtedPassTime,
				calculatedYearUsingPassdate, calculatedMonthUsingPassDate,
				calculatedDateUsingPassDate, calculatedYearUsingPassTime,
				calculatedMonthUsingPassTime, calculatedDateUsingPassTime,
				calculatedTimeUsingPassTime);
	}

	public static void main(String[] args) {
		ddayCalculatorController start = new ddayCalculatorController();
		start.ctr();
	}
}