package altaqias.ragatanga.apiclient.exception;

import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("serial")
public class GenericException extends Exception {
	
	@Getter @Setter
	private Mensagem mensagem;
	
	public GenericException(String cod, String msg) {
		super(cod + "-" + msg);
		this.setMensagem(new Mensagem());
		this.mensagem.setCod(cod);
		this.mensagem.setMsg(msg);
	}
}
