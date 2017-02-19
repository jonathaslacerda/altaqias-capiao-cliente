package altaqias.ragatanga.apiclient.services;

import com.google.gson.Gson;

import altaqias.ragatanga.apiclient.utils.ConnectionUtils;
import altaqias.ragatanga.apiclient.utils.ServicosUtils;
import altaqias.ragatanga.to.QuestCriarResponse;
import altaqias.ragatanga.to.QuestEntrarResponse;
import altaqias.ragatanga.to.QuestUltimasResponse;

public class QuestServicos {

	public static QuestCriarResponse criar(boolean https, String ip, String porta, int metodo, String json){
		QuestCriarResponse response = new Gson().fromJson(ConnectionUtils.sendRequest(ConnectionUtils.getConnection(https, ip, porta, ServicosUtils.URL_QUEST_CRIAR, metodo), json), QuestCriarResponse.class);
		return response;
	}

	public static QuestUltimasResponse ultimas(boolean https, String ip, String porta, int metodo, String json){
		QuestUltimasResponse response = new Gson().fromJson(ConnectionUtils.sendRequest(ConnectionUtils.getConnection(https, ip, porta, ServicosUtils.URL_QUEST_ULTIMAS, metodo), json), QuestUltimasResponse.class);
		return response;
	}

	public static QuestEntrarResponse entrar(boolean https, String ip, String porta, int metodo, String json) {
		QuestEntrarResponse response = new Gson().fromJson(ConnectionUtils.sendRequest(ConnectionUtils.getConnection(https, ip, porta, ServicosUtils.URL_QUEST_ENTRAR, metodo), json), QuestEntrarResponse.class);
		return response;
	}
}
