package hiding;

public class MyDate {
	
	// �ܺ� Ŭ���������� ���� �Ұ����� ���� ������(access modifier)
	int year;	// ����Ʈ ���� ������, ���� ��Ű�� �������� ��� ����
	private int month;
	private int day;
	
	// private ������ default 
	
	

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}
	
	void setDay(int dday) {
		//return�� ����
		
		if(month == 2) {
			if(day < 1 || day > 28) {
				// || <- OR
				System.out.println("��¥ ����");
			
			}
			else {	// ��¥�� ������ ���� ���
				day = dday;
				printDate();	// �޼��� ȣ��
				
			}
			
			
		}
		if (month != 2) {
			day = dday;
			printDate();
		}
	}
	void printDate() {
		System.out.println(year+" - "+month+" - " +day);
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
