import java.util.*;

public class input {
	private int year, month, date, wDate, wTime;

	private Scanner scan;

	public void setDate() {
		System.out.println("���� ���α׷��Դϴ�.");
		System.out.println("========================================");
		System.out.println("������ �Ǵ� ���� �Է¹޽��ϴ�.");
		System.out.println("========================================");

		scan = new Scanner(System.in);
		System.out.print("���� : ");
		year = scan.nextInt();
		System.out.print("�� : ");
		month = scan.nextInt();
		System.out.print("�� : ");
		date = scan.nextInt();

		System.out.println("========================================");
		System.out.println("�����Ϸκ����� �����/�ð��� �Է¹޽��ϴ�.");
		System.out.println("========================================");
		System.out.print("����° : ");
		wDate = scan.nextInt();
		System.out.print("��ð�° : ");
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