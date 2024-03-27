package quiz;

public class Quiz8 {

	public static void main(String[] args) {
		// 1.int형 변수 x를 선언하고 80 대입 
		//  x가 50 < x < 100 범위에 포함되는지 확인하고, 결과     ~고 => 논리곱 && 문
		
		//2.int형 변수 y를 선언하고 5대입
		
		// y가 10보다 작거나 30보다 큰 지 확인, 결과				~거나 => 또는 ||
		int x = 80;
		boolean result1 = (x > 50) && (x < 100);
		System.out.println(result1);
		
		int y = 5;
		boolean result2 = (y < 10) || (y > 30);
		System.out.println(result2);
		
			
		}
}
