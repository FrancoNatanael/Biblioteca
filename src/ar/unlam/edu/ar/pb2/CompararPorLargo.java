package ar.unlam.edu.ar.pb2;

import java.util.Comparator;

public class CompararPorLargo implements Comparator<Libro>{

	@Override
	public int compare(Libro o1, Libro o2) {
		return o1.getPaginas().compareTo(o2.getPaginas());
	}

}
