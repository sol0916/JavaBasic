package day08.modi.protec.pac2;

import day08.modi.protec.pac1.A;

public class D extends A {
	
	//protected는 상속관계에서 super를 통한 접근이 가능함
	public D() {
		super();//상속이라 super가 생략된 것
		
		super.bool = true;
		super.method();
	}
		
		//override
		protected void method() { //protected라서 A클래스에 있는걸 override 된 것
			
		}
		
	}
	


