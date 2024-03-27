package quiz;

public class Quiz9 {

	public static void main(String[] args) {
		//5가 3보다 크면, 문자 '오'를 출력하고 아니면 문자 '삼'을 출력하세요
		
		//String str = (5 > 3) ? "오" : "삼";
		char ch = (5 > 3) ? '오' : '삼';
		System.out.println(ch);
		
		//풀이과정과 예상값
		int x = 10;
		int y = 20;
		int result = (x > 10) ? y + 10 : y - 10; // x > 10 :f => y - 10 =>  result = 10
		System.out.println(result);

	}

}
