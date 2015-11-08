package pl.comarch.patterns.solid.restauracja.good.skladniki;

public abstract class Skladnik {
	private String nazwa;
	private int ilosc;

	public  Skladnik(String nazwa, int ilosc) {
		this.setNazwa(nazwa);
		this.setIlosc(ilosc);
	}
	public Skladnik(){

	}
	public abstract void przygotujSkladnik();

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public int getIlosc() {
		return ilosc;
	}

	public void setIlosc(int ilosc) {
		this.ilosc = ilosc;
	}
}
