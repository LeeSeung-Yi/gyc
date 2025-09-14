package variable1;

import java.util.Scanner;

public class Study8 {

	public static void main(String[] args) {
		// 점수를 입력받아 n x n크기의 네모 별을 출력
		Scanner sc = new Scanner(System.in); 
		System.out.println("점수를 입력해주세요");
		int num= sc.nextInt(); //입력받는 수 
		
		for (int i =1; i<=num; i++ ) { //가로줄 포문 
			for (int s= 1; s<=num; s++ ) {
				System.out.print("*");
			}
			System.out.println(""); // 줄바꾸는 포문(바깥쪽 포문)
		}
	}

}
