package day10.abstract_.bad;

public class SeoulStore extends Store {
	
	//추상메서드가 없다면?
	//자식 클래스에서 반드시 오버라이딩을 했어야 했는데, 깜박하고 하지 않은 경우에는 잘못된 메서드로 실행
	public void apple() {
		System.out.println("서울지점 사과는 500원");
	}

	public void grape() {
		System.out.println("서울지점 포도는 600원");
	}
	
	public void orange() {
		System.out.println("서울지점 오렌지는 700원");
	}
	
	

}
