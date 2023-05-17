package biblioteca;

import java.io.Serializable;

public class Fotografia extends Obra implements Serializable{
	private static final long serialVersionUID = 1L;
	private boolean visualizarFotografia;
	
	public Fotografia() {
		
	}
	
	public Fotografia(int id, String titulo, String autor, int ano, 
		 int tiposObrasDisponiveis, boolean visualizarFotografia) {
		super(id, titulo, autor, ano, tiposObrasDisponiveis);
		this.visualizarFotografia = visualizarFotografia;
	}

	public boolean isVisualizarFotografia() {
		if(!visualizarFotografia) {
			System.out.println("Imagem não pode ser visualizada. ");
		}else {
			System.out.println("Imagem visualizada. ");
		}
		return visualizarFotografia;
	}

	public void setVisualizarFotografia(boolean visualizarFotografia) {
		this.visualizarFotografia = visualizarFotografia;
	}

	

}
