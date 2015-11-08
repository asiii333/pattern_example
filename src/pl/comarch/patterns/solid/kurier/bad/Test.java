package pl.comarch.patterns.solid.kurier.bad;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		Kurier kurier = new Kurier();
		Samochod samochod = new Samochod();
		samochod.ladownosc = 500;
		List<Samochod> samochody = new ArrayList<Samochod>();
		samochody.add(samochod);
		kurier.samochodyWMiejscowosciach.put("Warszawa", samochody);

		Paczka paczka = new Paczka();
		paczka.adresat = "Olek";
		paczka.cel = "Katowice";
		paczka.zawartosc = "Zawartość paczki dla Olka";
		kurier.nadaj(paczka, "Gliwice");

		paczka = new Paczka();
		paczka.adresat = "Adam";
		paczka.cel = "Katowice";
		paczka.zawartosc = "Zawartość paczki dla Adama";
		kurier.nadaj(paczka, "Warszawa");

		kurier.przewiez("Warszawa", "Gliwice", kurier.samochodyWMiejscowosciach
				.get("Warszawa").get(0), new ArrayList<Paczka>(
				kurier.paczkiWMiejscowosciach.get("Warszawa")));

		kurier.przewiez("Gliwice", "Katowice", kurier.samochodyWMiejscowosciach
				.get("Gliwice").get(0), new ArrayList<Paczka>(
				kurier.paczkiWMiejscowosciach.get("Gliwice")));

		Paczka paczkaOlka = kurier.odbierz("Olek", "Katowice");
		Paczka paczkaAdama = kurier.odbierz("Adam", "Katowice");

		System.out.println("Olek: " + paczkaOlka.zawartosc);
		System.out.println("Adam: " + paczkaAdama.zawartosc);
	}
}
