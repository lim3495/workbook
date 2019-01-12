package workbook.StepK;
import java.util.Scanner;

class UserInfo {

	private String id[] = new String[100] ;
	private int password[]= new int[100];
	private int count = 0;
	
	public UserInfo() {
		
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("학생의 아이디, 비밀번호를 입력하시오 -->");
		id[count] = s.next();
		password[count] = s.nextInt();
		count++;
		
		
	}
	void print(int index) {
		System.out.println(index+1 +"\t"+id[index]+"\t\t"+password[index]);
		
	}
	
}

public class K5 {
	
	public void main() {
		
		UserInfo u = new UserInfo();
		
		u.input();
		
		System.out.println("====================");
		System.out.println("학생의 목록은 다음과 같습니다.");
		System.out.println("------------------------------------");
		
		System.out.println("번호\t아이디\t\t비밀번호");
		u.print(0);
	}
	
	

}
