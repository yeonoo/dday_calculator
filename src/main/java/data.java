public class data {
	private int year_data;
	private int[] month_data, time_data;

	public data() {
		month_data = new int[] { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30,
				31 };
		time_data = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,
				14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24 };
	}

	public int getYearData(int year) {
		if ((year % 4 == 0) && (year % 100 != 0) || year % 400 == 0) {
			year_data = 366;
		} else {
			year_data = 365;
		}
		return year_data;
	}

	public int[] getMonthData(int year) {
		if ((year % 4 == 0) && (year % 100 != 0) || year % 400 == 0) {
			month_data[2] = 29;
		} else {
			month_data[2] = 28;
			;
		}
		return month_data;
	}

	public int[] getTimeData() {
		return time_data;
	}
}