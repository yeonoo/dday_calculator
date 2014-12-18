import java.util.*;

public class input {
	private int year, month, date, wDate, wTime;

	private Scanner scan;

	public void setDate() {
		System.out.println("디데이 프로그램입니다.");
		System.out.println("========================================");
		System.out.println("기준이 되는 날을 입력받습니다.");
		System.out.println("========================================");

		scan = new Scanner(System.in);
		System.out.print("연도 : ");
		year = scan.nextInt();
		System.out.print("월 : ");
		month = scan.nextInt();
		System.out.print("일 : ");
		date = scan.nextInt();

		System.out.println("========================================");
		System.out.println("기준일로부터의 경과일/시간을 입력받습니다.");
		System.out.println("========================================");
		System.out.print("몇일째 : ");
		wDate = scan.nextInt();
		System.out.print("몇시간째 : ");
		wTime = scan.nextInt();
	}

	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDate() {
		return date;
	}

	public int get_wDate() {
		return wDate;
	}

	public int get_wTime() {
		return wTime;
	}
}