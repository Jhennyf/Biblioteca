package main;

import java.util.Scanner;

import Usuarios.Aluno;
import Usuarios.Funcionario;
import Usuarios.Pessoa;
import Usuarios.Professor;
import biblioteca.Emprestimos;
import biblioteca.Livros;
import biblioteca.Obra;

public class MainApplication {
	public static Scanner ler = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Professor profTeste = new Professor();
		Livros livroTeste = new Livros();
		Emprestimos emprestimoTeste = new Emprestimos();

		Emprestimos.listaEmprestimos.add(emprestimoTeste);
		Pessoa.listaPessoas.add(profTeste);
		Obra.listaLivros.add(livroTeste);
		
		int op;
		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("Biblioteca\n");
			
			do {
				menu();
				op = ler.nextInt();
				
				switch(op) {
				case 1:
					Livros.cadastrarLivro();
					break;
				case 2:
					cadPessoa();
					break;
				default:
					System.out.println("Opçao invalida.");
				}
			} while(op != 0);
		}
	}
	
	public static void menu() {
		System.out.println("Menu:");
		System.out.println("1- Cadastre livro");
		System.out.println("2- Cadastrar usuario");
		System.out.println("3- Realizar emprestimo");
	}
	
	public static void cadPessoa() {
		int escolha;
		Aluno aluno = new Aluno();
		Funcionario funcio = new Funcionario();
		Professor prof = new Professor();
		System.out.println("Cadastre - se");
		System.out.println("Digite 1 para aluno");
		System.out.println("Digite 2 para Professor");
		System.out.println("Digite 3 para funcionario");
		escolha = ler.nextInt();
		
		switch(escolha) {
		case 1:
			aluno.defineEstudante();
			break;
		case 2:
			prof.defineProfessor();
			break;
		case 3:
			funcio.defineFuncionario();
			break;
		default:
			System.out.println("invalido!");
		}
	}
}
