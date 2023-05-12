package day03;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearch2 {

	public static void main(String[] args) {
		
		//이진탐색 -반을 분할해서 찾아가는 방법
		//조건 - 먼저 순서대로 정렬이 되어 있어야 함
		/*
		 * 1.포인터(start, end)를 처음과 끝에 2개를 배치
		 * 2.중간 값을 구함
		 * 3. 중간 값이 찾는 값인지 확인
		 * 4. 중간 값이 찾는 값보다 크다면, end를 중간값 -1로 내림
		 * 5. 중간 값이 찾는 값보다 작다면, start를 중간값+1로 올림		 * 
		 */
		
		//찾는 값이 없으면 start와 end가 교차하는 지점이 생김
		int[] arr = {1,3,5,10,20,30,50,80,100};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("찾을 값 >");
		int find = scan.nextInt();
				
		int start = 0;
		int end = arr.length-1; //8
		
		int count = 0; //회전수 확인
		
		while(start<=end) {
			
			count++; //회전수 확인
			
			//중간 값
			int mid = (start + end) / 2;
			
			if(arr[mid]==find) {
				System.out.println("회전수: "+count);
				System.out.println("찾을 값은: "+mid+"번째 존재함");
				break;
			} //여기에 else로 찾는 값이 없다는 것을 넣으면 못 찾을 때마다 문구가 반복 됨 
			
			//찾을 값이 중간 값보다 큰 경우
			if(arr[mid] < find) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}					
		}
		
		//두 지점이 교차했다면, 찾는 값은 없음
		if(start>end) {
			System.out.println("찾는 값은 없습니다");
		}
		
		
		//이진탐색 - 찾은 위치를 알려줌 (배열 이름, 찾을 값)
		//찾는 값이 없으면 음수를 알려줌
		System.out.println(Arrays.binarySearch(arr, 50));
					
		

	}

}
