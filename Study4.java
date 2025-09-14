package variable1;

import java.util.Scanner;

public class Study4 {

	public static void main(String[] args) {
		//두 수를 입력받아 그 사이의 숫자 모두 출력
		Scanner sc = new Scanner(System.in); 
		System.out.println("첫번째 수를 입력해주세요");
		int num1 = sc.nextInt();
		 
		System.out.println("두번째 수를 입력해주세요");
		int num2 = sc.nextInt();
		//if (num1 < num2) { //전제조건
			
		for(int i= num1+1;  i<num2 ;i++) {// 시작지점은 지정해서
			System.out.println(i + " ,");
		}
		
}
}
	

