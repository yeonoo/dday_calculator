package dday_calculator;

public class data {
	private int numberOfDaysOnYear;
	private int[] numberOfDaysOnMonth, hourOnOneDay;

	public data() {
		numberOfDaysOnMonth = new int[] { 0, 31, 28, 31, 30, 31, 30, 31, 31,
				30, 31, 30, 31 };
		hourOnOneDay = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12,
				13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24 };
	}

	public int getNumberOfDaysOnYear(int startYear) {
		if ((startYear % 4 == 0) && (startYear % 100 != 0)
				|| startYear % 400 == 0) {
			numberOfDaysOnYear = 366;
		} else {
			numberOfDaysOnYear = 365;
		}
		return numberOfDaysOnYear;
	}

	public int[] getNumberOfDaysOnMonth(int startYear) {
		if ((startYear % 4 == 0) && (startYear % 100 != 0)
				|| startYear % 400 == 0) {
			numberOfDaysOnMonth[2] = 29;
		} else {
			numberOfDaysOnMonth[2] = 28;
		}
		return numberOfDaysOnMonth;
	}

	public int[] gethourOnOneDay() {
		return hourOnOneDay;
	}
}