package menjacnica;

import java.util.LinkedList;

public class Menjacnica {
	private LinkedList<Valuta> listaValuta;

	public LinkedList<Valuta> getListaValuta() {
		return listaValuta;
	}

	public void setListaValuta(LinkedList<Valuta> listaValuta) {
		this.listaValuta = listaValuta;
	}
	
	@Override
	public String toString() {
		String strListaValuta = "";
		for (Valuta valuta : listaValuta) {
			strListaValuta = strListaValuta + valuta.toString() + "\n";
		}
		return strListaValuta;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Menjacnica){
			Menjacnica v = (Menjacnica)obj;
			if(listaValuta.containsAll(v.getListaValuta())
					&& v.getListaValuta().containsAll(listaValuta))
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
