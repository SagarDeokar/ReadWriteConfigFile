import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class writeConfigFile {
	public static void main(String[] args) {
		String baseDirectory = System.getProperty("user.dir");
		File file = new File(baseDirectory + "\\resources\\config2.properties");
		Properties prop = new Properties();
		OutputStream output = null;

		try {

			output = new FileOutputStream(file);

			// set the properties value
			prop.setProperty("dbuser", "Sagar");
			prop.setProperty("dbpassword", "Password");
			prop.setProperty("database", "Oracle");

			// save properties to project root folder
			prop.store(output, null);

		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}
}