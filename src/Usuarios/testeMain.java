package Usuarios;

import java.util.Scanner;

public class testeMain {
	
	public static void main(String[] args) {
	try (Scanner ler = new Scanner(System.in)) {
		int escolha;
		
		Aluno aluno = new Aluno();
		Funcionario funcio = new Funcionario();
		Professor prof = new Professor();

		System.out.println("Bem vindo ao cadastro.");
		System.out.println("Digite 1 para aluno");
		System.out.println("Digite 2 para Professor");
		System.out.println("Digite 3 para funcionario");
		escolha = ler.nextInt();
		
		switch(escolha) {
		case 1:
			aluno = aluno.defineEstudante();
			System.out.println(aluno.gravar(aluno));
			break;
		case 2:
			prof.defineProfessor();
			break;
		case 3:
			funcio.defineFuncionario();
			break;
		}
	}
	}
	
}
