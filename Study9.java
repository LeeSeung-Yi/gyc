package variable1;

import java.util.Scanner;

public class Study9 {

	public static void main(String[] args) {
		// 피자 조각 개수와 사람 수를 입력받아, 한 사람당 몇 조각 먹을 수 있는 지, 남는 조각은 몇 개인지 출력
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("피자 조각 갯수를 입력해주세요");
		int piz = sc.nextInt(); //입력받는 수 
		 
		System.out.println("사람 수를 입력해주세요");
		int peo = sc.nextInt();

		//계산
		int peo1  = piz /peo; //변수 : 피자를 사람으로 나눔= 몫 (먹을 수 있는 피자 수)
		System.out.println(peo1+"조각 먹을 수 있음");
		int piz2 = piz % peo; //변수 : 피자 나머지
		System.out.println(piz2 + "남음");
	}

}
