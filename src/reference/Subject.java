package reference;

public class Subject {
	//heap 메모리
	// 멤버 변수
	String subjectName;	// 과목명
	int subjectScore;	// 점수
	//클래스타입은 힙에 생성됨
	
	public String getSubjectName() {	// 값 얻어오기
		return subjectName;
		
	}
	
	public void setSubjectName(String name) {	// 값 저장
		subjectName = name;
		//void는 리턴값이 필요 없음
		
	}
	
	public int getSugjectScore() {	// 값 얻어오기
		return subjectScore;
		
	}
	
	public void setSubjectScore(int score) {	// 값 저장
		subjectScore = score;
	
	}
	
	
	
	
	
}
