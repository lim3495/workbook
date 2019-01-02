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
		
		System.out.println((i+1)+"번째 사람의 태어난 년도를 입력하시오.");
		birth_year = s.nextInt();
		
		if(birth_year > 2012) break;
		
		age[i] = 2012 - birth_year + 1;
		count++;
		
		}
		

		for(int i=0 ; i<count ; i++) {
			age_count[age_cal(age[i])]++;
		}

	}
	
	public void printG1() {
	
		for(int i=0 ; i<count ; i++) {
			System.out.println((i+1)+"번째 사람의 나이는"+age[i]+"입니다.");
		}
		
		for(int j=0 ; j<6 ; j++) {
			System.out.printf("%s는 %d명 입니다.\n",s[j],age_count[j]);
		}
	
	}
	
	int age_cal(int age) {
		
		
			if (age<7 )
				return 0;
			else if(age >= 7 && age <13) 
				return 1;
			else if(age >= 13 && age <20)
				return 2;
			else if(age >= 20 && age <30) 
				return 3;
			else if(age >= 30 && age <60) 
				return 4;
			else 
				return 5;
			
		
		
	}
}
