package variable1;

import java.util.Scanner;

public class Study6 {

	public static void main(String[] args) {
		// 입력한 수로 구구단을 만드세요
		// 5입력 -> 5단
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("수를 입력해주세요");// 입력 수 
		int go= sc.nextInt(); //go가 입력받는 수
		
		int i=1; // 변수 정의, 변수가 계산하는 수
		for(i=1; i <=9; i++) { // 변수는 1~9
			int result= go *i; // 결과가 입력받는 수 곱하기 변수
			System.out.println(go+ "x"+ i+"="+result);
		}

	}

}
