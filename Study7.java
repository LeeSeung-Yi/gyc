package variable1;

import java.util.Scanner;

public class Study7 {

	public static void main(String[] args) {
		// 숫자를 입력하면, 3의 배수일 때만 "점프"출력, 아니면 "패스" 출력

		Scanner sc = new Scanner(System.in); 
		System.out.println("숫자를 입력해주세요");// 입력 수 
		int num= sc.nextInt(); //num 입력받는 수
		
		if (num%3 == 0) { // 입력받는 수가 3의 배수
			System.out.println("점프!");
		}else { 
				System.out.println("패스!");
			}
	
		
		
	}

}
