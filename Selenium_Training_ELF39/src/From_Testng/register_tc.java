package From_Testng;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	  class register_tc {
		@Test

		public void Dws() {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://demowebshop.tricentis.com/");
			driver.manage().window().maximize();
			
			driver.findElement(By.linkText("Register")).click();
					driver.findElement(By.id("gender-male")).click();
				driver.findElement(By.id("FirstName")).sendKeys("Pramod");
				driver.findElement(By.id("LastName")).sendKeys("Raj");
				driver.findElement(By.name("Email")).sendKeys("pramod001@gmail.com");
					driver.findElement(By.cssSelector("input[class='text-box single-line password']")).sendKeys("Raj#123");
					driver.findElement(By.id("ConfirmPassword")).sendKeys("Raj#123");
					driver.findElement(By.id("register-button")).click();
					
							driver.close();
		}
	}



