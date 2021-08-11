package cdb.service;

import java.util.List;

import cdb.model.Company;
import cdb.persistance.CompanyDAO;

public class CompanyService {
	
	private CompanyDAO companyDAO;

	public List<Company> getAllCompany() {
		// TODO Auto-generated method stub
		return companyDAO.getAllCompany();
	}

}
