package pe.com.claro.test;


import com.thoughtworks.selenium.Selenium;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;
import static org.apache.commons.lang3.StringUtils.join;

public class TestFuncionales {
	private Selenium selenium;
	
	@Test
	public void CUcomparar() throws Exception {
		// Do nothing
	}

/*	@Before
	public void setUp() throws Exception {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "http://localhost:8080/DemoApp/index.jsp";
		selenium = new WebDriverBackedSelenium(driver, baseUrl);
	}

	@Test
	public void CUabrirLink() throws Exception {
		selenium.open("http://localhost:8080/DemoApp/index.jsp");
		assertEquals("", selenium.getTitle());
		selenium.click("link=Controlador get");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}*/
}

