package workbook.StepG;
import java.util.Scanner;

public class G1 {
	
	private int birth_year;
	private int age[] = new int[100];
	private int age_count[] = {0,0,0,0,0,0};
	private int count=0;
	private String s[] = {"유아","어린이","청소년","청년","중년","노년"};
	
	public G1() {
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);

		
		for(int i=0;i<100;i++){
		
		System.out.println((i+1+"번째 사람의 태어난 년도를 입력하시오."));
		birth_year = s.nextInt();
		
		if(birth_year > 2012) break;
		
		age[i] = 2012 - birth_year + 1;
		count++;
		
		}
		age_cal();
	}
	
	public void printG1() {
		for(int i=0 ; i<count ; i++) {
			System.out.println((i+1)+"번째 사람의 나이는"+age[i]+"입니다.");
		}
		
		for(int j=0 ; j<6 ; j++) {
			System.out.printf("%s는 %d명 입니다.\n",s[j],age_count[j]);
		}
	
	}
	
	void age_cal() {
		
		for(int i = 0 ; i< count ; i++)
		{
			if(age[i] <6) 
				age_count[0]++;
			else if(age[i] >= 7 && age[i] <13) 
				age_count[1]++;
			else if(age[i] >= 13 && age[i] <20)
				age_count[2]++;
			else if(age[i] >= 20 && age[i] <30) 
				age_count[3]++;
			else if(age[i] >= 30 && age[i] <60) 
				age_count[4]++;
			else 
				age_count[5]++;
			
		}
		
		
		
	}
}
