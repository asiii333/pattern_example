package pl.comarch.patterns.solid.restauracja.good;

import pl.comarch.patterns.solid.restauracja.good.potrawy.Pomidorowa;
import pl.comarch.patterns.solid.restauracja.good.potrawy.Rosl;
import pl.comarch.patterns.solid.restauracja.good.pracownicy.Kelner;
import pl.comarch.patterns.solid.restauracja.good.pracownicy.Kucharz;
import pl.comarch.patterns.solid.restauracja.good.pracownicy.Kurier;
import pl.comarch.patterns.solid.restauracja.good.skladniki.Makaron;
import pl.comarch.patterns.solid.restauracja.good.skladniki.Marchewka;
import pl.comarch.patterns.solid.restauracja.good.skladniki.Skladnik;

import java.util.ArrayList;

public class Test {
	static Restauracja restauracja = new Restauracja(new Kucharz());

	public static void main(String[] args) {
		//przygotujZupe();
		//Restauracja restauracja = new Restauracja(new Kucharz());
		nowyRosulDoStolu();

}
	public static void przygotujZupe() {
		ArrayList<Skladnik> skladniki = new ArrayList<Skladnik>();
		skladniki.add(new Marchewka(7));
		skladniki.add(new Marchewka(7));
		Rosl rosol = new Rosl(skladniki);
		//restauracja.noweZamowienie(rosol);
	}
	public static void nowaPomidorowaZMakaronem(){
		ArrayList<Skladnik> skladniki = new ArrayList<Skladnik>();
		skladniki.add(new Marchewka(7));
		skladniki.add(new Makaron(7));
		IPotrawa pomidorowa = new Pomidorowa(skladniki);
		String adress = "Akacjowa 5/3";
		IKurier kurier = new Kurier();
		kurier.setDeliveryAdress(adress);
		restauracja.noweZamowienie(pomidorowa,kurier);
	}
	public static void nowyRosulDoStolu(){
		ArrayList<Skladnik> skladniki = new ArrayList<Skladnik>();
		skladniki.add(new Marchewka(7));
		skladniki.add(new Makaron(7));
		IPotrawa rosul = new Rosl(skladniki);

		IKelner kelner = new Kelner();
		kelner.przygotuj();
		restauracja.noweZamowienie(rosul, new Kelner());
	}

}
