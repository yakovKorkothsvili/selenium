package selenium;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xml {


	public static String getData (String nodeName) throws ParserConfigurationException,
	SAXException, IOException{
	File fXmlFile = new File("C:\\Users\\yakov\\Downloads/configurtion.xml");
	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	Document doc = dBuilder.parse(fXmlFile);
	doc.getDocumentElement().normalize();
	return doc.getElementsByTagName(nodeName).item(0).getTextContent();

}
public WebDriver browser(WebDriver driver, String browser) {
	
	if (browser.equals("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		 driver=new FirefoxDriver();
		
	}
	if (browser.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
	}
	
	return driver;
	
}

}



