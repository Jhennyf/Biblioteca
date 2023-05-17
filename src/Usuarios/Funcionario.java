package Usuarios;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.util.Scanner;

import interface_biblioteca.DAOAluno;

public class Funcionario extends Pessoa implements DAOAluno{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Scanner ler = new Scanner(System.in);
	private String setor;
	
	public Funcionario() {}
	
	public Funcionario(int id, String nome, int idade, String sexo, int telefone, int limite, String setor) {
		super(id, nome, idade, sexo, telefone, telefone, limite);
		this.setor = setor;
	}
	
	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	public void defineFuncionario() {
		System.out.println("Login Funcionario");
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Digite seu nome: ");
		funcionario.setNome(ler.nextLine());
		
		System.out.println("Digite a sua idade: ");
		funcionario.setIdade(ler.nextInt());
		
		System.out.println("Digite seu genero: ");
		funcionario.setSexo(ler.next());
		
		
		System.out.println("Digite o setor: ");
		funcionario.setSetor(ler.next());
		
		System.out.println(funcionario.toString());
	}

	@Override
	public String toString() {
		return "Login Funcionario "
				+ "\nNome: " + getNome() 
				+ "\nIdade: " + getIdade() 
				+ "\nSexo: " + getSexo()
				+ "\nTelefone: " + getTelefone() 
				+ "\nsetor: " + setor ;
	}

	
	public String gravar() {
		String local = "\"C:\\Users\\jhenn\\eclipse-workspace\\Biblioteca\\src\\arquivos\"";
		String resultado = "Arquivo salvo!";
		String content = toString();
		try {
			FileWriter file = new FileWriter(local+"Funcionario - "+getSetor());
			file.write(content);
			file.close();
		} catch (Exception erro) {
			resultado = "Falha ao salvar!";
		}
		return resultado;
	}

	@Override
	public void excluir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar() {
		// TODO Auto-generated method stub
		
	}
	
	public Pessoa ler(String setor) {
		String local = "\"C:\\Users\\jhenn\\eclipse-workspace\\Biblioteca\\src\\arquivos\"";
		try {
			FileInputStream file = new FileInputStream(local+"Funcionario- "+ setor);
			try (ObjectInputStream stream = new ObjectInputStream(file)) {
				return (Funcionario) stream.readObject();
			}
		}catch (Exception erro) {
			System.out.println("Falha na leitura \n "+ erro.toString());
			return null;
		}
	}

	@Override
	public String gravar(Aluno aluno) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
