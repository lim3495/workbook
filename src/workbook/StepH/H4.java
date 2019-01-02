package workbook.StepH;
import java.util.Scanner;
import java.util.Random;

public class H4 {
	
	private int com_finger, my_finger;
	private int score[][] = new int[2][3];
	
	public H4() {
		input();
		for(int i=0 ; i<2 ; i++) {
			for(int j=0 ; j<3 ; j++) {
				score[i][j]=0;
			}
		}
	}
	
	void input() {
		
		Random gababo = new Random();
		Scanner s = new Scanner(System.in);
		
		com_finger = gababo.nextInt(3)+1;

		
		while(true) {
			
			System.out.println("가위(1), 바위(2), 보(3)를 입력하세요. [그만하고 싶으면 (0)을 입력하세요.]");
			this.my_finger = s.nextInt();
			
			if(this.my_finger == 0) break;
			
			else if(my_finger == 1)
			{
				switch(com_finger) {
				
					case 1:
						System.out.println("컴퓨터가 낸 것은 가위입니다. => 비김 !!");
						score[0][1]++;
						score[1][1]++;
						
					case 2:
						System.out.println("컴퓨터가 낸 것은 바위입니다. => 컴퓨터 승 :(");
						score[0][0]++;
						score[1][2]++;
						
					case 3:
						System.out.println("컴퓨터가 낸 것은 보입니다. => 사용자 승 :)");
						score[0][2]++;
						score[1][0]++;
					
						
				}
				
				
			}
			else if(my_finger == 2)
			{
				switch(com_finger) {
				
					case 1:
						System.out.println("컴퓨터가 낸 것은 가위입니다. => 사용자 승 :)");
						score[0][2]++;
						score[1][0]++;
						
					case 2:
						System.out.println("컴퓨터가 낸 것은 바위입니다. => 비김 !!");
						score[0][1]++;
						score[1][1]++;
						
					case 3:
						System.out.println("컴퓨터가 낸 것은 보입니다. => 컴퓨터 승 :(");
						score[0][0]++;
						score[1][2]++;
						
				}
				
				
			}
			else if(my_finger == 3)
			{
				switch(com_finger) {
				
					case 1:
						System.out.println("컴퓨터가 낸 것은 가위입니다. => 컴퓨터 승 :(");
						score[0][0]++;
						score[1][2]++;
						
					case 2:
						System.out.println("컴퓨터가 낸 것은 바위입니다. => 사용자 승 :)");
						score[0][2]++;
						score[1][0]++;
						
					case 3:
						System.out.println("컴퓨터가 낸 것은 보입니다. => 비김 !!");
						score[0][1]++;
						score[1][1]++;
					
						
				}
				
				
			}
			
		}
		
		printH4();
		
	}
	
	public void printH4() {

			System.out.println("컴퓨터: 이긴 횟수 "+score[0][0]+"회, 진 횟수 "+score[0][2]+"회, 비긴 횟수 "+score[0][1]+"입니다.");
			System.out.println("사용자: 이긴 횟수 "+score[1][0]+"회, 진 횟수 "+score[1][2]+"회, 비긴 횟수 "+score[1][1]+"입니다.");
	}
	
	

}
