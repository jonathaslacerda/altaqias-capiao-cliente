package altaqias.ragatanga.apiclient.exception;


@SuppressWarnings("serial")
public class ArgumentosInvalidosException extends GenericException{

	public ArgumentosInvalidosException() {
		super(Mensagem.COD_ARGUMENTOS_INVALIDOS, Mensagem.MSG_ARGUMENTOS_INVALIDOS);
	}
	
	public Mensagem getMensagem(){
		return super.getMensagem();
	}
}
