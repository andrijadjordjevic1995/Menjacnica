package menjacnica;

import java.util.LinkedList;

public class Valuta {
	private String naziv;
	private String skraceniNaziv;
	private LinkedList<Kurs> listaKurseva;
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}
	public void setSkraceniNaziv(String skraceniNaziv) {
		this.skraceniNaziv = skraceniNaziv;
	}
	public LinkedList<Kurs> getListaKurseva() {
		return listaKurseva;
	}
	public void setListaKurseva(LinkedList<Kurs> listaKurseva) {
		this.listaKurseva = listaKurseva;
	}
	
}
