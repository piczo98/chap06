package reference.test;

public class Subject {
	
	String subjectName;
	int subjectScore;
	
	//�Ű����� ������ �����
	//������� �Ű������� ���� ������
	public Subject (String name) {
		subjectName = name;
		
	}
	
	// �� ��� ������ ���� �����ϰ� ��ȯ�ϴ� �޼��� �߰�
	public void setSubjectName(String name) {
		subjectName = name;
		
	}
	
	public String getSubjectName() {
		// �Ű����� �ʿ� ����
		return subjectName;
	}
	
	public void setSubjectScore(int score) {
		subjectScore = score;
		
	}
	
	public int getSubjectSocre() {
		return subjectScore;
	}
	
	
	
	
	
	
	
}
