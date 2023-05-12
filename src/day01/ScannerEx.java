package day01;

import java.util.Scanner;

public class ScannerEx {
	
	public static void main(String[] args) {
		
		//자바의 입력
		//1. 스캐너 객체 필요
		Scanner scan = new Scanner(System.in);
		
		//2. 스캐너가 가지고 있는 입력 기능을 사용해서 데이터를 입력 받음
		System.out.print("이름을 입력하세요 >");
		String name = scan.next(); //문자열을 받음
		
		System.out.print("나이를 입력하세요 >");
		int age = scan.nextInt(); //정수를 받음
		
		System.out.print("신장을 입력하세요 >");
		double cm = scan.nextDouble(); //실수를 받음
		
		System.out.println("이름:"+name+", 나이:"+age+", 키:"+cm);
		
		
		//3. 스캐너 자원해제
		scan.close();
		
	}

}
