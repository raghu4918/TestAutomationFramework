package testng_basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Working_wiht_propertyfile {
@Test
public void propertdemo() throws IOException {
	String filepath="./Test_configuration/Testconfiguration.properties";
	FileInputStream fis=new FileInputStream(filepath);
	//creating object for properties class
	Properties prop=new Properties();
	prop.load(fis);
	System.out.println(prop.get("Firstname"));
	System.out.println(prop.get("Lastname"));

	
	
}
}
