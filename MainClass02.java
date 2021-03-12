package quiz15;

import java.util.Scanner;

public class MainClass02 {

	public static void main(String[] args) {

		// updown
		
		Scanner scan = new Scanner(System.in);
		
		int count = 0;
		int ran = (int)(Math.random() * 100) +1;
		while(true) {
			
			try {
				
				
				System.out.print("1~100사이의 수를 입력하세요 >");
				int i = scan.nextInt();
				
				
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
				
			} catch (Exception e) {
				System.out.println("잘못 입력했습니다.");
				count++;
				scan.nextLine();
			}
			
			
			
		}
	}

}
