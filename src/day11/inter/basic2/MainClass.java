package day11.inter.basic2;

public class MainClass {

	public static void main(String[] args) {
		
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal tiger = new Tiger();
		
		Animal[] animals = {dog, cat, tiger};
		
		for(Animal ani : animals) {
			ani.eat();
		}
		
		System.out.println();
		
		//dog, cat은 인터페이스 타입으로 형변환이 됩니다
		//dog, cat, goldfish를 저장하고, IPet의 기능을 사용
		IPet[] pets = new IPet[3];
				
		//tiger는 IPet의 기능이 없기 때문에 에러
		pets[0] = (IPet)dog;
		pets[1] = (IPet)cat;
		pets[2] = new GoldFish();
		
		for(IPet ip : pets) {
			ip.play();
		}
		
		System.out.println("---------------------------");
		
		PetHouse.carePet((IPet)dog);
		PetHouse.carePet((IPet)cat);
		PetHouse.carePet(pets[2]);

	}

}
