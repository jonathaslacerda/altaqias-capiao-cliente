package altaqias.ragatanga.apiclient.control;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import altaqias.ragatanga.apiclient.config.Conexao;
import altaqias.ragatanga.apiclient.services.ClienteServicos;
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
		ClienteAutenticarResponse response = ClienteServicos.autenticar(conexao.getHttpsAtivado(), conexao.getEnderecoIp(), conexao.getPorta(), 0, json);
		return response;
	}
	
	public static ClienteCadastrarResponse cadastrar(Cliente cliente) throws JsonSyntaxException {
		Conexao conexao = new Conexao();
		ClienteCadastrarRequest request = new ClienteCadastrarRequest();
		request.setCliente(cliente);
		String json = new Gson().toJson(request);
		ClienteCadastrarResponse response = ClienteServicos.cadastrar(conexao.getHttpsAtivado(), conexao.getEnderecoIp(), conexao.getPorta(), 1, json);
		return response;
	}
	
	public static void main(String[] args) {
		try {
//			Cliente cliente = new Cliente();
//			cliente.setDocumento("05900547404");
//			cliente.setEmail("jonathassl4@gmail.com");
//			cliente.setNome("Jonathas Santos de Lacerda");
//			cliente.setSenha("10321165");
//			cliente.setTelefone("83996541508");
//			cliente.setIdiomas("Portugues, Ingles, Espanhol");
//			ClienteCadastrarResponse response2 = ClienteController.cadastrar(cliente);
//			System.out.println(response2.getCliente().getId());

			ClienteAutenticarResponse response = ClienteController.autenticar("jonathassl@gmail.com", "10321165");
			System.out.println(response.getCliente().getNome());

		} catch (JsonSyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
