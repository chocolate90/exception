package exception.throw_;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int count = 0; // 시도 횠수
		int ran = (int)(Math.random() * 100) +1; // 정답
		System.out.println(ran);
		while(true) {

			try {


				System.out.print("1~100사이의 수를 입력하세요 >");
				int i = scan.nextInt();
				
				if(i < 1 || i > 100 ) {
					throw new Exception("1~100까지의 숫자만 입력하세요");
				} 


				if(i == ran) {
					System.out.println("정답입니다.");
					count++;
					System.out.println("시도 횟수:" + count);
					break;
				} else if(i < ran) {
					System.out.println("더 큰 수를 입력하세요");
					count++;
				} else if( i > ran) {
					System.out.println("더 작은 수롤 입력하세요");
					count++;
				}

			} catch (InputMismatchException e) {
				System.out.println("정수만 입력하세요.");
				scan.nextLine();
			} catch (Exception e) {
				e.getMessage();
				count++;
			}



		}
	}
}
