package main;

public class Ex1 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = -20;
		
		//부호를 그대로 유지  +는 대게 표시의 의미
		System.out.println(+num1);
		System.out.println(+num2);
		
		//부호를 반대로 바꾸기
		System.out.println(-num1);  //양수 -> 음수
		System.out.println(-num2);  //음수 -> 양수
		
		//부호연산자는 값 자체를 바꾸지 않고, 값을 카피해서 사용함
		System.out.println(num1);
		System.out.println(num2);
	}

}
