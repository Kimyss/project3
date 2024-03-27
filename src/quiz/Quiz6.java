package quiz;

public class Quiz6 {

	public static void main(String[] args) {
		int x = 7;
		int y = 10;
		
		boolean result1 = (x % 2 ==1);
		boolean result2 = (y % 2 ==0); 

		System.out.println(result1);
		System.out.println(result2);
		
		
		//풀이
		
		int value1 = 7 % 2;
		
		boolean result3 = (value1 ==1);
		System.out.println(result3);
		
		int value2 = 10 % 2;
		
		boolean result4 = (value2 ==0);
		System.out.println(result4);
	}

}
