package readexceldata;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import library.ExcelDataConfig;

public class DataDrivenTest {
	
	WebDriver driver;
	
	@Test(dataProvider="OrangeLive")
	public void DDT(String uname, String upass) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\fbfai\\Desktop\\D\\Drivers\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.findElement(By.id("txtUsername")).sendKeys(uname);
	driver.findElement(By.id("txtPassword")).sendKeys(upass);
	driver.findElement(By.id("btnLogin")).click();
	Thread.sleep(5000);
	
	System.out.println(driver.getTitle());
	
	Assert.assertTrue(driver.getTitle().contains("OrangeHRM"), "invalid credential");
	
	driver.quit();
	
	}
	
	@AfterMethod
	public void teardown() {
		
		driver.quit();
	}
	
	@DataProvider(name="OrangeLive")
	public Object[][] passdata(){
	
	ExcelDataConfig config=new ExcelDataConfig("C:\\Users\\fbfai\\git\\chromebrowser\\chromebrowser\\TestData\\New Microsoft Excel Worksheet.xlsx");
		
	int row=config.getrowcount(0);	
	
	Object[][] data=new Object[row][2];
	
	for(int i=0; i<row;i++) {
		
		data[i][0]=config.getdata(0, i, 0);
		data[i][1]=config.getdata(0, i, 1);
		
		
	}
	return data;	
	}
	
	
	
}


