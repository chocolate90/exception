package exception.multicatch;

import java.util.Arrays;

public class MultiCatchMain {

	public static void main(String[] args) {
		
		// main에 인자값을 전달하는 방법
		// run탭 > run_configurations > arguments > ${string_prompt}
		
		try {
			String data1 = args[0];
			String data2 = args[1];
			
			int num1 = Integer.parseInt(data1);
			int num2 = Integer.parseInt(data2);
			
			String str = null;
			str.charAt(0); // 에러
			
		} catch (ArrayIndexOutOfBoundsException e) { // catch 뒤에는 정확한 에러의 종류가 전달된다.
			System.out.println("실행 매개값을 반드시 2개 이상 전달하세요.");
			
		} catch (NumberFormatException e) {
			System.out.println("실행 매개값을  숫자로 입력하세요");
		} catch (Exception e) { // 예외의 상위 부모이기 때문에 모든 예외를 받아서 처리한다.
			System.out.println("기타 예외 입니다.");
		}
		
		
		
		
		
	}
}
