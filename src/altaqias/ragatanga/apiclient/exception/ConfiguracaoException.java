package altaqias.ragatanga.apiclient.exception;

import java.text.MessageFormat;

@SuppressWarnings("serial")
public class ConfiguracaoException extends GenericException{
	
	public static final String MSG_ARQUIVO_CONFIG_INEXISTENTE = "ARQUIVO \"configSNRSSD.properties\" NAO FOI ENCONTRADO";
	public static final String MSG_ARQUIVO_CONFIG_ERRO_LEITURA = "ERRO LENDO ARQUIVO \"configSNRSSD.properties\"."; 

	public ConfiguracaoException(String mensagem) {
		super(Mensagem.COD_CONFIGURACAO_EXCEPTION, MessageFormat.format(Mensagem.MSG_CONFIGURACAO_EXCEPTION, mensagem));
	}
	
	public Mensagem getMensagem(){
		return super.getMensagem();
	}
}
