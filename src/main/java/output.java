public class output {
	public void print(int year, int month, int date, int wDate, int wTime,
			int dYear, int dMonth, int dDate, int tYear, int tMonth, int tDate,
			int tTime) {
		System.out.println("========================================");
		System.out.println("요청하신 디데이 결과를 출력합니다." + "");
		System.out.println("========================================");
		System.out.println("기준일은 " + year + "년 " + month + "월 " + date
				+ "일입니다.");
		System.out.println("기준일로부터 " + wDate + "일째인 날은 " + dYear + "년 "
				+ dMonth + "월 " + dDate + "일입니다.");
		System.out.println("기준일로부터 " + wTime + "시간째인 날은 " + tYear + "년 "
				+ tMonth + "월 " + tDate + "일 " + tTime + "시입니다.");
	}
}