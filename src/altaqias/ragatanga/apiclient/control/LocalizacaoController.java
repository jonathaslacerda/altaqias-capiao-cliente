package altaqias.ragatanga.apiclient.control;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import altaqias.ragatanga.apiclient.config.Conexao;
import altaqias.ragatanga.apiclient.services.LocalizacaoServicos;
import altaqias.ragatanga.apiclient.utils.ServicosUtils;
import altaqias.ragatanga.model.Cidade;
import altaqias.ragatanga.model.Estado;
import altaqias.ragatanga.model.Pais;
import altaqias.ragatanga.to.CidadesPorEstadoRequest;
import altaqias.ragatanga.to.CidadesPorEstadoResponse;
import altaqias.ragatanga.to.DestinosPorCidadeRequest;
import altaqias.ragatanga.to.DestinosPorCidadeResponse;
import altaqias.ragatanga.to.EstadosPorPaisRequest;
import altaqias.ragatanga.to.EstadosPorPaisResponse;
import altaqias.ragatanga.to.PaisesResponse;
import altaqias.ragatanga.to.ServicosResponse;

public class LocalizacaoController {
	public static PaisesResponse paises() throws JsonSyntaxException {
		Conexao conexao = new Conexao();
		PaisesResponse response = LocalizacaoServicos.paises(conexao.getHttpsAtivado(), conexao.getEnderecoIp(), conexao.getPorta(), ServicosUtils.HTTP_METODO_GET, new String());
		return response;
	}
	
	public static EstadosPorPaisResponse estadosPorPais(Pais pais) throws JsonSyntaxException {
		Conexao conexao = new Conexao();
		EstadosPorPaisRequest request = new EstadosPorPaisRequest();
		request.setPais(pais);
		String json = new Gson().toJson(request);
		EstadosPorPaisResponse response = LocalizacaoServicos.estadosPorPais(conexao.getHttpsAtivado(), conexao.getEnderecoIp(), conexao.getPorta(), ServicosUtils.HTTP_METODO_POST, json);
		return response;
	}
	
	public static CidadesPorEstadoResponse cidadesPorEstado(Estado estado) throws JsonSyntaxException {
		Conexao conexao = new Conexao();
		CidadesPorEstadoRequest request = new CidadesPorEstadoRequest();
		request.setEstado(estado);
		String json = new Gson().toJson(request);
		CidadesPorEstadoResponse response = LocalizacaoServicos.cidadesPorEstado(conexao.getHttpsAtivado(), conexao.getEnderecoIp(), conexao.getPorta(), ServicosUtils.HTTP_METODO_POST, json);
		return response;
	}
	
	public static DestinosPorCidadeResponse destinosPorCidade(Cidade cidade) throws JsonSyntaxException {
		Conexao conexao = new Conexao();
		DestinosPorCidadeRequest request = new DestinosPorCidadeRequest();
		request.setCidade(cidade);
		String json = new Gson().toJson(request);
		DestinosPorCidadeResponse response = LocalizacaoServicos.destinosPorCidade(conexao.getHttpsAtivado(), conexao.getEnderecoIp(), conexao.getPorta(), ServicosUtils.HTTP_METODO_POST, json);
		return response;
	}
	
	public static ServicosResponse servicos() throws JsonSyntaxException {
		Conexao conexao = new Conexao();
		ServicosResponse response = LocalizacaoServicos.servicos(conexao.getHttpsAtivado(), conexao.getEnderecoIp(), conexao.getPorta(), ServicosUtils.HTTP_METODO_GET, new String());
		return response;
	}
	
	public static void main(String[] args) {
		try {
			Pais pais = new Pais();
			pais.setId(1);
			pais.setNome("Krakovia");
			EstadosPorPaisResponse response = LocalizacaoController.estadosPorPais(pais);
			System.out.println(response.getEstados().get(0).getNome());
			
		} catch (JsonSyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
