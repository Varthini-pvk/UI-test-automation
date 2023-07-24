package selenium_test;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.function.Predicate;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.chrome.ChromeDriver;


public class BiDi_api {
	
	@Test
	public void launch() throws URISyntaxException
	{
	
	ChromeDriver driver = new ChromeDriver();
	((HasAuthentication) driver)
  	.register(() -> new UsernameAndPassword("admin", "admin"));
	
	driver.get("https://the-internet.herokuapp.com/");
	driver.findElement(By.linkText("Basic Auth")).click();

    String body = driver.findElement(By.tagName("body")).getText();
   System.out.println(body);

    driver.quit();
	}

}
