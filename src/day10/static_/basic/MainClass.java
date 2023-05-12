package day10.static_.basic;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {

		char[] cc = {'a', 'b', 'c'};
		int[] ii = {0,1,2,3,4,5};
		String[] ss= {"홍길동", "홍길자", "홍홍홍"};
		
		String result = MyArrays.printArray(cc);
		System.out.println(result);

		String result2 = MyArrays.printArray(ii);
		System.out.println(result2);
		
		String result3 = MyArrays.printArray(ss);
		System.out.println(result3);
			
		result = Arrays.toString(cc);
		System.out.println(result);
		
		String result4 = MyArraysA.printArray(ss);
		System.out.println(result4);
		
		//클래스가 여러번 로드 되더라도 static은 단 1번만 실행됨
		System.out.println(Init.price);
		System.out.println(Init.price);
	
	}

}
