package day02;

public class DoWhileEx02 {

	public static void main(String[] args) {
		
		
		//do~while문은 조건이 false여도 무조건 1번은 실행함
		//2번째 부터는 while문과 완전히 동일 함
		
		int a = 1;
				
		do {
			
			System.out.println(a);
			a++;			
	
		} while(a<=10);

	}

}
