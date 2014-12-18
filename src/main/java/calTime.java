public class calTime {
	private int tYear, tMonth, tDate, tTime;

	private data data;
	private calDate calDate;

	public calTime() {
		data = new data();
		calDate = new calDate();
	}

	public void cal(int[] time_data, int year, int month, int date, int wTime) {
		tYear = year;
		tMonth = month;
		tDate = date;
		tTime = 0;

		if (wTime == 0) {
			tYear = tYear;
			tMonth = tMonth;
			tDate = tDate;
			tTime = tTime;
		} else if (wTime > 0) {
			if (wTime < 24) {
				tTime = wTime;
			} else if (wTime >= 24) {
				int pDate = wTime / 24;
				int pMonth = 1;
				int pYear = tYear;
				calDate.cal(pYear, pMonth, tDate, pDate);
				tYear = calDate.getYear();
				tMonth = calDate.getMonth();
				tDate = calDate.getDate();
				tTime = wTime % 24;
			}
		}
	}

	public int getYear() {
		return tYear;
	}

	public int getMonth() {
		return tMonth;
	}

	public int getDate() {
		return tDate;
	}

	public int getTime() {
		return tTime;
	}
}