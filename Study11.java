package variable1;

import java.util.Random;
import java.util.Scanner;

public class Study11 {

	public static void main(String[] args) {
		// 1~50 중 랜덤 숫자를 하나 만들고, 사용자가 숫자를 입력해서 맞출 때까지 "UP" 또는 "DOWN"을 출력
	Random ran = new Random();
	int num = ran.nextInt(50)+1;
	Scanner sc = new Scanner(System.in);
	System.out.println("숫자를 입력해주세요");
	
	while (true) { // 계속반복
		int i= sc.nextInt();
		
		if (i< num) {
			System.out.println("up");
		}else if (i>num ) {
			System.out.println("down");
		}else {
			System.out.println("정답입니다."); break; //반복문 종료
			
			
			
			
			
		}
		
	}
		
		
		
		
		
	}

}
