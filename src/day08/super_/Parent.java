package day08.super_;

public class Parent {
	
	String mother;
	String father;
	
	Parent() {
		
	}
	
	Parent(String mother, String father) {
		this.mother = mother;
		this.father = father;
		
	}
	
	String info() {
		return "name:"+mother+", nmae"+father;
	}

}
