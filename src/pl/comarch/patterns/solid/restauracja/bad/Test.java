package pl.comarch.patterns.solid.restauracja.bad;

public class Test {
	public static void main(String[] args) {
		przygotujZupe();
		przygotujZupePomidorowaZMakaronem();
		przygotujZupePomidorowaZRyzemNaWynos();
}
	public static void przygotujZupe() {
		Zupa zupa = new Zupa();
		Marchewka marchewka = new Marchewka();
		zupa.skladniki.add(marchewka);
		Makaron makaron = new Makaron();
		zupa.skladniki.add(makaron);
		zupa.przygotuj();
		zupa.podaj();
	}
	public static void przygotujZupePomidorowaZRyzemNaWynos() {
		Zupa zupa = new Zupa("pomidorowa");
		Marchewka marchewka = new Marchewka();
		zupa.skladniki.add(marchewka);
		Ryz ryz = new Ryz();
		zupa.skladniki.add(ryz);
		zupa.przygotuj();
		zupa.wyslijNaWynos("Zapomorska 3/4");
	}
	public static void przygotujZupePomidorowaZMakaronem(){
		Zupa zupa = new Zupa("pomidorowa");
		Marchewka marchewka = new Marchewka();
		zupa.skladniki.add(marchewka);
		Makaron makaron = new Makaron();
		zupa.skladniki.add(makaron);
		zupa.przygotuj();
		zupa.podaj();
	}
}
