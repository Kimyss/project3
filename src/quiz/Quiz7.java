package quiz;

public class Quiz7 {
	public static void main(String[] args) {
		boolean result = (1 == 2) || (1 < 2); // f || t  =>|| 둘 중 하나만이어도 true
		boolean result2 = true && false; // && 두 식 다 참이어야 함 =>false
		boolean result3 = !false; // 우선 false 그리고 ! 단항연산  => true
		
		int x = 1;
		int y = 5;
		boolean result4 = (x < y) || (x == y); // t || f  || 둘중 하나 true => true
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
	}
}
