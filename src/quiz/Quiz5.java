package quiz;

public class Quiz5 {

	public static void main(String[] args) {
		//1. 나이가 40세 이하라면 true 출력
		//2. 나이가 40세 맞다면 true 출력
		//3. 나이가 40세 아니라면 true 출력
		
		int age = 33;
		
		boolean result1 = (age <= 40);
		System.out.println(result1);
		
		boolean result2 = (age == 40);
		System.out.println(result2);
		
		boolean result3 = (age != 40);
		System.out.println(result3);
		
		

	}

}
