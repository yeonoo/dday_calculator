public class dataForCalculate {
	private int numberOfDaysOnYear;
	private int[] numberOfDaysOnMonth;

	public dataForCalculate() {
		numberOfDaysOnMonth = new int[] { 0, 31, 28, 31, 30, 31, 30, 31, 31,
				30, 31, 30, 31 }; // 계산의 편의를 위해 0번째에 0일 추가
	}

	public int getNumberOfDaysOnYear(int startYear) {
		if ((startYear % 4 == 0) && (startYear % 100 != 0)
				|| startYear % 400 == 0) {
			numberOfDaysOnYear = 366; // 윤년
		} else {
			numberOfDaysOnYear = 365;
		}
		return numberOfDaysOnYear;
	}

	public int[] getNumberOfDaysOnMonth(int startYear) {
		if ((startYear % 4 == 0) && (startYear % 100 != 0)
				|| startYear % 400 == 0) {
			numberOfDaysOnMonth[2] = 29; // 윤년 2월
		} else {
			numberOfDaysOnMonth[2] = 28;
		}
		return numberOfDaysOnMonth;
	}
}