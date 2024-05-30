package poly.ex4;

public class AbstractMain {
	public static void main(String[] args) {

		// 추상클래스 생성 불가
		// AbstractAnimal abstractAnimal = new Abstractanimal();

		Dog dog = new Dog();
		Cat cat = new Cat();
		Cow cow = new Cow();

		cat.sound();
		cat.move(); // 고양이 이동
		
		soundAnimal(dog);
		soundAnimal(cat);
		soundAnimal(cow);
		
		moveAnimal(dog);
		moveAnimal(cat);
		moveAnimal(cow);
		
	}

	private static void soundAnimal(AbstractAnimal animal) {
		System.out.println("동물 소리 테스트 시작");
		animal.sound();
		System.out.println("동물 소리 테스트 종료");
	}
	
	private static void moveAnimal(AbstractAnimal animal) {
		System.out.println("동물 이동 테스트 시작");
		animal.move();
		System.out.println("동물 이동 테스트 종료");
	}

}
