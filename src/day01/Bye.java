package day01;

public class Bye {
	public static void main(String[] args) {

		//main이라 쓰고 ctrl + space를 누르면 실행함수가 만들어집니다.
		/*
		 * ctrl + s 저장
		 * ctrl + f11 실행
		 * sysout이라 적고 ctrl + space 출력문 자동완성
		 * 
		 * 코드이동 : alt + 방향키
		 * 코드복사 : ctrl + alt + 방향키
		 * 되돌리기 : ctrl + z
		 * 전체선택 후 정렬 : ctrl + a > ctrl + i
		 * 한줄삭제 : ctrl + d
		 * 
		 */

		System.out.println("출력문 자동완성");
		System.out.println(1);
		System.out.println("1");
		
		
		//자바의 출력문의 종류 - 3가지 제공
		//개행문자 \n없는 출력
		System.out.print("Hi");
		System.out.print("Hi");
		System.out.print("\n이렇게하면 줄바꿈이 먼저 들어감\n");
				
		//개행문자를 마지막에 포함해주는 println
		System.out.println("맨 뒤에 줄바꿈이 붙습니다");
		System.out.println("맨 뒤에 줄바꿈이 붙습니다");
		
		//형식 지정 출력문 printf
		//내가 출력하고 싶은 문자열에 구멍을 뚫어 놓고 사용하는 방식
		/*
		 *  %d - 정수를 대입할 수 있음
		 *  %f - 실수를 대입할 수 있음 > 실수는 소수의 자릿수를 지정할 수 있음 f앞에 .n 입력
		 *  %s - 문자열을 대입할 수 있음 > 문자열을 사용할 때는 ""를 사용해야 함
		 * 
		 * \n - 줄바꿈
		 * \t - 8칸 공백을 잡고 정렬(tab)
		 * 
		 */
		System.out.printf("제 이름은 %s 입니다.\n", "홍길동");
		System.out.printf("원주율은 %.2f 입니다.\n", 3.14);
		System.out.printf("오늘은 %d일 입니다.\n", 7);
		
		//제 생일은 xxxx년 xx월 xx일 입니다.
		
		System.out.printf("제 생일은 \t%d년 %d월 %d일 입니다", 1994, 9, 16);

	}

}
