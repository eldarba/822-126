package core.facade;

import java.sql.Connection;
import java.sql.SQLException;

import core.beans.Company;
import core.dao.CompanyDao;
import core.dao.db.CompanyDaoDb;

public class AdminFacade {
	// facades needs to have access to all dao objects
	private CompanyDao companyDao = new CompanyDaoDb();

	public void updateCompany(Company company) {
		Connection con = null;
		try {
			// start transaction
			con.setAutoCommit(false); // cages to databse will be temporary
			// get the system company that needs to be updated
			Company systemCompany = companyDao.getCompany(con, company.getId());
			// update email and password only (not the company name or id)
			systemCompany.setEmail(company.getEmail());
			systemCompany.setPassword(company.getPassword());
			// send the updated object to the database
			companyDao.updateCompany(con, systemCompany);
			// commit the database changes
			con.commit();
			// end transaction
		} catch (SQLException e) {
			try {
				con.rollback(); // cancel all temporary changes
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			// return connection to pool
		}
	}

}
