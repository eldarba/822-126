package app.core.dao.company;

import org.springframework.stereotype.Component;

@Component
public class CompanyDao {

	public void addCompany(int id, String name) throws RuntimeException {
		System.out.println("company added");
	}

	public void sayHello() {
		System.out.println("hello from CompanyDao");
	}

}
