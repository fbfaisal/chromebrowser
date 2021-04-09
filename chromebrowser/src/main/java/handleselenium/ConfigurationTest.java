package handleselenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ConfigurationTest {
	
	@Test
	public void testconfig() throws Exception {
		
		File src=new File("./Configuration/config.property");
		
		FileInputStream fis=new FileInputStream(src);
		
		Properties pro=new Properties();
		
		pro.load(fis);
		
		String Chromepath=pro.getProperty("ChromeDriver");
		
		System.out.println(Chromepath);
		
	}
	

}
