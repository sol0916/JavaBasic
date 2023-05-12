package day02;

import java.util.Scanner;

public class ContinueEx02 {

	public static void main(String[] args) {

		//continue의 활용???

		Scanner scan = new Scanner(System.in);

		System.out.print("정수 입력 >");
		int num = scan.nextInt();

		int sum = 0;

		for(int i=1; i<=num; i++) {

			int count = 0;

			x:for(int j=1; j<=i; j++) {				
				//System.out.println(i+"-"+j);
				//각각의 i값이 소수인지를 판별해서 소수라면, sum에 누적하는 코드
				//적절한 시점에 초기화를 해야함
				if(i%j==0) {
					count++;				
				}
				
				if(count >=2) continue x; //약수개수가 2개 초과라면 다음 수 확인
			}

			if(count==2) {
				sum += i;
			}

		} //end for
		
		System.out.print(sum+" ");

		scan.close();

	}

}
