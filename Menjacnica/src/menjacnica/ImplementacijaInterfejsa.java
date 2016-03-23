package menjacnica;

import java.util.Date;
import java.util.LinkedList;

import paket_interfejs.InterfejsMenjacnica;

public class ImplementacijaInterfejsa implements InterfejsMenjacnica {

	@Override
	public void dodajKursValute(Valuta v, Date datum, double prodajni, double srednji, double kupovni) {
		if(v == null && datum == null)
			throw new RuntimeException();
		
		Kurs noviKurs = new Kurs();
		noviKurs.setDatum(datum);
		noviKurs.setKupovni(kupovni);
		noviKurs.setSrednji(srednji);
		noviKurs.setProdajni(prodajni);
		v.getListaKurseva().add(noviKurs);
			

	}

	@Override
	public void brisiKursValute(Valuta v, Date datum) {
		LinkedList<Kurs> lista = v.getListaKurseva();
		for(int i = 0; i < lista.size(); i++){
			if(lista.get(i).getDatum().equals(datum)){
				lista.remove(i);
			}
		}

	}

	@Override
	public Kurs pronadjiIVratiKurs(Valuta v, Date datum) {
		LinkedList<Kurs> lista = v.getListaKurseva();
		for (Kurs kurs : lista) {
			if(kurs.getDatum().equals(datum))
				return kurs;
		}
		return null;
	}

}
