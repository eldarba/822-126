package b.model;

// DAO - Data Access Object
public interface PersonDAO {

	void saveStatement(Person person);

	void savePreparedStatement(Person person);

	Person find(int id);

	void update(Person person);

	void delete(int id);

}
