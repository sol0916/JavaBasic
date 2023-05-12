package day01;

public class Casting04 {
	
	public static void main(String[] args) {
		
		//문자열을 기본 타입으로 강제 타입 변환
		String a = "10";
		
		byte b = Byte.parseByte(a);
		short s = Short.parseShort(a);
		int i = Integer.parseInt(a);
		long l = Long.parseLong(a);
		float f = Float.parseFloat(a);
		double d = Double.parseDouble(a);
		
		System.out.println("byte 타입 형 변환 : "+b);
		System.out.println("short 타입 형 변환 : "+s);
		System.out.println("int 타입 형 변환 : "+i);
		System.out.println("long 타입 형 변환 : "+l);
		System.out.println("float 타입 형 변환 : "+f);
		System.out.println("double 타입 형 변환 : "+d);
		
		
		String a1 = "true";
		boolean bl = Boolean.parseBoolean(a1);
		boolean bl1 = Boolean.parseBoolean(a);
		
		System.out.println("boolean 타입 형 변환 : "+bl);
		System.out.println("boolean 타입 형 변환 : "+bl1);
		
	
		
	}

}
