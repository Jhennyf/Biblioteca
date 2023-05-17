package biblioteca;

import java.io.Serializable;

public class MidiaAudio extends Obra implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int tempAudio;
	
	public MidiaAudio() {
		
	}
	
	public MidiaAudio(int id, String titulo, String autor, int ano, int tiposObrasDisponiveis, int tempAudio) {
		super(id, titulo, autor, ano, tiposObrasDisponiveis);
		this.tempAudio = tempAudio;
	}

	public int getTempAudio() {
		return tempAudio;
	}

	public void setTempAudio(int tempAudio) {
		this.tempAudio = tempAudio;
	}

}
