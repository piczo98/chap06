package exercise;

public class MyDate {
	
	private int day;
	private int month;
	private int year;
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public MyDate(int dday, int mmonth, int yyear) {
		
		day = dday;
		month = mmonth;
		year = yyear;
		
	}
	
	public boolean isVaild() {
		if (month < 1 || month >12 ) {
			System.out.println("유효하지 않은 날짜입니다");
			return false;
		} else if (month == 2) {
			if (year % 4 == 0 && year % 100 != 0) {
				if(year % 400 == 0)
					if (day == 29) {
						System.out.println("유효한 날짜 입니다.");
						return true;
						}
				} else if (day < 1 || day > 28) {
				System.out.println("유효하지 않은 날짜입니다.");
				return false;
			} else {
				System.out.println("유효한 날짜입니다.");
				return true;
			}
			
		} else 
			System.out.println("유효한 날짜입니다.");
			return true;  
		
		
	}
}
		
		
		
	
	
	
	

