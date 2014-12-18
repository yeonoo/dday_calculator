package dday_calculator;

public class output {
	public void print(int inputtedStartYear, int inputtedStartMonth,
			int inputtedStartDate, int inputtedPassDate, int inputtedPassTime,
			int calculatedYearUsingPassDate, int calculatedMonthUsingPassDate,
			int calculatedDateUsingPassDate, int calculatedYearUsingPassTime,
			int calculatedMonthUsingPassTime, int calculatedDateUsingPassTime,
			int calcaultedTimeUsingPassTime) {
		System.out.println("========================================");
		System.out.println("요청하신 디데이 결과를 출력합니다." + "");
		System.out.println("========================================");
		System.out.println("기준일은 " + inputtedStartYear + "년 "
				+ inputtedStartMonth + "월 " + inputtedStartDate + "일입니다.");
		System.out.println("기준일로부터 " + inputtedPassDate + "일째인 날은 "
				+ calculatedYearUsingPassDate + "년 "
				+ calculatedMonthUsingPassDate + "월 "
				+ calculatedDateUsingPassDate + "일입니다.");
		System.out.println("기준일로부터 " + inputtedPassTime + "시간째인 날은 "
				+ calculatedYearUsingPassTime + "년 "
				+ calculatedMonthUsingPassTime + "월 "
				+ calculatedDateUsingPassTime + "일 "
				+ calcaultedTimeUsingPassTime + "시입니다.");
	}
}