package pl.comarch.patterns.solid.kurier.bad;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Kurier {
	List<Paczka> paczki;
	// List<Miejscowosc> miejscowosci = new ArrayList<Miejscowosc>();
	Map<String, List<Paczka>> paczkiWMiejscowosciach = new HashMap<String, List<Paczka>>();
	Map<String, List<Samochod>> samochodyWMiejscowosciach = new HashMap<String, List<Samochod>>();

	public void nadaj(Paczka paczka, String miejscowosc) {
		List<Paczka> paczki = paczkiWMiejscowosciach.get(miejscowosc);
		if (paczki == null) {
			paczki = new ArrayList<Paczka>();
			paczkiWMiejscowosciach.put(miejscowosc, paczki);
		}
		paczki.add(paczka);
	}

	public Paczka odbierz(String adresat, String miejscowosc) {
		List<Paczka> paczki = paczkiWMiejscowosciach.get(miejscowosc);
		Paczka znalezionaPaczka = null;
		for (Paczka paczka : paczki)
			if (paczka.adresat.equals(adresat)) {
				znalezionaPaczka = paczka;
			}
		paczki.remove(znalezionaPaczka);
		return znalezionaPaczka;
	}

	public int przewiez(String m1, String m2, Samochod samochod,
			List<Paczka> paczki) {
		int wagaWszystkichPaczkek = 0;
		for(Paczka paczka : paczki){
			wagaWszystkichPaczkek += paczka.waga;
		}
		if (wagaWszystkichPaczkek > samochod.ladownosc) {
			System.out.println("Za duza waga paczek");
			return 0;
		}

		List<Paczka> paczki1 = paczkiWMiejscowosciach.get(m1);
		paczki1.removeAll(paczki);
		List<Paczka> paczki2 = paczkiWMiejscowosciach.get(m2);
		if (paczki2 == null) {
			paczki2 = new ArrayList<Paczka>();
			paczkiWMiejscowosciach.put(m2, paczki2);
		}
		paczki2.addAll(paczki);

		samochodyWMiejscowosciach.get(m1).remove(samochod);
		List<Samochod> samochody = samochodyWMiejscowosciach.get(m2);
		if (samochody == null) {
			samochody = new ArrayList<Samochod>();
			samochodyWMiejscowosciach.put(m2, samochody);
		}
		samochody.add(samochod);

		return 1;
	}

}
