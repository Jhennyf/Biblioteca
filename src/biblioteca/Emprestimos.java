package biblioteca;

import java.io.File;
import java.io.FileWriter;
import java.io.Serializable;
import java.util.Scanner;
import java.util.ArrayList;

import Usuarios.Aluno;
import Usuarios.Pessoa;
import interface_biblioteca.DAOAluno;

public class Emprestimos implements DAOAluno, Serializable{
	
	private static final long serialVersionUID = 1L;
	private int id;
	private int dataEmprestimo;
	private int horaEmprestimo;
	private Livros livro;
	private Pessoa pessoa;
	private int dias;

	public static ArrayList<Emprestimos> listaEmprestimos = new ArrayList<Emprestimos>();
	
	
	public Emprestimos() {
			
	}
		
	public Emprestimos(int id, int dataEmprestimo, int horaEmprestimo, Livros livro, Pessoa pessoa, int dias) {
		super();
		this.id = id;
		this.dataEmprestimo = dataEmprestimo;
		this.horaEmprestimo = horaEmprestimo;
		this.livro = livro;
		this.setPessoa(pessoa);
		this.dias = dias;
			
	}
	public static void percorrer(int valor) {
		int i = 0;
		while(valor != listaEmprestimos.get(i).getId()) {
			i = i+1;
		}
		listaEmprestimos.get(i);
		Emprestimos.ler(valor);
	}
	
	public void devolverLivro() {
		livro.setEmprestimo(true);
		System.out.println("livro devolvido.");
	}
	
	public void cadEmprestimo() {
		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("Realize um emprestimo: ");
			Emprestimos emprestimo = new Emprestimos();
			
			System.out.println("Defina um ID: ");
			emprestimo.setId(ler.nextInt());
			ler.nextLine();
			
			System.out.println("Data do emprestimo: ");
			emprestimo.setDataEmprestimo(ler.nextInt());
			
			System.out.println("Hora do emprestimo: ");
			emprestimo.setHoraEmprestimo(ler.nextInt());
			
			emprestimo.setDias(emprestimo.getPessoa());
			emprestimo.getPessoa();
			
			if(Pessoa.meusLivros.size() < emprestimo.getPessoa().getLimite()) {
				listaEmprestimos.add(emprestimo);
				emprestimo.getPessoa();
				Pessoa.meusLivros.add(emprestimo.getLivro());
				System.out.println(emprestimo.toString() + "\n");
				emprestimo.gravar();
			} else {
				System.out.println("\nLimite de emprestimo atingido para esse usuario.");
			}
		}	
	}

	public Livros getLivro() {
		return livro;
	}
	public void setLivro(Livros livro) {
		this.livro = livro;
	}
	public int getDataEmprestimo() {
		return dataEmprestimo;
	}
	public void setDataEmprestimo(int dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}
	public int getHoraEmprestimo() {
		return horaEmprestimo;
	}
	public void setHoraEmprestimo(int horaEmprestimo) {
		this.horaEmprestimo = horaEmprestimo;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(Pessoa pessoa) {
		int dias;
		if(pessoa.getModo()==1) {
			dias = 30;
			this.dias = dias;
		} else if(pessoa.getModo()==2) {
			dias = 15;
			this.dias = dias;
		} else {
			dias = 7;
			this.dias = dias;
		}
	}

	
	public String gravar() {
		String local = "\"C:\\Users\\jhenn\\eclipse-workspace\\Biblioteca\\src\\arquivos\"";
		String resultado = "Arquivo salvo!";
		String content = toString();
		try {
			FileWriter file = new FileWriter(local+"Emprestimo - "+getId());
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

	public static void ler(int id) {
		String local = "\"C:\\Users\\jhenn\\eclipse-workspace\\Biblioteca\\src\\arquivos\"";
		try {
			File file = new File(local+"Emprestimo - "+id);
			try (Scanner ler = new Scanner(file)) {
				while(ler.hasNextLine()) {
					System.out.println(ler.nextLine());
				}
			}
		}catch (Exception erro) {
			System.out.println("Falha na leitura!"+ erro.toString());
		}
	}

	@Override
	public String gravar(Aluno aluno) {
		// TODO Auto-generated method stub
		return null;
	}	
	
}
