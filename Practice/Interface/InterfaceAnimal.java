interface animalEating{
	public void eat();
}

interface animalRelaxing{
	public void relaxing();
}

class Animal implements animalEating, animalRelaxing{
	public void eat(){
		System.out.println("Animal is eating");
	}
	public void relaxing(){
		System.out.println("Animal is Relaxing");
	}
}

public class InterfaceAnimal {
	public static void main(String[] args) {
		Animal Donkey = new Animal();
		Donkey.eat();
		Donkey.relaxing();
	}
}
