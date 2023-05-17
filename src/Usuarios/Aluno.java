
package Usuarios;


import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

import DAOControler.AlunoDAO;


public class Aluno extends Pessoa {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Scanner ler = new Scanner(System.in);
	private int matricula;
	private String curso;
	
	public static ArrayList<Pessoa> mostrarPessoas = new ArrayList<Pessoa>();
	
	public Aluno() {
		
	}
	
	public Aluno(int id, String nome, int idade, String sexo, int telefone, int matricula, String curso) {
		super(id, nome, idade, sexo, telefone, matricula, matricula);
		this.matricula = matricula;
		this.curso = curso;
	}
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	@Override
	public String toString() {
		return "Login Aluno"
				+ "\nNome: " + getNome()
				+ "\nIdade: " + getIdade() 
				+ "\nSexo: " + getSexo() 
				+ "\nTelefone: " + getTelefone()
				+ "\nmatricula: " + getMatricula() 
				+ "\nCurso: " + getCurso();
	}
	
	
	public Aluno defineEstudante() {
			System.out.println("Login Estudante");
			Aluno aluno = new Aluno();
			//ACRESCRETAR ID
			
			System.out.println("Digite seu nome: ");
			aluno.setNome(ler.nextLine());
			
			System.out.println("Digite sua idade: ");
			aluno.setIdade(ler.nextInt());
			
			System.out.println("Digite seu Telefone: ");
			aluno.setTelefone(ler.nextInt());
			
			System.out.println("Digite seu genero: ");
			aluno.setSexo(ler.next());	
			
			System.out.println("Digite sua matricula: ");
			aluno.setMatricula(ler.nextInt());
			
			System.out.println("Digite seu curso: ");
			aluno.setCurso(ler.next());
			
			System.out.println(aluno.toString());
		
		return aluno;
	}

	
	public Pessoa ler(int matricula) {
		String local = "C:\\\\Users\\jhenn\\eclipse-workspace\\Biblioteca\\Estudantes\\";
		try {
			FileInputStream file = new FileInputStream(local+"Aluno - "+ matricula);
			try (ObjectInputStream stream = new ObjectInputStream(file)) {
				return (Aluno) stream.readObject();
			}
		}catch (Exception erro) {
			System.out.println("Falha na leitura \n "+ erro.toString());
			return null;
		}
	}

	
	public String gravar(Aluno aluno) {
	AlunoDAO alunoDAO = new AlunoDAO();	
		return alunoDAO.gravar(aluno);
	}

	
	public void excluir() {
		// TODO Auto-generated method stub
		
	}

	
	public void atualizar() {
		// TODO Auto-generated method stub
		
	}
	
}
