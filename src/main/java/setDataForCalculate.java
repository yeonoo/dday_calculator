import java.util.*;

public class setDataForCalculate {
	private int startYear, startMonth, startDate, passDate, passTime;

	private Scanner scan;

	public void inputDataWhatUserWants() {
		System.out.println("- ���� ���α׷� -");
		System.out.println("������ �Ǵ� ���� �Է¹޽��ϴ�.");

		scan = new Scanner(System.in);
		System.out.print("���� : ");
		startYear = scan.nextInt();
		System.out.print("�� : ");
		startMonth = scan.nextInt();
		System.out.print("�� : ");
		startDate = scan.nextInt();

		System.out.println("�����Ϸκ����� ���ϰ��� �ϴ� �����/�ð��� �Է¹޽��ϴ�.");
		System.out.print("����� : ");
		passDate = scan.nextInt();
		System.out.print("����ð� : ");
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