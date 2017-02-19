package altaqias.ragatanga.apiclient.utils;

import org.apache.commons.lang3.StringUtils;

public class Utils {
	
	public static final String FORMATO_NOME_ARQUIVO_SELO = "yyyyMMddHHmmss";
	
	public static String trata(String passa) {
		passa = passa.replaceAll("[ÂÀÁÄÃ]", "A");
		passa = passa.replaceAll("[âãàáä]", "a");
		passa = passa.replaceAll("[ÊÈÉË]", "E");
		passa = passa.replaceAll("[êèéë]", "e");
		passa = passa.replaceAll("[ÎÍÌÏ]", "I");
		passa = passa.replaceAll("[îíìï]", "i");
		passa = passa.replaceAll("[ÔÕÒÓÖ]", "O");
		passa = passa.replaceAll("[ôõòóö]", "o");
		passa = passa.replaceAll("[ÛÙÚÜ]", "U");
		passa = passa.replaceAll("[ûúùü]", "u");
		passa = passa.replaceAll("Ç", "C");
		passa = passa.replaceAll("ç", "c");
		passa = passa.replaceAll("[ıÿ]", "y");
		passa = passa.replaceAll("İ", "Y");
		passa = passa.replaceAll("ñ", "n");
		passa = passa.replaceAll("Ñ", "N");
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
