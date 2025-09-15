package variable1;

import java.util.Random;

public class Study10 {

	public static void main(String[] args) {
		// 주사위를 두번 던졌을 때 각각 결과를 출력하고 두 숫자의 합을 출력
		//random : 
		
		Random ran = new Random();
		int num1 = ran.nextInt(6) +1;
				System.out.println("첫번째 주사위 랜덤 숫자:" + num1);
				
		int num2 = ran.nextInt(6) +1;
				System.out.println("두번째 주사위 랜덤 숫자:" + num2);
		int sum = num1 + num2;
				System.out.println("두 숫자의 합:" + sum);
				//"두 숫자의 합:" + (num1+num2));

	}

}
