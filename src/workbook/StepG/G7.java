package workbook.StepG;
import java.util.Scanner;

public class G7 {
	
	private int team_count=0;
	private int charge[] = {5000,1000,15000,3000};
	private int count[] = new int[4];
	private int v_count[] = new int[4];
	private int total_count,sum=0,total_sum=0,membership=0;
	private String s[] = {"초등학생","청소년","일반인","경로대상"};
	
	public G7() {
		input();
	}
	
	void input() {
		
		Scanner s = new Scanner(System.in);
		System.out.println("오늘 방문한 팀 수를 입력하세요.");
		this.team_count = s.nextInt();
		for(int i=0 ; i< team_count; i++) {
			
			
			System.out.println((i+1)+"번팀 인원수 (초등학생, 청소년, 일반, 경로대상)을 입력하세요.");
			for(int z=0 ; z<4 ; z++) 
				count[z] = s.nextInt();
		
			for(int j=0 ; j<4 ; j++) {
				this.v_count[j] += count[j];
				this.total_count += count[j];
			}
			
			System.out.println((i+1)+"번팀 할인카드 종류(카드없음:0 , 일반등급:1 , VIP등급:2)를 입력하세요.");
			this.membership = s.nextInt();
			
			cal_fee();
			
			System.out.println((i+1)+"번팀 입장료는"+sum+"입니다.");
			
		}
	}
	
	void cal_fee() {
		sum=0;
		for(int i=0 ; i<3 ; i++) {
			this.sum += count[i] * charge[i];
		}
		if(this.membership == 1)
			sum = (int)(sum*0.9);
		else if(this.membership == 2)
			sum = (int)(sum*0.8);
		
		total_sum += sum;
		
	}
	
	public void printG7() {
		
		System.out.println("오늘 총 방문자수는"+total_count+"입니다.");
		
		for(int i=0 ; i<4 ; i++)
			System.out.println(s[i]+"수는"+v_count[i]+"입니다.");
		
		System.out.println("총 입장료는 "+total_sum+"입니다.");
		
	}
	
	
	
		
	
}
