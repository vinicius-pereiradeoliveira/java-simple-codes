package br.com.simplecodes.dao;

import java.util.ArrayList;

import br.com.simplecodes.model.Campaign;

public class CampaignDAO {
	
	public ArrayList<Campaign> campaign(){
		
		ArrayList<Campaign> cm = new ArrayList<Campaign>(); // variable of return
		
		// call methods of others DAO for create new Campaign Object. Campaign Object use attributes of others DAO's. 
		CompanyDAO comp = new CompanyDAO();
		ProductDAO pd = new ProductDAO();
		
		comp.findOneCompany();
		pd.findOneProduct();
		
		Campaign ca = new Campaign(456L, "Ofertas", comp.company().get(1) , pd.products());
		Campaign ca2 = new Campaign(457L, "Ofertas Carnes", comp.company().get(1), pd.products());
		
		cm.add(ca);
		cm.add(ca2);
		
		return cm;
	}
	
}
