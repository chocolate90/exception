package exception.myexception;



public class AccountMain {

	public static void main(String[] args) {
		
		Account acc = new Account("홍길동", "1234", 1000);
		
		try {
			acc.withDraw(2000);
		} catch (MyException e) {
			
			// MyException에 정의한 메서드
			System.out.println(e.errorMessage());
		}
	}
}
