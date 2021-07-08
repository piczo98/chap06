package hiding;

public class MyDate {
	
	// 외부 클래스에서는 접근 불가능한 접근 제어자(access modifier)
	int year;	// 디폴트 접근 제어자, 동일 패키지 내에서만 사용 가능
	private int month;
	private int day;
	
	// private 없으면 default 
	
	

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
		//return값 없음
		
		if(month == 2) {
			if(day < 1 || day > 28) {
				// || <- OR
				System.out.println("날짜 오류");
			
			}
			else {	// 날짜에 오류가 없는 경우
				day = dday;
				printDate();	// 메서드 호출
				
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
