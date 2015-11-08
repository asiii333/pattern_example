package pl.comarch.patterns.solid.restauracja.bad;

public class Marchewka extends Skladnik {
	public String toString() {
		return "marchewka";
	}
	public void obierz() {
		System.out.println("Obieranie marchewki");
	}
	public void pokroj() {
		System.out.println("Krojenie marchewki");
	}
}
