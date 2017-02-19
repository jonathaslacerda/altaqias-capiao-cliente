package altaqias.ragatanga.apiclient.config;

import lombok.Getter;
import lombok.Setter;

public class Conexao {

	@Getter @Setter
	Boolean httpsAtivado;
	
	@Getter @Setter
	String enderecoIp;
	
	@Getter @Setter
	String porta;
	
	@Getter @Setter
	int metodoHttp;

	public Conexao() {
		super();
		this.httpsAtivado = false;
//		this.enderecoIp = "localhost";
		this.enderecoIp = "192.168.1.112";
		this.porta = "8080";
		this.metodoHttp = 0;
	}

	@Override
	public String toString() {
		return "Conexao [httpsAtivado=" + httpsAtivado + ", enderecoIp="
				+ enderecoIp + ", porta=" + porta + ", metodoHttp="
				+ metodoHttp + "]";
	}
}
