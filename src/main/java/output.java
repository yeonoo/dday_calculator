package dday_calculator;

public class output {
	public void print(int inputtedStartYear, int inputtedStartMonth,
			int inputtedStartDate, int inputtedPassDate, int inputtedPassTime,
			int calculatedYearUsingPassDate, int calculatedMonthUsingPassDate,
			int calculatedDateUsingPassDate, int calculatedYearUsingPassTime,
			int calculatedMonthUsingPassTime, int calculatedDateUsingPassTime,
			int calcaultedTimeUsingPassTime) {
		System.out.println("========================================");
		System.out.println("��û�Ͻ� ���� ����� ����մϴ�." + "");
		System.out.println("========================================");
		System.out.println("�������� " + inputtedStartYear + "�� "
				+ inputtedStartMonth + "�� " + inputtedStartDate + "���Դϴ�.");
		System.out.println("�����Ϸκ��� " + inputtedPassDate + "��°�� ���� "
				+ calculatedYearUsingPassDate + "�� "
				+ calculatedMonthUsingPassDate + "�� "
				+ calculatedDateUsingPassDate + "���Դϴ�.");
		System.out.println("�����Ϸκ��� " + inputtedPassTime + "�ð�°�� ���� "
				+ calculatedYearUsingPassTime + "�� "
				+ calculatedMonthUsingPassTime + "�� "
				+ calculatedDateUsingPassTime + "�� "
				+ calcaultedTimeUsingPassTime + "���Դϴ�.");
	}
}