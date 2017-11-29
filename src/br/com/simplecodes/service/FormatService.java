package br.com.simplecodes.service;

public class FormatService {

	public String formatName(String inputName) {
		String iniciais = "";
        String[] nomes = inputName.toUpperCase().split(" ");
		for (int i = 0; i <= nomes.length - 1; i++) {
			if (i > 0 && i < nomes.length - 1) {
				iniciais += nomes[i].equals("DOS") || nomes[i].equals("DA") || nomes[i].equals("DO") || nomes[i].equals("DAS")
						|| nomes[i].equals("DI") || nomes[i].equals("DE") ? "".trim() : nomes[i].substring(0, 1) + " ";
			}
		}
        String nomeAbreviado = nomes[0]+" "+iniciais.trim()+" "+nomes[nomes.length - 1];
        return nomeAbreviado;
	}
}
