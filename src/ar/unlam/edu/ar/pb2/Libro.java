package ar.unlam.edu.ar.pb2;

public class Libro implements Comparable<Libro>{
	
	private String autor;
	private String nombre;
	private String genero;
	protected String getGenero() {
		return genero;
	}


	protected void setGenero(String genero) {
		this.genero = genero;
	}


	private String anio;
	private Integer paginas;
	private Integer unidades;
	
	protected Integer getPaginas() {
		return paginas;
	}


	protected void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}


	public Libro() {
		
	}
	
	
	public Libro(String autor, String nombre, String anio) {
		super();
		this.autor = autor;
		this.nombre = nombre;
		this.anio = anio;
	}
	protected String getAutor() {
		return autor;
	}
	protected void setAutor(String autor) {
		this.autor = autor;
	}
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected String getAnio() {
		return anio;
	}
	protected void setAnio(String anio) {
		this.anio = anio;
	}


	@Override
	public int compareTo(Libro o) {
		return this.anio.compareTo(o.anio);
	}
	
	
	
	protected Integer getUnidades() {
		return unidades;
	}
	
	
	protected void setUnidades(Integer unidades) {
		this.unidades = unidades;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	
	
}
