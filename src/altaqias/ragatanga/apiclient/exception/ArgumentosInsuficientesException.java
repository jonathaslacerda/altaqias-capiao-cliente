package altaqias.ragatanga.apiclient.exception;


@SuppressWarnings("serial")
public class ArgumentosInsuficientesException extends GenericException {

	public ArgumentosInsuficientesException() {
		super(Mensagem.COD_ARGUMENTOS_INSUFICIENTES, Mensagem.MSG_ARGUMENTOS_INSUFICIENTES);
	}
	
	public Mensagem getMensagem(){
		return super.getMensagem();
	}
}
