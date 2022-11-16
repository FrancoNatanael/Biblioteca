package ar.unlam.edu.ar.pb2;

import java.util.Comparator;

public class CompararPorAutor implements Comparator<Libro>{

	@Override
	public int compare(Libro o1, Libro o2) {
		return o1.getAutor().compareTo(o2.getAutor());
	}

}
