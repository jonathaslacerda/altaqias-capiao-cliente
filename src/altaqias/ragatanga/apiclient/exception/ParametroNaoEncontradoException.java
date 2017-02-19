package altaqias.ragatanga.apiclient.exception;

import java.text.MessageFormat;

@SuppressWarnings("serial")
public class ParametroNaoEncontradoException extends GenericException{

	public ParametroNaoEncontradoException(String parametro) {
		super(Mensagem.COD_PARAMETRO_NAO_ENCONTRADO, MessageFormat.format(Mensagem.MSG_PARAMETRO_NAO_ENCONTRADO, parametro));
	}
	
	public Mensagem getMensagem(){
		return super.getMensagem();
	}
}
