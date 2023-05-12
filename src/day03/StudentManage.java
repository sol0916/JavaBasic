package day03;

import java.util.Arrays;
import java.util.Scanner;

public class StudentManage {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		//학생정보를 등록할 배열을 while문 바깥에 선언
		String[] nameList = new String[100];
		int[] ageList = new int[100]; 
		String[] infoList = new String[100];		
		
		String[] list = new String[100];
		
		//고객수
		int count = 0;
		
		//조회할 위치
		int index = -1;
		
		//종료
		boolean bool = true;
		
		while(bool) {
			
			System.out.println("[정보]고객수:"+count+", 조회 위치:"+index);
			System.out.println("[메뉴]1.추가, 2.이전정보, 3.다음정보, 4.현재정보, 5.정보수정, 6.정보삭제, 7.종료 ");		
			System.out.println("===============================================================");
			System.out.print("메뉴 입력>");
			String menu = scan.next();
			
			switch(menu) {
			case "추가":
			case "1":
				
				/*
				 * 이름, 나이, 간단한 정보를 입력 받아서 각각의 배열에 순서대로 저장될 수 있게 처리
				 * count를 증가합니다.
				 */
						index++;
						System.out.println("=========사용자 정보 입력=========");
						System.out.print("이름을 입력하세요 >");
						nameList[index] = scan.next();
						System.out.print("나이를 입력하세요 >");
						ageList[index] = scan.nextInt();
						System.out.println("정보를 입력하세요 >");
						infoList[index] = scan.next();
						System.out.println();
					
					list[index] = "이름: "+ nameList[index] +", 나이: "+ ageList[index] + ", 정보: " + infoList[index];
					count++;
															
				break;
				
			case "2":
				
				/*
				 * 이전정보 출력
				 * 정보출력은 index위치로 출력합니다
				 * 이전정보 출력을 누르면 index를 -1 시키고 해당 위치에 정보를 출력
				 * 조건 : index가 0보다 작다면, 출력하지 않도록 처리 
				 */
				
				System.out.println();
				if(index<=0) {
					System.out.println("이전정보가 없습니다");
				} else {				
					index--;
				System.out.println(list[index-1]);
				}
				System.out.println();
				
				break;
				
			case "3":
				
				/*
				 * 다음정보 출력
				 * 다음출력은 index위치로 출력합니다
				 * 다음정보 출력을 누르면 index를 +1시키고 해당 위치에 정보를 출력
				 * 조건 : count-1보다 index가 같거나 크다면, 출력하지 않도록 처리
				 */
				
				System.out.println();
				index++;
				if(count-1<index) {
					System.out.println("다음정보가 없습니다");
				} else {
					System.out.println(list[index]);
				}
				System.out.println();
				
				break;
				
			case "4":
				
				/*
				 * 현재정보 출력
				 * index가 가르키고 있는 위치 정보를 출력
				 * 조건 : 출력할 수 있는 조건을 생각해서 처리(count?)
				 */
				
				System.out.println();
				if(count<=index) {
					System.out.println("확인할 정보가 없습니다");
				} else {
					System.out.println(list[index]);
				}
				System.out.println();
				
				break;
				
			case "5":
				
				/*
				 * 정보수정
				 * 새로운 이름, 나이, 정보를 입력 받아서
				 * 현재 위치를 수정해주면 됩니다
				 * 조건 : 4번과 동일
				 */
				
				if(count<=index) {
					System.out.println("수정할 정보가 없습니다");
				} else {
				
					System.out.println();
					System.out.println("현재 입력 정보");
					System.out.println(list[index]);
					System.out.println();
				
					System.out.print("이름을 입력하세요 >");
					nameList[index] = scan.next();
					System.out.print("나이를 입력하세요 >");
					ageList[index] = scan.nextInt();
					System.out.println("정보를 입력하세요 >");
					infoList[index] = scan.next();
					System.out.println();
				
					list[index] = "이름: "+ nameList[index] +", 나이: "+ ageList[index] + ", 정보: " + infoList[index];
					
				
				}
				
				break;
				
			case "6":
				
				/*
				 * 현재정보 삭제
				 * 현재 삭제 하려는 index부터 ~~~뒤에 있는 배열 요소를 당겨와서 덮어 씌웁니다
				 * 사람 수를 감소
				 * 조건 : 4번과 동일
				 */
				if(count<=index) {
					System.out.println("삭제할 정보가 없습니다");
				} else {
					for(int i=index; i<count-1; i++) {
						list[index] = list[index+1];
					}
				}
				
				count--;
				
				System.out.println();
								
				break;
				
			case "7":
				
				//while문 탈출
				
				bool = false;
							
				break;
				
			default:
				System.out.println("잘못 입력했습니다");
				break;
			
			}
			
			
			
		}

	}

}
