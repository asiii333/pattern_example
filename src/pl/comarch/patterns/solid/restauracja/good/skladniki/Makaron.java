package pl.comarch.patterns.solid.restauracja.good.skladniki;

public class Makaron extends Skladnik {
	public Makaron( int ilosc) {
		super("Makaron", ilosc);
	}

	@Override
	public void przygotujSkladnik() {
		gotuj();
	}

	@Override
	public String toString() {
		return "makaron";
	}
	
	private void gotuj() {
		System.out.println("Gotowanie makaronu");
	}
	
}
