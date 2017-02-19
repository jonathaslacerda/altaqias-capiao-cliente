package altaqias.ragatanga.apiclient.control;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import altaqias.ragatanga.apiclient.config.Conexao;
import altaqias.ragatanga.apiclient.services.ClienteServicos;
import altaqias.ragatanga.apiclient.utils.ServicosUtils;
import altaqias.ragatanga.model.Cliente;
import altaqias.ragatanga.to.ClienteAutenticarRequest;
import altaqias.ragatanga.to.ClienteAutenticarResponse;
import altaqias.ragatanga.to.ClienteCadastrarRequest;
import altaqias.ragatanga.to.ClienteCadastrarResponse;

public class ClienteController {
	
	public static ClienteAutenticarResponse autenticar(String email, String senha) throws JsonSyntaxException {
		Conexao conexao = new Conexao();
		ClienteAutenticarRequest request = new ClienteAutenticarRequest();
		request.setEmail(email);
		request.setSenha(senha);
		String json = new Gson().toJson(request);
		ClienteAutenticarResponse response = ClienteServicos.autenticar(conexao.getHttpsAtivado(), conexao.getEnderecoIp(), conexao.getPorta(), ServicosUtils.HTTP_METODO_GET, json);
		return response;
	}
	
	public static ClienteCadastrarResponse cadastrar(Cliente cliente) throws JsonSyntaxException {
		Conexao conexao = new Conexao();
		ClienteCadastrarRequest request = new ClienteCadastrarRequest();
		request.setCliente(cliente);
		String json = new Gson().toJson(request);
		ClienteCadastrarResponse response = ClienteServicos.cadastrar(conexao.getHttpsAtivado(), conexao.getEnderecoIp(), conexao.getPorta(), ServicosUtils.HTTP_METODO_POST, json);
		return response;
	}
}
