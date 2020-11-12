package core.dao.db;

import java.sql.Connection;

import core.beans.Company;
import core.dao.CompanyDao;

public class CompanyDaoDb implements CompanyDao {

	/**
	 * update all fields of the specified company according to the company id
	 */
	@Override
	public void updateCompany(Connection con, Company company) {
		// TODO Auto-generated method stub

	}

	/**
	 * get company of the specified id
	 */
	@Override
	public Company getCompany(Connection con, int id) {
		return null;
	}

}
