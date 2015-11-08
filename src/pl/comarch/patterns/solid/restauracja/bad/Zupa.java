package pl.comarch.patterns.solid.restauracja.bad;

import java.util.ArrayList;
import java.util.List;

public class Zupa {
	List<Skladnik> skladniki = new ArrayList<Skladnik>();

	String nazwa;
	public Zupa(){
		nazwa = "rosol";
	}
	public Zupa(String nazwa){
		this.nazwa = nazwa;
	}
	public void przygotuj() {
		System.out.println("Przygotowanie zupy ze sk�adnik�w: "+skladniki);
		System.out.println("Nalewam wod� do garnka");
		//System.out.println("Wrzucam kostk� roso�ow�");
		//nazwa = "rosol";
		if(nazwa.equals("rosol")){
			System.out.println("Wrzucam kostk� roso�ow�");
		}else if(nazwa.equals("pomidorowa")){
			System.out.println("Uzywam koncentratu pomidorowego");
		}
		for(Skladnik skladnik:skladniki) {
			if(skladnik instanceof Marchewka) {
				Marchewka marchewka = (Marchewka)skladnik;
				marchewka.obierz();
				marchewka.pokroj();
			}
			if(skladnik instanceof Makaron) {
				Makaron makaron = (Makaron)skladnik;
				makaron.gotuj();
			}else if(skladnik instanceof Ryz){
				Ryz ryz = (Ryz)skladnik;
				ryz.gotuj();
			}

			
		}
			
	}
	
	public void podaj() {
		System.out.println("Podanie obiadu");
		System.out.println("Podaj� "+nazwa+ " do sto�u");
	}

	public void wyslijNaWynos(String adres){
		System.out.println("Wysyla "+nazwa+ "do: "+adres);
	}
}
