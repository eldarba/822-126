package core.dao.db;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import core.beans.Company;
import core.dao.CompanyDao;
import core.exceptions.CouponSystemException;

public class CompanyDaoDb implements CompanyDao {

	/**
	 * update all fields of the specified company according to the company id
	 * 
	 * @throws CouponSystemException
	 */
	@Override
	public void updateCompany(Connection con, Company company) throws CouponSystemException {
		String sql = "aaa";
		try {
			Statement stmt = con.createStatement();
		} catch (SQLException e) {
			throw new CouponSystemException("updateCompany failed", e);
		}

	}

	/**
	 * get company of the specified id
	 */
	@Override
	public Company getCompany(Connection con, int id) {
		return null;
	}

}
