package testng_basics;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
@DataProvider(name="TestData")
public Object[][] testdata(){
	Object[][] data=new Object[5][2];
	data[0][0]="Raghu";
	data[0][1]="Kashyap";
	data[1][0]="virat";
	data[1][1]="kohli";
	data[2][0]="neymar";
	data[2][1]="jr";
	data[3][0]="leo";
	data[3][1]="messi";
	data[4][0]="cristiano";
	data[4][1]="ronaldo";
	
	
	return data;
}
@Test(dataProvider="TestData")
public void testdatademo(String FirstName,String LastName) {
	System.out.println(FirstName);
	System.out.println(LastName);
	
}
}