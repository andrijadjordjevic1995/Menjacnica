package menjacnica;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Kurs {
	private Date datum;
	private double prodajni;
	private double srednji;
	private double kupovni;
	
	public Date getDatum() {
		return datum;
	}
	public void setDatum(Date datum) {
		if(datum == null)
			throw new RuntimeException("Nije unet odgovarajuci datum.");
		this.datum = datum;
	}
	public double getProdajni() {
		return prodajni;
	}
	public void setProdajni(double prodajni) {
		if(prodajni <= 0)
			throw new RuntimeException("Kurs ne sme biti manji od nule.");
		this.prodajni = prodajni;
	}
	public double getSrednji() {
		return srednji;
	}
	public void setSrednji(double srednji) {
		if(srednji <= 0)
			throw new RuntimeException("Kurs ne sme biti manji od nule.");
		this.srednji = srednji;
	}
	public double getKupovni() {
		return kupovni;
	}
	public void setKupovni(double kupovni) {
		if(kupovni <= 0)
			throw new RuntimeException("Kurs ne sme biti manji od nule.");
		this.kupovni = kupovni;
	}
	
	@Override
	public String toString() {
		DateFormat dF = new SimpleDateFormat("dd/MM/yyyy");
		String datumF = dF.format(datum);
		return "Datum: "+datumF+"\n\t Prodajni: "+prodajni+"\n\t Srednji: "+srednji+"\n\t Kupovni: "+kupovni;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Kurs){
			Kurs pom = (Kurs)obj;
			if(prodajni == pom.getProdajni()
					&& kupovni == pom.getKupovni()
					&& srednji == pom.getSrednji())
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
