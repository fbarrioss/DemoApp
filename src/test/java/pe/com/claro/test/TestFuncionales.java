package pe.com.claro.test;


import com.thoughtworks.selenium.Selenium;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.net.URL;
import java.util.regex.Pattern;
import static org.apache.commons.lang3.StringUtils.join;

public class TestFuncionales {
	private Selenium selenium;
	

	@Before
	public void setUp() throws Exception {
		//agregado
		String nodeURL="http://192.168.199.1:3333/wd/hub";
		DesiredCapabilities capa= DesiredCapabilities.firefox();
		capa.setBrowserName("chrome");
		capa.setPlatform(Platform.WIN10);
		WebDriver driver = new RemoteWebDriver(new URL(nodeURL),capa);
		//retirado
		//WebDriver driver = new FirefoxDriver();
		String baseUrl = "http://localhost:8080/DemoApp/index.jsp";
		selenium = new WebDriverBackedSelenium(driver, baseUrl);
	}

	@Test
	public void CUabrirLink() throws Exception {
		selenium.open("http://localhost:8080/DemoApp/index.jsp");
		assertEquals("Test Funcionales", selenium.getTitle());
		selenium.click("link=Controlador get");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}

