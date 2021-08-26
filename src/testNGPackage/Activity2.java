package testNGPackage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
public class Activity2 {
	
	public static void main(String args[]) {
		System.out.println("Hello Maven");
		
		
	}
	
	@BeforeMethod
	public void beforeMethod() {
		RestAssured.baseURI="http://jsonplaceholder.typicode.com/";
		given();
	}
	
	@Test
	public void testList() {
		System.out.println("Tests are called");
		when().get("posts/1").then().log().all();	
		Assert.assertEquals("1", "1");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method is called");
	}
	
	
}
