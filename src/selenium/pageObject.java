package selenium;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;


public class pageObject {
static public WebDriver driver;
static public List<WebElement>  custumerBooks;
static public List<WebElement> nextButton;
static public List <WebElement> countPage;
static public WebElement cookie;
static public List<WebElement> imgs;
static public WebElement allbooks;



@BeforeClass
static public void before() throws InterruptedException {
	System.setProperty("webdriver.edge.driver","C:\\Users\\yakov\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.lupa.co.il/customer_books/");
	Thread.sleep(5000);
	cookie=driver.findElement(By.xpath("//*[@id='Layer_1']"));
	 JavascriptExecutor jse =(JavascriptExecutor)driver;
	 jse.executeScript("window.scrollBy(0,8000)", "");
	 Thread.sleep(1500);
	 allbooks=driver.findElement(By.id("all-books"));
	custumerBooks=driver.findElements(By.xpath("//a[@class='costumer_book_name underline underline--dark-green']"));
	nextButton=driver.findElements(By.xpath("//div[@id='pf-prev']//img[@alt='דפדוף קדימה' and @class='pageflip-controls--not-hover']"));
	countPage=driver.findElements(By.xpath("//div[@class='pages']//span[@class='pages__num']"));
	imgs=driver.findElements(By.xpath("//img[@class='boutiq_img']"));
 }

@Test
public void test1() throws InterruptedException {
	cookie.click();
	Thread.sleep(2500);
	Actions actions=new Actions(driver);
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", allbooks);
    
		imgs.get(0).click();
		
	
 }

}
