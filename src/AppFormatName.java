import br.com.simplecodes.service.FormatService;

public class AppFormatName {

	public static void main(String[] args) {
		String inputName = "Vinicius Pereira Oliveira da Silva Ramos";
		// Chama metodo para abreviar String de nome
		FormatService formatService = new FormatService();
		System.out.println(formatService.formatName(inputName));
	}

}
