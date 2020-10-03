package a;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class AppEnv {

	private static File propertiesFile = new File("resources/application.properties");
	public static final Properties properties = new Properties();

	static {
		try {
			properties.load(new FileReader(propertiesFile));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private AppEnv() {
	}

}
