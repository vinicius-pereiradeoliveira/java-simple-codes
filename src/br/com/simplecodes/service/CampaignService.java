package br.com.simplecodes.service;

import java.util.ArrayList;

import br.com.simplecodes.dao.CampaignDAO;
import br.com.simplecodes.model.Campaign;

public class CampaignService {
	
	// method of service class make call for DAO and response for Controller with information about campagnes.
	public ArrayList<Campaign> searchCampaign(){
		CampaignDAO cdao = new CampaignDAO();
		return cdao.campaign();
	}
	
}
