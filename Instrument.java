package compartmentinstrument;

public abstract class Instrument {
abstract void play();
}
class Flute extends Instrument{

	void play() {
		System.out.println("flute is playing tin tin tin");
	}
	
}
class Piano extends Instrument{

	void play() {
		System.out.println("piano is playing toot toot toot");
	}
}
class Guitar extends Instrument{

	void play() {
		System.out.println("guitar is playing tan tan tan");
	}
	
}
