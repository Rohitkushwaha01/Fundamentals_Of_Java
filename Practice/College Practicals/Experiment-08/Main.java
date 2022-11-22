// interface Cars{
// 	public void Sedan();
// 	public void SUV();
// 	public void Exotic();
// }

// class NewCars implements Cars{
// 	public void Sedan(){
// 		System.out.println("Sedan: BMW, Mercedes");
// 	}
// 	public void SUV(){
// 		System.out.println("SUV: Lamborgini, Jeep");
// 	}
// 	public void Exotic(){
// 		System.out.println("Exotic: Buggati, Ferrari");
// 	}
// }

// public class InterfaceCars {
// 	public static void main(String arg[]) {
// 		NewCars a = new NewCars();
// 		a.Sedan();
// 		a.SUV();
// 		a.Exotic();
// 	}
// }

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

public class Main {
	public static void main(String[] args) {
		Animal Donkey = new Animal();
		Donkey.eat();
		Donkey.relaxing();
	}
}