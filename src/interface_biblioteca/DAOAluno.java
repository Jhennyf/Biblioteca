package interface_biblioteca;

import Usuarios.Aluno;

public interface DAOAluno {
	
	public String gravar(Aluno aluno);
	
	public void excluir();
	
	public static void ler() {}
	
	public void atualizar();
}
