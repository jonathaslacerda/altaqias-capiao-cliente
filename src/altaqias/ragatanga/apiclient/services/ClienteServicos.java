package altaqias.ragatanga.apiclient.services;

import com.google.gson.Gson;

import altaqias.ragatanga.apiclient.utils.ConnectionUtils;
import altaqias.ragatanga.apiclient.utils.ServicosUtils;
import altaqias.ragatanga.to.ClienteAutenticarResponse;
import altaqias.ragatanga.to.ClienteCadastrarResponse;

public class ClienteServicos {

	public static ClienteAutenticarResponse autenticar(boolean https, String ip, String porta, int metodo, String json){
		ClienteAutenticarResponse response = new Gson().fromJson(ConnectionUtils.sendRequest(ConnectionUtils.getConnection(https, ip, porta, ServicosUtils.URL_CLIENTE_AUTENTICAR, metodo), json), ClienteAutenticarResponse.class);
		return response;
	}
	
	public static ClienteCadastrarResponse cadastrar(boolean https, String ip, String porta, int metodo, String json){
		ClienteCadastrarResponse response = new Gson().fromJson(ConnectionUtils.sendRequest(ConnectionUtils.getConnection(https, ip, porta, ServicosUtils.URL_CLIENTE_CADASTRAR, metodo), json), ClienteCadastrarResponse.class);
		return response;
	}
	
	
}
