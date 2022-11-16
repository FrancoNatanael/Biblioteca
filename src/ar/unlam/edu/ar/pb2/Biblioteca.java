package ar.unlam.edu.ar.pb2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Biblioteca {

	private TreeSet<Libro> libros = new TreeSet<Libro>();
	private ArrayList<Libro> librosVendidos = new ArrayList<Libro>();
	
	public void guardarLibro(Libro libro){
		libros.add(libro);
	}
	
	public void comprarLibro(Libro libro) {
		librosVendidos.add(libro);
	}
	
	public boolean seComproDosVecesElMismoLibro(Libro libro) {
		Integer veces = 0;
		
		for(Libro l : librosVendidos) {
			if(l.equals(libro)) {
				veces++;
			}
		}
		
		if(veces>=2) {
			return true;
		}
		return false;
	}
	
	public void asignarGenero(String genero, Libro libro) {
		
	}
	
	public Integer contarLibrosPorGenero(String genero) {
		Integer c = 0;
		
		for(Libro l : libros) {
			if(l.getGenero() == genero) {
				c++;
			}
		}
		return c;
	}
	
	public Map<String,Integer> contarLibrosPorCadaGenero() {
		
		Map<String,Integer> generos = new HashMap<String,Integer>();
		
		for(Libro libro : libros) {
			if(!generos.containsKey(libro.getGenero())) {
				generos.put(libro.getGenero(), 1);
			}else {
				generos.put(libro.getGenero(), generos.get(libro.getGenero())+1);
			}
			
		}
		
		return generos;
		
	}
	
	public void ordenarPorLargo() {
		
		List<Libro> sortedList = new ArrayList<>(libros);
		
		Collections.sort(sortedList, new CompararPorLargo());
	}
	
	public void ordenarPorApellido() {
		
		List<Libro> sortedList = new ArrayList<>(libros);
		
		Collections.sort(sortedList, new CompararPorApellido());
	}
	
	public void ordenarPorPublicacion() {
		
		List<Libro> sortedList = new ArrayList<>(libros);
		
		Collections.sort(sortedList);
	}
	
	public Set<Libro> getLibros(){
		return this.libros;
	}
	
	
}
