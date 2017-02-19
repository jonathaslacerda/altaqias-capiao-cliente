package altaqias.ragatanga.apiclient.exception;


@SuppressWarnings("serial")
public class FalhaSolicitacaoException extends GenericException {

	public FalhaSolicitacaoException(String codigo, String mensagem) {
		super(codigo, mensagem);
	}

	public Mensagem getMensagem(){
		return super.getMensagem();
	}
}
