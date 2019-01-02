package workbook.StepH;
import java.util.Scanner;
import java.util.Random;

public class H5 {
	
	private int coins =0;
	private int number[] = new int[3];
	
	public H5() {
		input();
	}
	
	void input() {
		
		int dummy=0;
		int i=0;
		
		Random rand = new Random();
		Scanner s = new Scanner(System.in);
		
		System.out.println("사용하실 코인의 개수를 입력하세요.");
		coins = s.nextInt();
		
		while(coins !=0) {
			System.out.println("게임"+(i+1)+" 회 Start!!!(아무 숫자나 입력하세요)");
			i++;
			dummy = s.nextInt();
			
			for(int j=0 ; j<3 ; j++) {
				number[j] = rand.nextInt(9)+1;
			}
			this.coins--;
			game_start(number);
			System.out.println("남아있는 코인은"+coins+"입니다.");
		
		
		}
	}
	
	void game_start(int number[]) {
		
		System.out.print("게임 결과:");
		for(int i=0 ; i<3 ; i++) {
			System.out.print(number[i]+" ");
		}
		
		if(number[0]==number[1] && number[0]==number[2]) {
			System.out.println("--> 숫자 3개 일치 : 코인 3개 증정");
			this.coins +=3;
		}
		else if(number[0]==number[1] || number[0]==number[2] || number[1]==number[2]) {
			
			System.out.println("--> 숫자 2개 일치 : 코인 2개 증정");
			this.coins +=2;
		}
		else {
			System.out.println("--> 꽝입니다.. 아쉽군요 :(");
			
		}
		
		
	}
	
	public void printH5() {
		
		System.out.println("\n게임종료 !!");
		
	}

}
