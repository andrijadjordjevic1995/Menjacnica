package menjacnica;

import java.util.Date;

import paket_interfejs.InterfejsMenjacnica;

public class ImplementacijaInterfejsa implements InterfejsMenjacnica {

	@Override
	public void dodajKursValute(Valuta v, Date datum, double prodajni, double srednji, double kupovni) {
		// TODO Auto-generated method stub

	}

	@Override
	public void brisiKursValute(Valuta v, Date datum) {
		// TODO Auto-generated method stub

	}

	@Override
	public Kurs pronadjiIVratiKurs(Valuta v, Date datum) {
		// TODO Auto-generated method stub
		return null;
	}

}
