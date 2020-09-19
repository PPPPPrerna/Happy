package quick.FramesTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FrmTest {

	@Test
	
	public void tcs() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dr Pramod Pandey\\Desktop\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		Actions a = new Actions(driver);
		
		WebElement s= driver.findElement(By.id("draggable"));
		
		WebElement t = driver.findElement(By.id("droppable"));
		
		a.dragAndDrop(s, t).build().perform();
		
		
		
	}
}
