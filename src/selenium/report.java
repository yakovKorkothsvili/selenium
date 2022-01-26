package selenium;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import javax.imageio.ImageIO;

import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
public class report {
	public static WebDriver driver;
	
	
	public void ExtentManager(WebDriver driver){
	this.driver=driver;
	}
	public static ExtentReports extent;
	static ExtentTest test;
	public static ExtentSparkReporter htmlReporter;
	static DateFormat df = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
	static Date today = Calendar.getInstance().getTime();
	static String reportDate = df.format(today);
	public static String filePath = "d:\\"+reportDate+"\\exReport.html";
	
	public static String CaptureScreen() throws AWTException, IOException{
		LocalDateTime now = LocalDateTime.now();
		String time =now.format(DateTimeFormatter.ofPattern("ddHHmmss"));
		String folderPath = ("d:\\"+reportDate);
		String imagePath = folderPath +"/pic" +time +".jpg";
		Robot robot = new Robot();
		return imagePath;

 }
}