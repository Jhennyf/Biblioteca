package biblioteca;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Obra implements Serializable{

	private static final long serialVersionUID = 1L;
	private int id;
	private int tiposObrasDisponiveis;
	private String titulo;
	private String autor;
	private int ano;
	private boolean digital;
	
	public static ArrayList<Livros> listaLivros = new ArrayList<Livros>();

	public Obra() {
		
	}
	
	public Obra(int id, String titulo, String autor, int ano, int tiposObrasDisponiveis ) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
		this.tiposObrasDisponiveis = tiposObrasDisponiveis;
	}
	

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Obra(int tiposObrasDisponoveis) {
		this.tiposObrasDisponiveis = tiposObrasDisponoveis;
	}
	
	
	public int getTiposObraDisponiveis() {
		return tiposObrasDisponiveis;
	}

	public void setTiposObraDisponiveis(int tiposObraDisponiveis) {
		this.tiposObrasDisponiveis = tiposObraDisponiveis;
	}

	public boolean isDigital() {
		return digital;
	}

	public void setDigital(boolean digital) {
		this.digital = digital;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public void ler(int valor) {
		
	}

	public static void percorrer(int valor) {
		int i = 0;
		while(valor != Obra.listaLivros.get(i).getId()) {
			i = i+1;
		}
		Obra.listaLivros.get(i).ler(valor);
	}
}
