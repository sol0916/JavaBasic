package day10.static_.basic;

public class MyArraysA {
	
	private MyArraysA() {}
	
	public static String printArray(String[] arr) {
		String str = "[";		
		for(int i=0; i<arr.length; i++) {
			str += arr[i];
			if(i==arr.length-1) {
				return str += "]";
			}
			str += ", ";
		}
		str += "]";		
		return str;
	}

	public static String printArray(int[] arr) {
		String str = "[";		
		for(int i=0; i<arr.length; i++) {
			str += arr[i];
			if(i==arr.length-1) {
				return str += "]";
			}
			str += ", ";
		}
		str += "]";		
		return str;
	}

	public static String printArray(char[] arr) {
		String str = "[";		
		for(int i=0; i<arr.length; i++) {
			str += arr[i];
			if(i==arr.length-1) {
				return str += "]";
			}
			str += ", ";
		}
		str += "]";		
		return str;
	}

}
