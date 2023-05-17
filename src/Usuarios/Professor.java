package Usuarios;

import java.util.Scanner;

public class Professor extends Pessoa {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Scanner ler = new Scanner (System.in);
	private String diciplina;
	
	public Professor() {
		
	}
	
	public Professor(int id, String nome, int idade, String sexo, int telefone, int modo, int limite, String diciplina) {
		super(id, nome, idade, sexo, telefone, modo, limite);
		this.diciplina = diciplina;
	}
	
	
	public String getDiciplina() {
		return diciplina;
	}
	public void setDiciplina(String diciplina) {
		this.diciplina = diciplina;
	}

	public void defineProfessor() {
		
		System.out.println("Login Professor");
		Professor professor = new Professor();
		
		
		System.out.println("Digite o ID: ");
		professor.setId(ler.nextInt());
		
		System.out.println("Digite seu nome: ");
		professor.setNome(ler.next());
		
		System.out.println("digite sua Idade: ");
		professor.setIdade(ler.nextInt());
		
		System.out.println("Digite seu genero");
		professor.setSexo(ler.next());
		
		System.out.println("Digite seu telefone");
		professor.setTelefone(ler.nextInt());
		
		System.out.println("Digite a diciplina: ");
		professor.setDiciplina(ler.next());
		
		System.out.println(professor.toString());
	}

	@Override
	public String toString() {
		return "Professor "
				+ "\nNome: " + getNome() 
				+ "\nIdade: " + getIdade() 
				+ "\nSexo: " + getSexo() 
				+ "\nTelefone: " + getTelefone()
				+ "\ndiciplina: " + diciplina ;
	}

}
