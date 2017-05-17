package br.com.simplescodes.controller;

import java.util.ArrayList;

import com.google.gson.Gson;

import br.com.simplecodes.model.Campaign;
import br.com.simplecodes.service.CampaignService;

public class CampaignController {
	
	public void callCampaign(){
		System.out.println("===>>> CHAMA METODO DADOS (ARRAYLIST) DE CAMPANHA <<<===");
		
		CampaignService cs = new CampaignService();
		ArrayList<Campaign> camp = cs.searchCampaign();
		
		for(int i = 0; i <= camp.size()-1; i++){
			// print the object
			System.out.println(camp.get(i));
			// create a variable of instance for get attributes of iteration (i).
			Campaign cp = new Campaign(camp.get(i).getId(), camp.get(i).getName(), camp.get(i).getNameCompany(), camp.get(i).getProduct());
			 
			// print data of list campaign
			System.out.println( cp.getId() );
			System.out.println( cp.getName() );
			System.out.println( cp.getNameCompany() );
			System.out.println( cp.getProduct() );
			
			String json = new Gson().toJson(camp.get(i));
			System.out.println( "JSON desta Campanha:" );
			System.out.println( json );
		}
	}
	
}
