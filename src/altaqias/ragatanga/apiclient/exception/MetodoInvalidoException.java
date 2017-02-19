package altaqias.ragatanga.apiclient.exception;

import java.text.MessageFormat;

@SuppressWarnings("serial")
public class MetodoInvalidoException extends GenericException {

	public MetodoInvalidoException(String nomeMetodo) {
		super(Mensagem.COD_METODO_INVALIDO, MessageFormat.format(Mensagem.MSG_METODO_INVALIDO, nomeMetodo));
	}
	
	public Mensagem getMensagem(){
		return super.getMensagem();
	}
}
