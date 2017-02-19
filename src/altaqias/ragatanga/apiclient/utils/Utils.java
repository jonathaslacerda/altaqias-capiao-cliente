package altaqias.ragatanga.apiclient.utils;

import org.apache.commons.lang3.StringUtils;

public class Utils {
	
	public static final String FORMATO_NOME_ARQUIVO_SELO = "yyyyMMddHHmmss";
	
	public static String trata(String passa) {
		passa = passa.replaceAll("[�����]", "A");
		passa = passa.replaceAll("[�����]", "a");
		passa = passa.replaceAll("[����]", "E");
		passa = passa.replaceAll("[����]", "e");
		passa = passa.replaceAll("[����]", "I");
		passa = passa.replaceAll("[����]", "i");
		passa = passa.replaceAll("[�����]", "O");
		passa = passa.replaceAll("[�����]", "o");
		passa = passa.replaceAll("[����]", "U");
		passa = passa.replaceAll("[����]", "u");
		passa = passa.replaceAll("�", "C");
		passa = passa.replaceAll("�", "c");
		passa = passa.replaceAll("[��]", "y");
		passa = passa.replaceAll("�", "Y");
		passa = passa.replaceAll("�", "n");
		passa = passa.replaceAll("�", "N");
		passa = passa.replaceAll("['<>\\|/]", "");
		passa = passa.replaceAll("[^a-zA-Z0-9 ]", "");
		return passa.toUpperCase();
	}
    
    public static String preencherComEspacos(String valor, int tamanho){
    	return StringUtils.rightPad(valor, tamanho);
    }

	public static String getFileToPath(String path) {
		String[] pathSplit = path.split("\\\\");
		String file = pathSplit[pathSplit.length -1];
		return file;
	}
}
