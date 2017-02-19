package altaqias.ragatanga.apiclient.exception;

import lombok.Getter;
import lombok.Setter;

public class Mensagem {

	public static final String COD_SUCESSO = "00";
	public static final String MSG_SUCESSO = "SUCESSO";
	
	public static final String COD_CONFIGURACAO_EXCEPTION = "90";
	public static final String MSG_CONFIGURACAO_EXCEPTION = "FALHA DE CONFIGURACAO: \"{0}\"";
	public static final String COD_ARGUMENTOS_INSUFICIENTES = "91";
	public static final String MSG_ARGUMENTOS_INSUFICIENTES = "OS ARGUMENTOS INFORMADOS SAO INSUFICIENTES";
	public static final String COD_ARGUMENTOS_INVALIDOS = "92";
	public static final String MSG_ARGUMENTOS_INVALIDOS = "OS ARGUMENTOS INFORMADOS SAO INVALIDOS";
	public static final String COD_METODO_INVALIDO = "93";
	public static final String MSG_METODO_INVALIDO = "O METODO INFORMADO \"{0}\" NAO EXISTE";
	public static final String COD_PARAMETRO_NAO_ENCONTRADO = "94";
	public static final String MSG_PARAMETRO_NAO_ENCONTRADO = "O PARAMETRO \"{0}\" NAO FOI ENCONTRADO";
	public static final String COD_ERRO_CONEXAO_WEB_SERVICE = "95";
	public static final String MSG_ERRO_CONEXAO_WEB_SERVICE = "ERRO AO ESTABELECER CONEXAO COM O WEBSERVICE";
	
	@Getter @Setter
	private String cod;
	@Getter @Setter
	private String msg;
	
	public Mensagem(){
		this.cod = Mensagem.COD_SUCESSO;
		this.msg = Mensagem.MSG_SUCESSO;
	}
	
	public Mensagem(String cod, String msg){
		this.cod = cod;
		this.msg = msg;
	}
	
	public String getMensagem(){
		return this.cod + this.msg;
	}
	

}
