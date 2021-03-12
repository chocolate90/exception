package exception.throw_;

public class ThrowsEx01 {

	public static void main(String[] args) {
		
		/*
		 * 예외 만들기 - throw
		 * 메서드, 생성자에서 실행도중 throw 키워드를 만나면
		 * 즉시 예외를 만들고, 예외 처리 구문을 찾는다.
		 * 
		 * 예외가 만들어지면 코드가 즉시 중단되고 가까이에 있는예외 처리구문을 이동(catch)
		 */
		
		try {
			System.out.println("결과:" + calsum(10));
			System.out.println("결과:" + calsum(-4));
			
		} catch (Exception e) {
//			System.out.println("반드시 양수로 전달해야 합니다.");
//			System.out.println(e.getMessage()); // 예외 발생시 전달한 예외 메시지를 얻어오는 기능
			e.printStackTrace(); // 예외의 발생경로를 추적하는 메시지를 출력해준다. (예외 원인을 찾을 때 매번 사용한다.)
		}
		
		System.out.println("프로그램 정상 종료");
		
	}
	
	public static int calsum(int a) throws Exception {
		
		if(a < 0) {
			throw new Exception("반드시 양수로 전달해야 합니다."); // 예외 생성
		}
		
		int sum = 0;
		
		for(int i = 1; i <= a; i++ ) {
			sum += i;
		}
		return sum;
	}
}
