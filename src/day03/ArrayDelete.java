package day03;

import java.util.Arrays;

public class ArrayDelete {

	public static void main(String[] args) {
		
		//삭제의 개념 - 배열은 삭제가 없습니다
		//배열index의 값을 없앤 뒤, 뒤에 있는 정보를 끌어와 채움
		//arr[i] = arr[i+1]
		
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};		
		int[] newArr = new int[arr.length-1]; //삭제한 후 복사할 새로운 배열
				
		int index = 5; //삭제할 위치
		
		for(int i=index; i<arr.length-1; i++) {
			arr[i] = arr[i+1];
		}		
		
		//새로운 배열에, 기존 배열을 옴겨 담는 작업
		for(int i=0; i<newArr.length; i++) {
			newArr[i] = arr[i];
		}
		
		//기존 배열에 담기
		arr = newArr;
		newArr = null;
		
		System.out.println(Arrays.toString(newArr));
		System.out.println(Arrays.toString(arr));

	}

}
