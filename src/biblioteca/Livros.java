package biblioteca;

import java.io.File;
import java.io.FileWriter;
import java.io.Serializable;
import java.util.Scanner;

import interface_biblioteca.DAOAluno;

public class Livros extends Obra implements   Serializable{

	private static final long serialVersionUID = 1L;
	private String editora;
	private int edicao;
	private int numfolhas;
	private boolean emprestimo;
    private Obra obra;
   
	
	public Livros() {}
	
	public Livros(int id, String titulo, String autor, int ano, int tiposObrasDisponiveis, String editora,
				 int edicao, int numfolhas, boolean emprestimo) {
		
		super(id, titulo, autor, ano, tiposObrasDisponiveis);
		this.editora = editora;
		this.edicao = edicao;
		this.numfolhas = numfolhas;
		this.emprestimo = false;
	}
	
	public void ObrasDisponoveis() {
		System.out.println( "Quantidade de obras disponiveis: " + obra.getTiposObraDisponiveis());
	}
	
	
	public boolean getEmprestimo() {
		return emprestimo;
	}

	public void setEmprestimo(boolean emprestimo) {
		this.emprestimo = emprestimo;
	}
	
	public String abrirLivro() {
		if(emprestimo == true) {
			return "livro Aberto";
		}
		return fecharLivro();
	}
	
	public String fecharLivro() {
		if(emprestimo == false)
			return "livro fechado";
		return abrirLivro();	
	}
	
	public static void cadastrarLivro() {
		System.out.println("Cadastre um livro");
		
		try (Scanner ler = new Scanner(System.in)) {
			Livros livro = new Livros();
			
			System.out.println("Defina um ID: ");
			livro.setId(ler.nextInt());
			ler.nextLine();
			
			System.out.println("Titulo: ");
			livro.setTitulo(ler.nextLine());
			
			System.out.println("Autor: ");
			livro.setAutor(ler.nextLine());
			
			System.out.println("Editora: ");
			livro.setEditora(ler.nextLine());
			
			System.out.println("Edição: ");
			livro.setEditora(ler.nextLine());
			
			System.out.println("Numero de Folhas: ");
			livro.setNumfolhas(ler.nextInt());
			livro.setEmprestimo(false);
			
			Obra.listaLivros.add(livro);
			System.out.println(livro.toString() + "\n");
			livro.gravar();
		}
	}

	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	public int getEdicao() {
		return edicao;
	}
	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
	public int getNumfolhas() {
		return numfolhas;
	}
	public void setNumfolhas(int numfolhas) {
		this.numfolhas = numfolhas;
	}

	public Obra getObra() {
		return obra;
	}

	public void setObra(Obra obra) {
		this.obra = obra;
	}



	public String gravar() {
		String local = "\"C:\\Users\\jhenn\\eclipse-workspace\\Biblioteca\\src\\arquivos\"";
		String resultado = "Arquivo salvo!";
		String content = toString();
		try {
			FileWriter file = new FileWriter(local+"Livro - "+getId());
			file.write(content);
			file.close();
		} catch (Exception erro) {
			resultado = "Falha ao salvar!";
		}
		return resultado;
	}
	
	public void ler(int id) {
		String local = "\"C:\\Users\\jhenn\\eclipse-workspace\\Biblioteca\\src\\arquivos\"";
		try {
			File file = new File(local+"Livro - "+id);
			try (Scanner ler = new Scanner(file)) {
				while(ler.hasNextLine()) {
					System.out.println(ler.nextLine());
				}
			}
		}catch (Exception erro) {
			System.out.println("Falha na leitura!"+ erro.toString());
		}
	}	

	
	
	}	

