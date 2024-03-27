package main;

public class Ex6 {

	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		
		boolean result1 = (x > 0) && (y > 0); //t && t t
		boolean result2 = (x > 0) && (y < 0); //t && f f
		boolean result3 = (x > 0) || (y > 0); //t || t t
		boolean result4 = (x > 0) || (y < 0); //t || f t
		boolean result5 = !(x > 0); // !t => f 단항연산자 뒤의 식을 먼저계산 후 맞는지 틀린지
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		
	}

}
