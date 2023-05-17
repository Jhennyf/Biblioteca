package DAOControler;

import java.io.FileWriter;

import Usuarios.Aluno;
import interface_biblioteca.DAOAluno;

public class AlunoDAO implements DAOAluno{

	@Override
	public void excluir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String gravar(Aluno aluno) {
		String local = "C:\\Users\\jhenn\\eclipse-workspace\\Biblioteca\\Estudantes\\";
		String resultado = "Arquivo salvo!";
		String content = aluno.toString();
		try {
			FileWriter file = new FileWriter(local+"Aluno_"+aluno.getMatricula());
			file.write(content);
			file.close();
		} catch (Exception erro) {
			return resultado = "Falha ao salvar!";
		}
		return resultado;
	}

}
