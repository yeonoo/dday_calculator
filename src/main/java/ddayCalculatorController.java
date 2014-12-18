public class ddayCalculatorController {
	private int inputtedStartYear, inputtedStartMonth, inputtedStartDate, inputtedStartTime,
			inputtedPassDate, inputtedPassTime;
	private int calculatedYearUsingPassdate, calculatedMonthUsingPassDate,
			calculatedDateUsingPassDate;
	private int calculatedYearUsingPassTime, calculatedMonthUsingPassTime,
			calculatedDateUsingPassTime, calculatedTimeUsingPassTime;

	private setDataForCalculate setDataForCalculate;
	private calculatorUsingPassDate calculatorUsingPassDate;
	private calculatorUsingPassTime calculatorUsingPassTime;
	private showCalculatedResult showCalculatedResult;

	public ddayCalculatorController() {
		setDataForCalculate = new setDataForCalculate();
		calculatorUsingPassDate = new calculatorUsingPassDate();
		calculatorUsingPassTime = new calculatorUsingPassTime();
		showCalculatedResult = new showCalculatedResult();
	}

	public void ctr() {
		setDataForCalculate.inputDataWhatUserWants();

		inputtedStartYear = setDataForCalculate.getInputtedStartYear();
		inputtedStartMonth = setDataForCalculate.getInputtedStartMonth();
		inputtedStartDate = setDataForCalculate.getInputtedStartDate();
		inputtedStartTime = setDataForCalculate.getInputtedStartTime();
		inputtedPassDate = setDataForCalculate.getInputtedPassDate();
		inputtedPassTime = setDataForCalculate.getInputtedPassTime();

		calculatorUsingPassDate.cal(inputtedStartYear, inputtedStartMonth,
				inputtedStartDate, inputtedPassDate);
		calculatedYearUsingPassdate = calculatorUsingPassDate
				.getCalculatedYearUsingPassDate();
		calculatedMonthUsingPassDate = calculatorUsingPassDate
				.getCalculatedMonthUsingPassDate();
		calculatedDateUsingPassDate = calculatorUsingPassDate
				.getCalculatedDateUsingPassDate();

		calculatorUsingPassTime.cal(inputtedStartYear,
				inputtedStartMonth, inputtedStartDate, inputtedStartTime, inputtedPassTime);
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