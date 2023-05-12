package day01;

public class Casting05 {
	
	public static void main(String[] args) {
		
		byte b = 0;
		short s = 10;
		int i = 100;
		long l = 1000L;
		float f = 10.0F;
		double d = 1000.0;
		
		
		String str = String.valueOf(b);
		String str1 = String.valueOf(s);
		String str2 = String.valueOf(i);
		String str3 = String.valueOf(l);
		String str4 = String.valueOf(f);
		String str5 = String.valueOf(d);
		
		System.out.println("String으로 형 변환 : "+str);
		System.out.println("String으로 형 변환 : "+str1);
		System.out.println("String으로 형 변환 : "+str2);
		System.out.println("String으로 형 변환 : "+str3);
		System.out.println("String으로 형 변환 : "+str4);
		System.out.println("String으로 형 변환 : "+str5);
		
		
	}

}
