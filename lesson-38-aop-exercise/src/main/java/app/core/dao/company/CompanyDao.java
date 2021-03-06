package app.core.dao.company;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class CompanyDao {

	private Map<Long, Company> map = new HashMap<Long, Company>();

	public void addCompany(Company company) {
		map.put(company.getId(), company);
		System.out.println("company added");
	}

	public Company getCompany(Long id) {
		return map.get(id);
	}

	public Collection<Company> getAllCompanies() {
		if (Math.random() < 0.5) {
			throw new RuntimeException("getAllCompanies failed");
		}
		return map.values();
	}

	public boolean deleteCompany(Long id) {
		return map.remove(id) != null;
	}

}
