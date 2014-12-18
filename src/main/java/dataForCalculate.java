public class dataForCalculate {
	private int numberOfDaysOnYear;
	private int[] numberOfDaysOnMonth;

	public dataForCalculate() {
		numberOfDaysOnMonth = new int[] { 0, 31, 28, 31, 30, 31, 30, 31, 31,
				30, 31, 30, 31 }; // ����� ���Ǹ� ���� 0��°�� 0�� �߰�
	}

	public int getNumberOfDaysOnYear(int startYear) {
		if ((startYear % 4 == 0) && (startYear % 100 != 0)
				|| startYear % 400 == 0) {
			numberOfDaysOnYear = 366; // ����
		} else {
			numberOfDaysOnYear = 365;
		}
		return numberOfDaysOnYear;
	}

	public int[] getNumberOfDaysOnMonth(int startYear) {
		if ((startYear % 4 == 0) && (startYear % 100 != 0)
				|| startYear % 400 == 0) {
			numberOfDaysOnMonth[2] = 29; // ���� 2��
		} else {
			numberOfDaysOnMonth[2] = 28;
		}
		return numberOfDaysOnMonth;
	}
}