package altaqias.ragatanga.apiclient.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public abstract class ConnectionUtils {

	public static final int METODO_POST = 0;
	public static final int METODO_GET = 1;

	public static HttpURLConnection getConnection(boolean https, String ip, String porta, String urlServico, int metodo){
		try {
			String protocolo = "http";

			if(https){
				protocolo = "https";

			}
			URL url = new URL(protocolo + "://" + ip + ":" + porta + "/" + urlServico);
			HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
			conexao.setDoOutput(true);

			switch (metodo) {
			case ConnectionUtils.METODO_GET:
				conexao.setRequestMethod("GET");
				break;

			case ConnectionUtils.METODO_POST:
				conexao.setRequestMethod("POST");
				break;
			}

			conexao.setRequestProperty("Content-Type", "application/json");

			return conexao;


		} catch (MalformedURLException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}
		return null;
	}

	public static String sendRequest(HttpURLConnection conexao, String parametroJson){
		try{
			OutputStream os = conexao.getOutputStream();
			os.write(parametroJson.getBytes());
			os.flush();

			BufferedReader retorno = new BufferedReader(new InputStreamReader(
					(conexao.getInputStream())));

			StringBuilder sb = new StringBuilder();
			String linha;
			while ((linha = retorno.readLine()) != null) {
				sb.append(linha);
			}

			conexao.disconnect();
			return sb.toString();
		}catch(IOException io){
			io.printStackTrace();
		}

		return "";
	}
}
