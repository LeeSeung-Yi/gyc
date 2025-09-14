package variable1;

import java.util.Scanner;

public class Study3 {

	public static void main(String[] args) {
		//입력받은 수의 짝수만 출력하기
		Scanner sc = new Scanner(System.in); 
		System.out.println("숫자를 입력해주세요");
		int num = sc.nextInt();
		for(int i=2; i<=num; i++) {
		if(i %2==0) {	
			System.out.println(i);
		}
		}
		
		
	}

}
