package day08.encap.good;

public class MainClass {
	
	public static void main(String[] args) {
		
		MyDate me = new MyDate();
		
		me.setYear(2022);
		me.setMonth(5);
		me.setDay(30);
		me.setSsn("1234567-891234");
		
		System.out.println(me.getYear()+"년"+me.getMonth()+"월"+me.getDay()+"일");
		System.out.println("주민번호:"+me.getSsn());
		

}
	

}
