package day02;

public class ContinueEx01 {

	public static void main(String[] args) {
		
		//continue는 반복문을 건너뜀
		//for문에서는 증/감식으로 이동됨
		/* for(int i=1; i<=10; i++) {
			
			if(i==5) {
				continue;
			}
				System.out.println(i);
		}
		*/
		
		//while문에서는 continue는 조건식으로 감
		int i = 1;
		while(i<=10) {
			
			if(i==5) {
				continue;
			}
			System.out.println(i);
			i++;
		}

	}

}
