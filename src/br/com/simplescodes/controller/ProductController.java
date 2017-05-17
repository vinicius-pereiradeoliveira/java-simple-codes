package br.com.simplescodes.controller;

import java.util.ArrayList;
import java.util.Map;

import com.google.gson.Gson;

import br.com.simplecodes.service.ProductService;

public class ProductController {

		public void updatePriceProduct(Double percent){
			
			System.out.println("===>>> CHAMA METODO DADOS (HASHMAP) DE PRODUTOS <<<===");
			ProductService productService = new ProductService();
			Map<Double, ArrayList<Double>> mapPrices = productService.findProductsForUpdatePrice(percent);
			
			String json = new Gson().toJson(mapPrices);
			System.out.println( "JSON destes Produtos com valor, e array de valor com desconto e com reajuste!" );
			System.out.println( json );
		}
	
}
