package exercise;

import java.util.Calendar;

public class mimic {

	private int day;
	private int month;
	private int year;
	private boolean isValid = true;
	
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
		if(year > Calendar.getInstance().get(Calendar.YEAR)) {
			isValid = false;
		} else {
			this.year = year;
		}
	}


	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		switch(month) {
		case 1 : case 3: case 5 : case 7 : case 8 : case 10 : case 12:
			if(day < 0 || day > 31) {
				System.out.println("유효하지 않은 날짜 입니다");
				isValid = false;
			} else {
				System.out.println("유효한 날짜입니다");
			}
			break;
		case 4 : case 6: case 9 : case 11 :
			if(day < 0 || day > 30) {
				System.out.println("유효하지 않은 날짜 입니다");
				isValid = false;
			} else {
				System.out.println("유효한 날짜입니다");
			}
			break;
		case 2:
			if((year % 4 == 0 && year % 100 == 0) || year % 400 == 0) {
				if(day < 0 || day > 29) {
					isValid = false;
				} else {
					this.day = day;
					
				}
			}
			break;
		default :
			isValid = false;
		}
	}
	public void MyDate (int day, int month, int year) {
		setYear(year);	// true
		setMonth(month);	//true
		setDay(day);	//true
	}
	
	public String isValid() {
		if(isValid) {
//			System.out.println("유효한 날짜입니다");
			return "유효한 날짜입니다";
		}
		else {
//			System.out.println("유효하지 않은 날짜입니다");
			return "유효하지 않은 날짜입니다";
			
	
		}}
	
	
	
}
