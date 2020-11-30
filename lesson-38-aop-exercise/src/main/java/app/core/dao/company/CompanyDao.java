package app.core.dao.company;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.core.login.LoginManager;

@Component
public class CompanyDao {

	private Map<Long, Company> map = new HashMap<Long, Company>();
	@Autowired
	private LoginManager loginManager;

	public void addCompany(Company company) {
		map.put(company.getId(), company);
		System.out.println("company added");
	}

	public Company getCompany(Long id) {
		return map.get(id);
	}

	public Collection<Company> getAllCompanies() {
		return map.values();
	}

	public boolean deleteCompany(Long id) {
		return map.remove(id) != null;
	}

	public LoginManager getLoginManager() {
		return loginManager;
	}

}
