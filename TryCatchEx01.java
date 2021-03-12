package exception.trycatch;

public class TryCatchEx01 {

	public static void main(String[] args) {
		
		int i = 10;
		int j = 0;
		
		System.out.println(i + j);
		
		try {
			System.out.println(i / j);
			System.out.println("이 문장은 실행되나요??");
		// catch뒤에는 해당 예외를 처리할 수 있는 예외 종류가 들어간다.
		// Exception은 모든 예외를 처리할 수 있다.
		} catch(Exception e) {
			System.out.println("0으로 나눌 수 없다.");
		}
		
		
		System.out.println(i * j);
	}
}
