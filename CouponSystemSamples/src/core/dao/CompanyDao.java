package core.dao;

import java.sql.Connection;

import core.beans.Company;
import core.exceptions.CouponSystemException;

public interface CompanyDao {

	Company getCompany(Connection con, int id);

	void updateCompany(Connection con, Company company) throws CouponSystemException;

}
