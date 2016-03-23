package paket_interfejs;

import java.util.Date;

import menjacnica.Kurs;
import menjacnica.Valuta;

public interface InterfejsMenjacnica {
	public void dodajKursValute(Valuta v, Date datum, double prodajni, double srednji, double kupovni);
	public void brisiKursValute(Valuta v, Date datum);
	public Kurs pronadjiIVratiKurs(Valuta v, Date datum);
}
