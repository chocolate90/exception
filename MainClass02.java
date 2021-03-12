package exception.throw_;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass02 {

	public static void main(String[] args) {

		/* 처리할 작업
		 * 1. 입력한 값이 숫자가 아니라면 "반드시 숫자만 입력하세요"를 출력 후 다시 입력받는다. (count는 증가x)
		 * 2. 입력한 값이 1~100사이의 값이 아니라면 예외처리 구문으로 이동 다시 입력받는다.(단, count는 증가)
		 * 
		 */
		
		// updown
		
		while(true) {
			
			try {
				updown();
			} catch (InputMismatchException e) {
				System.out.println("정수로만 입력하세요");
				
			} catch(Exception e) {
				e.getMessage();
			}
		}
		
			
		
	}
	
	public static int count = 0; // 시도 횠수
	public static int ran = (int)(Math.random() * 100) +1; // 정답
	
	public static int updown() throws Exception{
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요>");
		int a = scan.nextInt();
		
		if(a < 1 || a > 100 ) {
			throw new Exception("1~100까지의 숫자만 입력하세요");
		} else if(a == ran) {
			System.out.println("정답입니다.");
			count++;
			
			return count;
		} else if(a < ran) {
			System.out.println("더 큰 수를 입력하세요");
			count++;
		} else if(a > ran) {
			System.out.println("더 작은 수를 입력하세요");
			count++;
		}
		
		
		
		return a;
	}

}
