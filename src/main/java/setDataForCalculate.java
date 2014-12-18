package dday_calculator;

import java.util.*;

public class setDataForCalculate {
	private int startYear, startMonth, startDate, passDate, passTime;

	private Scanner scan;

	public void inputDataWhatUserWants() {
		System.out.println("디데이 프로그램입니다.");
		System.out.println("========================================");
		System.out.println("기준이 되는 날을 입력받습니다.");
		System.out.println("========================================");

		scan = new Scanner(System.in);
		System.out.print("연도 : ");
		startYear = scan.nextInt();
		System.out.print("월 : ");
		startMonth = scan.nextInt();
		System.out.print("일 : ");
		startDate = scan.nextInt();

		System.out.println("========================================");
		System.out.println("기준일로부터의 경과일/시간을 입력받습니다.");
		System.out.println("========================================");
		System.out.print("몇일째 : ");
		passDate = scan.nextInt();
		System.out.print("몇시간째 : ");
		passTime = scan.nextInt();
	}

	public int getInputtedStartYear() {
		return startYear;
	}

	public int getInputtedStartMonth() {
		return startMonth;
	}

	public int getInputtedStartDate() {
		return startDate;
	}

	public int getInputtedPassDate() {
		return passDate;
	}

	public int getInputtedPassTime() {
		return passTime;
	}
}