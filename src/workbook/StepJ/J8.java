package workbook.StepJ;
import java.util.Scanner;

public class J8 {

	public J8() {
		
	for(int i=0 ; i<4 ; i++) {
		for(int j=0 ; j<4 ; j++)
			System.out.println("Ackermann"+"("+i+","+i+") = " + Ackermann(i,j));
	}
	
	}
	
	int Ackermann(int i , int j) {
		
		if(i == 0 && j >= 0)
			return j+1;
		else if (i >0 && j == 0)
			return Ackermann(i-1 , 1);
		else if (i >=0 && j>=0)
			return Ackermann(i-1, Ackermann(i,j-1));
		else
			return -1;
		
	}
	
	
}
