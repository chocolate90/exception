package exception.throws_;

public class ThorwsMain {

	public static void main(String[] args) /*throws Exception*/ {
		
		// main도 throws로 예외를 넘길 수있다.
		
		try {
			ThrowsEx02 ex = new ThrowsEx02();
		} catch (Exception e) {
			System.out.println("예외 발생");
		}
	}
}
