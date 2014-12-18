public class controller {
	private int year, month, date, wDate, wTime;
	private int dYear, dMonth, dDate;
	private int tYear, tMonth, tDate, tTime;
	private int year_data;
	private int[] month_data, time_data;

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
		input.setDate();

		year = input.getYear();
		month = input.getMonth();
		date = input.getDate();
		wDate = input.get_wDate();
		wTime = input.get_wTime();

		time_data = data.getTimeData();

		calDate.cal(year, month, date, wDate);
		dYear = calDate.getYear();
		dMonth = calDate.getMonth();
		dDate = calDate.getDate();

		calTime.cal(time_data, year, month, date, wTime);
		tYear = calTime.getYear();
		tMonth = calTime.getMonth();
		tDate = calTime.getDate();
		tTime = calTime.getTime();

		output.print(year, month, date, wDate, wTime, dYear, dMonth, dDate,
				tYear, tMonth, tDate, tTime);
	}

	public static void main(String[] args) {
		controller start = new controller();
		start.ctr();
	}
}