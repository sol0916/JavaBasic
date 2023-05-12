package day01;

public class VariableScope {

	public static void main(String[] args) {
	
		
		//변수는 중괄호 안에서 선언되고, 중괄호 안에서만 유효합니다.
		
		//int num1 = 10;
		//int num2 = 20;
		int num1 = 10, num2 = 20;
		int num4 = 0;
		
		if(true) {
			
			int num3 = num1 + num2;
			
			//요기에서 num4의 값을 변경을 하고, 바깥에서 사용하고 싶음 > 선언을 메인 안에서
			num4 = 1000;
			
		}
		
		//System.out.println(num3);
		//num3은 if문 안에 선언되었기 때문에 if문 밖에서는 사용할 수 없다
		
		int num3 = 100; //num3은 if문을 벗어나면서 사라졌기 때문에, 동일한 이름 선언 가능
		
		System.out.println(num4);
		
	}

}
