package workbook.StepG;
import java.util.Scanner;

public class G4 {
	
	private int kind,money,charge,total_charge=0;
	
	public G4() {
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.println("부동산 거래종류(1:매매, 2:임대, 0:계산종료)를 입력하시요.");
			kind = s.nextInt();
			
			if(kind == 0) break;
			
			System.out.println("부동산 거래금액(원)을 입력하세요.");
			money = s.nextInt();
			charge = cal();
			System.out.println("이에 대한 중개수수료는"+charge+"입니다.");
			total_charge += charge;
			
		}
		
	}
	
	int cal() {
		if(kind == 1) {
			if(money  < 50000000)
				charge = 250000;
			else if(money >= 50000000 && money < 200000000)
				charge = 800000;
			else
				charge = 0;
				
			
		}
		else {
			if(money  < 20000000)
				charge = 70000;
			else if(money >= 20000000 && money < 50000000)
				charge = 200000;
			else if(money >= 50000000 && money < 100000000)
				charge = 300000;
			else
				charge = 0;
			
		}
		
		return charge;
	}
	
	public void printG4() {
		
		System.out.println("지금까지의 수수료 총액은"+total_charge+"입니다.");
	}

}
