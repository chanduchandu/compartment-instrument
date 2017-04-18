package compartmentinstrument;

public abstract class Compartment {
	abstract void notice();
}
class Firstclass extends Compartment{

	void notice() {
		System.out.println("firstclass passengers");
	}
	
}
class General extends Compartment{

	void notice() {
		System.out.println("general passengers");
		
	}	
}
class ladies extends Compartment{

	void notice() {
		System.out.println("ladies passengers");
		
	}

}
class Luggage extends Compartment{

	void notice() {
		System.out.println("luguage compartment");
		
	}
	
}

