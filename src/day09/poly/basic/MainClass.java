package day09.poly.basic;

public class MainClass {

	public static void main(String[] args) {
		
		Child c = new Child();
		c.method01(); //상속 받은
		c.method02(); //오버라이드 됨
		c.method03(); //내꺼
		
		
		System.out.println("===========다형성 적용 (형변환)============");
		
		//Parent처럼 사용됨 단, 자식의 오버라이드 된 메서드가 실행
		Parent p = c;		
		p.method01();
		p.method02(); // 오버라이드 된 메서드가 있다면 오버라이드 된 것부터 먼저 실행
		
		System.out.println(p); //parent 타입
		System.out.println(c); //child 타입
		System.out.println(p==c); //child로 생성된 자식은 원래의 객체를 유지함
		
		System.out.println("=========클래스 강제 형 변환=======");
		//원본이 child로 생성되었다면, 강제 형 변환이 가능함 
		
		Parent pp = new Child();
		System.out.println(pp); //child 원본
		
		Child cc = (Child) pp; // 강제 형 변환
		cc.method01();
		cc.method02();
		cc.method03();
		
		
		//주의 할 점 => 다형성이 적용되었던 객체만 강제 형 변형이 가능함
		Object obj =  new Object();
		//Child ccc = (Child)obj; //runtime exception
		
		System.out.println("====================다형성의 또 다른 예시=============");
		
		String str = "홍길동";
		Object o = str;		
		String result = (String) o; //OK
		
		
		
	
	}

}
