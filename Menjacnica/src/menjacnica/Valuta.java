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
		if(naziv == null || naziv.isEmpty())
			throw new RuntimeException("Nije unet odgovarajuci naziv.");
		this.naziv = naziv;
	}
	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}
	public void setSkraceniNaziv(String skraceniNaziv) {
		if(skraceniNaziv == null || skraceniNaziv.isEmpty())
			throw new RuntimeException("Nije unet odgovarajuci skraceni naziv.");
		this.skraceniNaziv = skraceniNaziv;
	}
	public LinkedList<Kurs> getListaKurseva() {
		return listaKurseva;
	}
	public void setListaKurseva(LinkedList<Kurs> listaKurseva) {
		if(listaKurseva == null)
			throw new RuntimeException("Nije uneta odgovarajuca lista kurseva.");
		this.listaKurseva = listaKurseva;
	}
	
	@Override
	public String toString() {
		return naziv + " " + skraceniNaziv;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Valuta){
			Valuta v = (Valuta)obj;
			if(naziv.equals(v.getNaziv()) && skraceniNaziv.equals(v.getSkraceniNaziv()))
				return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
}
