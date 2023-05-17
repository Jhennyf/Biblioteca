package Usuarios;

import java.io.Serializable;
import java.util.ArrayList;

import biblioteca.Livros;

public abstract class Pessoa implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String nome;
	private int idade;
	private String sexo;
	private int telefone;
	private int modo;
	private int limite;
	
	public static ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
	public static ArrayList<Livros> meusLivros = new ArrayList<Livros>();
	
	public Pessoa() {
		
	}
	
	public Pessoa(int id, String nome, int idade, String sexo, int telefone, int modo, int limite) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.telefone = telefone;
		this.limite = limite;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getModo() {
		return modo;
	}

	public void setModo(int modo) {
		this.modo = modo;
	}

	public int getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}
}
