package altaqias.ragatanga.apiclient.services;

import com.google.gson.Gson;

import altaqias.ragatanga.apiclient.utils.ConnectionUtils;
import altaqias.ragatanga.apiclient.utils.ServicosUtils;
import altaqias.ragatanga.to.QuestUltimasResponse;

public class QuestServicos {

	public static QuestUltimasResponse ultimas(boolean https, String ip, String porta, int metodo, String json){
		QuestUltimasResponse response = new Gson().fromJson(ConnectionUtils.sendRequest(ConnectionUtils.getConnection(https, ip, porta, ServicosUtils.URL_QUEST_ULTIMAS, metodo), json), QuestUltimasResponse.class);
		return response;
	}
}
