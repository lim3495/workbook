package workbook.StepK;
import java.util.Scanner;

public class K6 {
	private int student=0;
	
	public void main() {
		get_num();
		
		UserInfo u = new UserInfo();
	for(int i=0 ; i<student ; i++) {
		System.out.printf("%d번",i+1);
		u.input();
	}
	
	System.out.println("====================");
	System.out.println("학생의 목록은 다음과 같습니다.");
	System.out.println("------------------------------------");
	
	System.out.println("번호\t아이디\t\t비밀번호");
	
	for(int i=0 ; i<student ; i++) {
		u.print(i);
	}
	
	}
	
	void get_num() {
		Scanner s = new Scanner(System.in);
		System.out.println("등록할 학생의 명수는?");
		student = s.nextInt();
	}
}
