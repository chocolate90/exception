package exception.trycatch;

public class TryCatchEx02 {

	public static void main(String[] args) {
		
		int[] arr= {1, 2, 3, 4, 5};
		
		int i = 0;
		while(i < 6) {
			
			try {
				System.out.println(arr[i]);
				
			} catch (Exception e) {
				System.out.println("배열의 참조범위를 벗어났습니다.");
			} finally {
				System.out.println("이 문장은 예외와 상관없이 항상 출력");
			}
			
			i++;
			
		}
	}
}
