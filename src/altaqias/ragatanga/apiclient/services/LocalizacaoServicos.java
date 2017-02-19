package altaqias.ragatanga.apiclient.services;

import com.google.gson.Gson;

import altaqias.ragatanga.apiclient.utils.ConnectionUtils;
import altaqias.ragatanga.apiclient.utils.ServicosUtils;
import altaqias.ragatanga.to.CidadesPorEstadoResponse;
import altaqias.ragatanga.to.DestinosPorCidadeResponse;
import altaqias.ragatanga.to.EstadosPorPaisResponse;
import altaqias.ragatanga.to.PaisesResponse;
import altaqias.ragatanga.to.ServicosResponse;

public class LocalizacaoServicos {

	public static PaisesResponse paises(boolean https, String ip, String porta, int metodo, String json){
		PaisesResponse response = new Gson().fromJson(ConnectionUtils.sendRequest(ConnectionUtils.getConnection(https, ip, porta, ServicosUtils.URL_LOCALIZACAO_PAISES, metodo), json), PaisesResponse.class);
		return response;
	}
	
	public static EstadosPorPaisResponse estadosPorPais(boolean https, String ip, String porta, int metodo, String json){
		EstadosPorPaisResponse response = new Gson().fromJson(ConnectionUtils.sendRequest(ConnectionUtils.getConnection(https, ip, porta, ServicosUtils.URL_LOCALIZACAO_ESTADOS_POR_PAIS, metodo), json), EstadosPorPaisResponse.class);
		return response;
	}
	
	public static CidadesPorEstadoResponse cidadesPorEstado(boolean https, String ip, String porta, int metodo, String json){
		CidadesPorEstadoResponse response = new Gson().fromJson(ConnectionUtils.sendRequest(ConnectionUtils.getConnection(https, ip, porta, ServicosUtils.URL_LOCALIZACAO_CIDADES_POR_ESTADO, metodo), json), CidadesPorEstadoResponse.class);
		return response;
	}
	
	public static DestinosPorCidadeResponse destinosPorCidade(boolean https, String ip, String porta, int metodo, String json){
		DestinosPorCidadeResponse response = new Gson().fromJson(ConnectionUtils.sendRequest(ConnectionUtils.getConnection(https, ip, porta, ServicosUtils.URL_LOCALIZACAO_DESTINOS_POR_CIDADE, metodo), json), DestinosPorCidadeResponse.class);
		return response;
	}
	
	public static ServicosResponse servicos(boolean https, String ip, String porta, int metodo, String json){
		ServicosResponse response = new Gson().fromJson(ConnectionUtils.sendRequest(ConnectionUtils.getConnection(https, ip, porta, ServicosUtils.URL_LOCALIZACAO_DESTINOS_POR_CIDADE, metodo), json), ServicosResponse.class);
		return response;
	}
}
