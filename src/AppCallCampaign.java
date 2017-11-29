import br.com.simplescodes.controller.CampaignController;
import br.com.simplescodes.controller.ProductController;


public class AppCallCampaign {

	public static void main(String[] args) {
		CampaignController campaignControl = new CampaignController();
		ProductController productControl = new ProductController();
		
		campaignControl.callCampaign();
		productControl.updatePriceProduct(10.0);
	}
}
