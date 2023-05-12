package day04;

public class MethodEx03 {

	public static void main(String[] args) {
		
		/*
		 * return이란
		 * 1. 메소드에서 리턴은 실행결과를 돌려주는 값에 대한 타입
		 * 2. 리턴이 있는 메소드는 다른 메소드의 매개값으로도 사용이 됩니다
		 * 
		 * 3. 반환값은 없을 수도 있습니다 void로 선언합니다
		 * 4. void 메소드도 return을 사용할 수 있습니다
		 * 		- 값을 돌려주지 못하고 종료의 의미
		 */
		
		System.out.println(add(1,2));
		
		int result = add( add(1,2) , add(3,5)); 
		System.out.println("결과:"+result);
		
		//void형 메소드는 return이 없기 때문에 단순히 호출만 가능합니다
		sub();
		
		div(6,2);
		
		noReturn("안녕?");
		noReturn("hello");
		

	} //main
	
	static int add(int a, int b) {
		return a+b;
	}
	
	//반환이 없고, 매개변수도 없는 모형
	static void sub() {
		System.out.println("5 - 3 = 2");
	}
	
	//반환이 없고, 매개변수는 있는 모형
	static void div(int a, int b) {
		System.out.println(a+" / "+b+" = "+ (a/b));
	}
	
	//
	static void noReturn(String s) {
		
		if(s.equals("hello")) {
			System.out.println("메소드를 종료합니다!");
			return;
		}
		
		System.out.println("hello를 전달해야 할껄요?");
		
	}

}
