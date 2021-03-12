package quiz15;

import java.util.Scanner;

public class MainClass01 {

	public static void main(String[] args) {

		/*
		 *  1. 스캐너를 통해서 정수 2개를 입력 받는다.
		 *  2. 입력받은 값이 정수라면, 단순히 정수의 합을 출력하고 반복문을 종료
		 *  3. 만약 입력값이 예외를 발생시키는 값이라면, "정수로만 입력하세요"를 출력한다음에 다시 처음부터 입력
		 *  4. 반복문을 탈출하면 프로그램 종료 구문을 띄워주세요.
		 *  
		 *  ex) 정확히 코드를 짜면 - 무한루프
		 * 
		 */

		Scanner scan = new Scanner(System.in);

		int sum = 0;
		
		while(true) {

			// 1st 엔터도 하나의 값이고 정수는 엔터 앞까지 받는다 next는 엔터 포합되서 받는다.
			
//			try {
//				
//				System.out.print(">");
//				int i = scan.nextInt();
//				System.out.print(">");
//				int j = scan.nextInt();
//				
//				System.out.println("결과:" + (i+j));
//				break;
//				
//			} catch (Exception e) {
//				System.out.println("정수로만 입력하세요");
//				scan.nextLine(); // 엔터값의 제거
//			}
			
			// 2nd
			try {
				System.out.print(">");
				int a = Integer.parseInt(scan.nextLine());
				
				System.out.print(">");
				int b = Integer.parseInt(scan.nextLine());
				
				System.out.println("결과:" + (a+b));
				break;
			} catch (Exception e) {
				System.out.println("정수만 입력하세요");
			}
			
		}
		





	}


}
