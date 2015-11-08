package pl.comarch.patterns.solid.restauracja.bad;

public class Makaron extends Skladnik {
	@Override
	public String toString() {
		return "makaron";
	}
	
	public void gotuj() {
		System.out.println("Gotowanie makaronu");
	}
	
}
