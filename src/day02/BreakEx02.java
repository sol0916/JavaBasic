package day02;

import java.util.Scanner;

public class BreakEx02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("4 x 3 = ?>");			
			System.out.println("정답>");
			int answer = scan.nextInt();
			
			if(answer==12) {
				System.out.println("정답!");
				break;
			} else {
				System.out.println("다시 생각해 보세요");
			}
			
		}

	}

}
