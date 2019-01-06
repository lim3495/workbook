package workbook.StepI;
import java.util.Scanner;

public class I3 {
	
	private int height,weight;
	private String s[] = {"저체중","정상체중","과체중","경도비만","고도비만"};
	
	public I3() {
		
		getdata();
		
	}
	
	void getdata() {
		Scanner s = new Scanner(System.in);
		
		for(int i=0 ; i<10 ; i++) {
			
			System.out.println((i+1)+"번째 사람의 신장(cm)과 체중(kg)을 입력하시오.");
			this.height = s.nextInt();
			this.weight = s.nextInt();
			
			AskBiman(height,weight);
		}
		
	}
	
	void AskBiman(int h , int w) {
		
		double Biman = w / ((h*0.01) * (h*0.01));
		
		if(Biman < 18.5)
			System.out.println(s[0]+"입니다.");
		else if(Biman >= 18.5 && Biman < 23)
			System.out.println(s[1]+"입니다.");
		else if(Biman >= 23 && Biman < 25)
			System.out.println(s[2]+"입니다.");
		else if(Biman >= 25 && Biman < 30)
			System.out.println(s[3]+"입니다.");
		else 
			System.out.println(s[4]+"입니다.");
		
		
		
		
	}
	

}
