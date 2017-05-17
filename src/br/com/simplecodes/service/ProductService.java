package br.com.simplecodes.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import br.com.simplecodes.dao.ProductDAO;

public class ProductService {
	
	/* 
	 * Este metodo recebe com parametro a porcentagem de c�lculo.
	 * Ex:. Caso receba da Controller 10, vai acrescentar 10% ao valor original e vai tamb�m retirar 10% do valor.
	 * Fluxo deste metodo:
	 *  - Cria variavel Map para guardar chave (valor original) e valor (valor recalculado) e devolver ao controller.
	 *  - Instancia Objeto ProductDAO para acessar metodos deste objeto/classe!
	 *  - Cria variavel de tipo Double que recebe do objeto ProductDAO o pre�o de um produto.
	 *  - Joga na variavel Map criada, o valor obtido na chamada do metodo interno calc()
	 *    - metodo calc() faz o calculo de porcentagem, novo valor com acr�scimo e novo valor com desconto.
	 *  - retorna o Map com valor original, valor com desconto e valor com acr�scimo    
	 */
	public Map<Double, ArrayList<Double>> findProductsForUpdatePrice(Double percent) {
		Map<Double, ArrayList<Double>> prices = new HashMap<Double, ArrayList<Double>>();
		
		ProductDAO product = new ProductDAO(); 
		Double value = product.findOneProduct().getPrice();
		 
		prices = calc(value, percent);
		return prices;
	}
	
	/*
	 * Este metodo � do tipo Map<Double, ArrayList<Double>> pelos motivos abaixo:
	 * - Um HashMap n�o insere na sua lista de Chave e Valor, valores repetidos!
	 * - Como o valor original (Chave do Map) sempre � o mesmo, o que varia � o valor calculado (Valor do Map)
	 *   Criei um map que recebe o valor original como chave �nica que n�o muda, e no valor do Hash inseri um ArrayList com os valores 
	 *   que se modificam conforme c�lculos de porcentagem.   
	 */
	private Map<Double, ArrayList<Double>> calc(Double value, Double percent){
		Map<Double, ArrayList<Double>> hash = new HashMap<Double, ArrayList<Double>>();
		ArrayList<Double> newPrices = new ArrayList<Double>();
		
		Double baseCalc = (value * percent)/100;
		Double newValueDown = value - baseCalc;
		Double newValueUp = value + baseCalc;
		
		newPrices.add(newValueDown);
		newPrices.add(newValueUp);
		
		hash.put(value, newPrices);
		
		return hash;
	}
	
}
