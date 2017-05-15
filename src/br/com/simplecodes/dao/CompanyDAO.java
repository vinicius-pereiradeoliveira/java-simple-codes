package br.com.simplecodes.dao;

import java.util.ArrayList;

import br.com.simplecodes.model.Company;

public class CompanyDAO {
	
	// ArrayList method that find all companys
	public ArrayList<Company> company() {
		
		ArrayList<Company> c = new ArrayList<Company>(); // variable of return.
		
		// instance new object Company. No arguments in Company() because the constructor of the class not have 
		// constructor
		Company c1 = new Company();
		
		c1.setId(234L);
		c1.setNameCompany("MERCADO X");
		c1.setCnpj("1234567898");
		c1.setAddress("Rua Xyz");
		c1.setBranch("SIM");
		
		// new object Company()
		// Se o model de Company tivesse construtor igual ao model Product, poderíamos instanciar conforme exemplo abaixo:
		// Ex:. Company c2 = new Company(235L, "MERCADo Y", "12355665", "Rua CCC", "NAO");
		Company c2 = new Company();
		
		c2.setId(235L);
		c2.setNameCompany("MERCADO Y");
		c2.setCnpj("1234564545");
		c2.setAddress("Rua bbc");
		c2.setBranch("NAO");
		
		c.add(c1);
		c.add(c2);
		
		return c;
	}
	
	// method return one Company object.
	public Company findOneCompany(){
		Company c1 = new Company();

		c1.setId(234L);
		c1.setNameCompany("MERCADO X");
		c1.setCnpj("1234567898");
		c1.setAddress("Rua Xyz");
		c1.setBranch("SIM");
		
		return c1;
	}
	
}
