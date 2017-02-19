package altaqias.ragatanga.apiclient.control;

import com.google.gson.JsonSyntaxException;

import altaqias.ragatanga.apiclient.config.Conexao;
import altaqias.ragatanga.apiclient.services.QuestServicos;
import altaqias.ragatanga.apiclient.utils.ServicosUtils;
import altaqias.ragatanga.to.QuestUltimasResponse;

public class QuestController {
	
	public static QuestUltimasResponse ultimas() throws JsonSyntaxException {
		Conexao conexao = new Conexao();
		QuestUltimasResponse response = QuestServicos.ultimas(conexao.getHttpsAtivado(), conexao.getEnderecoIp(), conexao.getPorta(), ServicosUtils.HTTP_METODO_GET, new String());
		return response;
	}
}
