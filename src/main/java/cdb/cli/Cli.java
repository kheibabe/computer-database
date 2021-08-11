package cdb.cli;

import java.util.List;

import cdb.controller.CompanyController;
import cdb.model.Company;

public class Cli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CompanyController c = new CompanyController();
List <Company> listCompany =  c.getAllCompany();
	}

}
