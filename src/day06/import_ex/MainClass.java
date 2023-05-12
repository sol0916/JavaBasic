package day06.import_ex;

import day06.fruit.*; //패키지명을 포함한 클래스명 > *는 해당 패키지 전부 사용 가능

public class MainClass {

	public static void main(String[] args) {
		
		Apple app = new Apple();
		Melon melon = new Melon();
		
		int a = 1;
		System.out.println(a);
		System.out.println(melon); //주소값
		

	}

}
