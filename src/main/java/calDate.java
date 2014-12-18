public class calDate {
	private int dYear, dMonth, dDate, dTime;

	private data data;

	public calDate() {
		data = new data();
	}

	public void cal(int year, int month, int date, int wDate) {
		dYear = year;
		dMonth = month;
		dDate = date;

		if (dDate + wDate <= data.getMonthData(dYear)[dMonth]) {
			dDate = dDate + wDate;
		}

		else if (dDate + wDate > data.getMonthData(dYear)[dMonth]) {
			wDate = wDate - (data.getMonthData(dYear)[dMonth] - dDate);
			dMonth++;

			int buf = 0;

			for (int i = dMonth; i < 13; i++) {
				buf = buf + data.getMonthData(dYear)[i];
			}

			if (wDate <= buf) {
				while (wDate > data.getMonthData(dYear)[dMonth]) {
					wDate = wDate - (data.getMonthData(dYear)[dMonth] - dDate);
					dMonth++;
				}
				dDate = wDate;
			} else if (wDate > buf) {
				wDate = wDate - buf;
				dYear++;
				dMonth = 1;
				while (wDate >= data.getYearData(dYear)) {
					wDate = wDate - data.getYearData(dYear);
					dYear++;
				}
				while (wDate > data.getMonthData(dYear)[dMonth]) {
					wDate = wDate - (data.getMonthData(dYear)[dMonth] - dDate);
					dMonth++;
				}
				dDate = wDate;
			}
		}
	}

	public int getYear() {
		return dYear;
	};

	public int getMonth() {
		return dMonth;
	};

	public int getDate() {
		return dDate;
	};
}