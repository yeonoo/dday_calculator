public class output {
	public void print(int year, int month, int date, int wDate, int wTime,
			int dYear, int dMonth, int dDate, int tYear, int tMonth, int tDate,
			int tTime) {
		System.out.println("========================================");
		System.out.println("��û�Ͻ� ���� ����� ����մϴ�." + "");
		System.out.println("========================================");
		System.out.println("�������� " + year + "�� " + month + "�� " + date
				+ "���Դϴ�.");
		System.out.println("�����Ϸκ��� " + wDate + "��°�� ���� " + dYear + "�� "
				+ dMonth + "�� " + dDate + "���Դϴ�.");
		System.out.println("�����Ϸκ��� " + wTime + "�ð�°�� ���� " + tYear + "�� "
				+ tMonth + "�� " + tDate + "�� " + tTime + "���Դϴ�.");
	}
}