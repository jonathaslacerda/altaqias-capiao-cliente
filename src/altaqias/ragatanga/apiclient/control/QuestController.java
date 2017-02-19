package altaqias.ragatanga.apiclient.control;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import altaqias.ragatanga.apiclient.config.Conexao;
import altaqias.ragatanga.apiclient.services.QuestServicos;
import altaqias.ragatanga.apiclient.utils.ServicosUtils;
import altaqias.ragatanga.model.Quest;
import altaqias.ragatanga.to.QuestCriarRequest;
import altaqias.ragatanga.to.QuestCriarResponse;
import altaqias.ragatanga.to.QuestEntrarRequest;
import altaqias.ragatanga.to.QuestEntrarResponse;
import altaqias.ragatanga.to.QuestUltimasResponse;

public class QuestController {
	
	public static QuestUltimasResponse ultimas() throws JsonSyntaxException {
		Conexao conexao = new Conexao();
		QuestUltimasResponse response = QuestServicos.ultimas(conexao.getHttpsAtivado(), conexao.getEnderecoIp(), conexao.getPorta(), ServicosUtils.HTTP_METODO_POST, new String());
		return response;
	}
	
	public static QuestCriarResponse criar(Quest quest) throws JsonSyntaxException {
		Conexao conexao = new Conexao();
		QuestCriarRequest request = new QuestCriarRequest();
		request.setQuest(quest);
		String json = new Gson().toJson(request);
		QuestCriarResponse response = QuestServicos.criar(conexao.getHttpsAtivado(), conexao.getEnderecoIp(), conexao.getPorta(), ServicosUtils.HTTP_METODO_POST, json);
		return response;
	}
	
	public static QuestEntrarResponse entrar(Integer clienteId, Integer questId) throws JsonSyntaxException {
		Conexao conexao = new Conexao();
		QuestEntrarRequest request = new QuestEntrarRequest();
		request.setIdCliente(clienteId);
		request.setIdQuest(questId);
		String json = new Gson().toJson(request);
		QuestEntrarResponse response = QuestServicos.entrar(conexao.getHttpsAtivado(), conexao.getEnderecoIp(), conexao.getPorta(), ServicosUtils.HTTP_METODO_POST, json);
		return response;
	}
}
