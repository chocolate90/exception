package exception.myexception;

public class Account {
	
	// 접근 제어자를 붙인다.
	// withDrow() 에서 잔액이 출금 금액보다 작다면 
	// MyException으로 예외를 발생시키고 처리하는 코드를 작성

	// 멤버변수
	private String name;
	private String password;
	private int	balance;
	
	//생성자
	public Account(String aName, String pw, int bal) {
		
		name = aName;
		password = pw;
		balance = bal;
	}
	public Account() {
		
	}
	
	// 입금
	public void deposit(int a) {
		balance += a;
	}
	
	// 출금
	public void withDraw(int a) throws MyException {
		
		if(balance < a) {
			throw new MyException((a - balance) + "원 부족");
		}
		balance -= a;
	}
	
	// 잔액
	public int getBalance() {
		
		
		return balance;
	}
}
