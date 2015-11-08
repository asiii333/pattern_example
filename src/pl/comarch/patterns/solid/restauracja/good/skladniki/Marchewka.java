package pl.comarch.patterns.solid.restauracja.good.skladniki;

public class Marchewka extends Skladnik {
	public Marchewka( int ilosc) {
		super("Marchewka", ilosc);
	}

	@Override
	public void przygotujSkladnik() {
		obierz();
		pokroj();
	}

	public String toString() {
		return "marchewka";
	}
	private void obierz() {
		System.out.println("Obieranie marchewki" + getIlosc());
	}
	private void pokroj() {
		System.out.println("Krojenie marchewki");
	}
}
