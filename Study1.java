package variable1;

import java.util.Scanner;

public class Study1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		// 주문한 치킨 수만큼 출력
		System.out.println("주문해주세요");
		int num = sc.nextInt();
		
		int i = 1;
		for (i = 1; i<= num; i++) {
			System.out.println("치킨" +i+ "주문이요" );
		}
		
		
		

	}

}
