package testng_basics;

import org.testng.annotations.Test;

public class Workingclass {
	@Test (groups = "smoke testing")
	public void Search() {
		System.out.println("EX Login");
	}
	@Test
	public void wishlist() {
		System.out.println("EX wishlist");
	}
	@Test
	public void logout() {
		System.out.println("EX logout");
	}
	@Test (groups = "smoke testing")
	public void Register() {
		System.out.println("EX Register");
	}
}
