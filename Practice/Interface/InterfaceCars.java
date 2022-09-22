interface Cars{
	public void Sedan();
	public void SUV();
	public void Exotic();
}

class NewCars implements Cars{
	public void Sedan(){
		System.out.println("Sedan: BMW, Mercedes");
	}
	public void SUV(){
		System.out.println("SUV: Lamborgini, Jeep");
	}
	public void Exotic(){
		System.out.println("Exotic: Buggati, Ferrari");
	}
}

public class InterfaceCars {
	public static void main(String arg[]) {
		NewCars a = new NewCars();
		a.Sedan();
		a.SUV();
		a.Exotic();
	}
}
