package day04;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {
		
		//문자열 다루기
		//문자열은 사실 배열입니다 문자열은 인덱스가 있습니다
		
		String str = "안녕하세요~";
		String str2 = "안녕하세요~ 영어로하면 하이!";
		//System.out.println(str[0]); //안됨
		
		//문자열을 다루는 다양한 메소드를 제공
		//문자열은 한글자 자르기 charAt
		char c = str.charAt(0);
		System.out.println(c);
		
		//문자열의 위치 확인 indexOf, lastIndexOf - 없다면 -1 반환
		int idex = str.indexOf("안"); 
		System.out.println("문자의 위치:"+idex);
		
		int idx2 = str2.lastIndexOf("하");
		System.out.println("뒤에서부터 찾은 위치:"+idx2);
		
		//문자열 변환 toUpperCase, toLowerCase
		String s = "abcDEF";
		
		String result = s.toUpperCase();
		System.out.println(result);
		System.out.println(s); //★원본문자열은 그대로 유지★
		
		String result2 = s.toLowerCase();
		System.out.println(result2);
		
		
		System.out.println("======================");
	
		//문자열 변경 replace
		s = "abcdefaaa";
		String result3 = s.replace("a", "x");
		System.out.println(result3); // a > x로 변경 (전부 다)
		
		String result4 = s.replaceFirst("a","x"); 
		System.out.println(result4); // a > x로 변경 (첫번째만)
		
		
		System.out.println("======================");
		
		
		//공백 제거 trim
		str = "  010-1111-2222   ";
		
		String result5 = str.trim();
		System.out.println(result5); //공백을 제거해서 반환
		
		str = "  안녕 하세요? 오늘은 4월 19일 입니다  ";
		str = str.replace(" ", "");
		System.out.println(str);
		
	
		System.out.println("======================");
		
		//문자열 자르기
		//substring - index 기준
		str = "010-1111-2222";
		String result6 = str.substring(9); //인덱스 번째 미만 전삭
		System.out.println(result6);
		
		
		//str은 변함 없음
		String result7 = str.substring(4, 8);
		System.out.println(result7);
		
		//split - 특정문자를 기준으로 자름(제대로 사용하려면 정규표현식)
		
		String[] arr  = str.split("-");
		System.out.println(Arrays.toString(arr));
		
		//한글자씩 자르기
		String[] arr2  = str.split("");
		System.out.println(Arrays.toString(arr2));

		
		//toCharArray - 한글자씩 char형으로 자름
		char[] arr3 = str.toCharArray();
		System.out.println(Arrays.toString(arr3));

		
		System.out.println("======================");
		
		//문자열의 길이
		str = "안녕하세요";
		int len = str.length();
		System.out.println("문자열 길이:"+len);
		
		//문자열의 비교 equals() 
		
		if(str.equals("안녕하세요")) {
			System.out.println("두 문자가 같음");
		}
		
		//문자열의 포함 여부 contains
		if(str.contains("녕")) {
			System.out.println("녕이 포함되어 있음");
		}
		
		

	}

}
